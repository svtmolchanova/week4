package com.itacademy.molchanova.task1;

import com.itacademy.molchanova.common.model.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class WidthSearchStrategy<T> implements SearchStrategy<T> {

    private static WidthSearchStrategy widthSearchStrategy;

    private WidthSearchStrategy() {};

    public static WidthSearchStrategy getWidthSearchStrategyt() {
        if(isNull(widthSearchStrategy)) {
            widthSearchStrategy = new WidthSearchStrategy();
        }
        return widthSearchStrategy;
    }

    @Override
    public Deque<TreeNode<T>> getNode(TreeNode<T> node) {
        Deque<TreeNode<T>> queue = new LinkedList<>();
        Deque<TreeNode<T>> result = new ArrayDeque<>();
        if (nonNull(node)) {
            queue.add(node);
            TreeNode<T> currentNode;
            while ((currentNode = queue.poll()) != null) {
                result.add(currentNode);
                if (nonNull(currentNode.getLeft())) {
                    queue.add(currentNode.getLeft());
                }
                if (nonNull(currentNode.getRight())) {
                    queue.add(currentNode.getRight());
                }
            }
        }
        return result;
    }
}
