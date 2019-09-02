package com.itacademy.molchanova.task2;

import com.itacademy.molchanova.common.model.TreeNode;
import com.itacademy.molchanova.task1.SearchStrategy;

import java.util.List;
import java.util.Map;

public interface Visitor {

    Map<String, List<Integer>> visitMark(TreeNode<Mark> root, SearchStrategy searchStrategy);
    List<Integer> visitCourse(TreeNode<Course> root, SearchStrategy searchStrategy);
}
