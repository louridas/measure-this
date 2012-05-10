package com.mws.squal.javaparser;

import java.util.Map;
import java.util.TreeMap;

import org.antlr.runtime.tree.Tree;

import com.mws.squal.javaparser.LCOMCalculator.PRIMARYHandler;

/**
 * A calculator for the Response for Class (RFC) metric.
 * 
 * The Response for Class metric counts the number of methods defined
 * outside the class that are called from within the class. Since we are
 * dealing with source code only, we are differentiating method calls by
 * their names and number of arguments (not taking into account the objects
 * on which they are called, since we cannot know their type for sure, or
 * the type of their arguments, for the same reason). Calls to constructors
 * are not included, since these are better reflected in the Coupling 
 * Between Objects (CBO) metric.
 * 
 * The calculator is run over a compilation unit, and it will count
 * the metric for all classes inside the compilation unit. The results
 * are gathered into a Map<String, Integer>, mapping the class name to the
 * LCOM value.
 */

public class RFCCalculator extends GenericProcessor<Map<String, Integer>> {

    private EntityExtractor entityExtractor;
    
    /**
     * True if inside a method, false otherwise.
     */
    private boolean inMethod;
    
    public RFCCalculator(EntityExtractor entityExtractor) {
        super();
        this.entityExtractor = entityExtractor;
        this.results = new TreeMap<String, Integer>();
        addToTable(JavaTreeParser.PRIMARY, new PRIMARYHandler());
    }

    
    private class DEFNHandler extends TokenProcessorSkeleton {

        @Override
        public void goingDown(Tree t) {
            inMethod = true;
        }
        
        @Override
        public void goingUp(Tree t) {
            inMethod = false;
        }
    }
    
    protected class PRIMARYHandler extends TokenProcessorSkeleton {
        
        @Override
        public void goingDown(Tree t) {
            if (!inMethod) {
                return;
            }
            
            String primary = t.getText();
            String[] parts = primary.split("\\.", 2);
            String name = parts[0];
            /* Discard references or calls to super */
            if (name.equals("super")) {
                return;
            }
            /* Get instance variable prefixed with this */
            if (name.equals("this") && parts.length > 1) {
                name = parts[1];
            }
            /* Discard method calls */
            if (name.contains("(")) {
                return;
            }
        }
    }
}
