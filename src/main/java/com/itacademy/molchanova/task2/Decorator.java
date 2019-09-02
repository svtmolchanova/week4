package com.itacademy.molchanova.task2;

import com.itacademy.molchanova.common.model.TreeNode;
import com.itacademy.molchanova.task1.SearchStrategy;

public abstract class Decorator extends Student {

    public abstract void Accept(Visitor visitor, TreeNode treeNode, SearchStrategy searchStrategy);
}
