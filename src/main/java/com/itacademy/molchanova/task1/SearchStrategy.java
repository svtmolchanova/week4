package com.itacademy.molchanova.task1;

import com.itacademy.molchanova.common.model.TreeNode;

import java.util.Deque;
import java.util.Iterator;

public interface SearchStrategy<T> {

    Deque<TreeNode<T>> getNode(TreeNode<T> node);

}
