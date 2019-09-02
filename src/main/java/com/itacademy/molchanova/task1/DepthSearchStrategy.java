package com.itacademy.molchanova.task1;//package com.itacademy.molchanova.task1;

import com.itacademy.molchanova.common.model.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class DepthSearchStrategy<T> implements SearchStrategy<T> {

    private static DepthSearchStrategy depthSearchStrategy;

    private DepthSearchStrategy() {};

    public static DepthSearchStrategy getDepthSearchStrategy() {
        if(isNull(depthSearchStrategy)) {
            depthSearchStrategy = new DepthSearchStrategy();
        }
        return depthSearchStrategy;
    }

    @Override
    public Deque<TreeNode<T>> getNode(TreeNode<T> node) {
        Deque<TreeNode<T>> deque = new ArrayDeque<>();
        Deque<TreeNode<T>> result = new ArrayDeque<>();
        if (nonNull(node)) {
            deque.add(node);
            while (node!=null || !deque.isEmpty()){
                if (!deque.isEmpty()){
                    node=deque.pop();
                }
                while (node!=null){
                    result.add(node);
                    if (node.getRight()!=null) {
                        deque.push(node.getRight());
                    }
                    node=node.getLeft();
                }
            }
        }
        return result;
    }
}
