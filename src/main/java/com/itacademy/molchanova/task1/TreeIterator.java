package com.itacademy.molchanova.task1;

import com.itacademy.molchanova.common.model.TreeNode;
import lombok.NoArgsConstructor;

import java.util.Deque;
import java.util.Iterator;

public class TreeIterator<T> implements Iterator {

    SearchStrategy searchStrategy;

    private TreeNode<T> node;
    private Deque<TreeNode<T>> result;

    public TreeIterator(TreeNode root) {
        this.node = root;
    }

    @Override
    public TreeNode<T> next() {
        TreeNode<T> current = this.result.pollFirst();
        this.node = current;
        return current;
    }

    @Override
    public boolean hasNext() {
        return (result.peek() != null);
    }

    public void setSearchStrategy(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
        getNodeList(this.node);
    }

    public Deque<TreeNode<T>> getNodeList(TreeNode<T> root) {
        Deque<TreeNode<T>> deque = searchStrategy.getNode(root);
        this.result = deque;
        return deque;
    }
}
