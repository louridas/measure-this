package com.mws.squal.javaparser;

import org.antlr.runtime.tree.Tree;


public interface TokenProcessor {
    void goingDown(Tree t);
    void goingUp(Tree t);
}
