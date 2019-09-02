package com.itacademy.molchanova.task2;

import com.itacademy.molchanova.common.model.TreeNode;
import com.itacademy.molchanova.task1.SearchStrategy;
import com.itacademy.molchanova.task1.TreeIterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NodeVisitor implements Visitor{

    @Override
    public List<Integer> visitCourse(TreeNode<Course> root, SearchStrategy searchStrategy) {
        List<Integer> list = new ArrayList<>();
        TreeIterator<Course> iterator = new TreeIterator(root);
        iterator.setSearchStrategy(searchStrategy);
        while (iterator.hasNext()) {
            TreeNode<Course> studentTreeNode = iterator.next();
            list.add(studentTreeNode.getValue().getNumberCourse());
        }
        return list;
    }

    @Override
    public Map<String,List<Integer>> visitMark(TreeNode<Mark> root, SearchStrategy searchStrategy) {
        Map<String, List<Integer>> map = new HashMap<>();
        TreeIterator<Mark> iterator = new TreeIterator(root);
        iterator.setSearchStrategy(searchStrategy);
        while (iterator.hasNext()) {
            TreeNode<Mark> studentTreeNode = iterator.next();
            map.put(studentTreeNode.getValue().getStudent().name, studentTreeNode.getValue().getMarks());
        }
        return map;
    }
}
