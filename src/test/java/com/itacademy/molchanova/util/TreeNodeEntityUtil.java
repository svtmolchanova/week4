package com.itacademy.molchanova.util;

import com.itacademy.molchanova.common.model.TreeNode;
import com.itacademy.molchanova.task2.Course;
import com.itacademy.molchanova.task2.Mark;
import com.itacademy.molchanova.task2.Student;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TreeNodeEntityUtil {

    public static TreeNode<Integer> buildDefaultTree() {
        TreeNode<Integer> root = new TreeNode<>(1);
        root.setLeft(new TreeNode<>(2));
        root.getLeft().setLeft(new TreeNode<>(3));
        root.getLeft().setRight(new TreeNode<>(4));
        root.getLeft().getRight().setRight(new TreeNode<>(5));

        root.setRight(new TreeNode<>(6));
        root.getRight().setLeft(new TreeNode<>(7));
        root.getRight().setRight(new TreeNode<>(8));

        return root;
    }

    public static TreeNode<Course> buildCourseTree() {
        Course student1 = new Course(new Student("First student"), 1);
        Course student2 = new Course( new Student("Second student"), 2);
        Course student3 = new Course(new Student("Third student"), 3);
        Course student4 = new Course(new Student("Fourth student"), 1);
        Course student5 = new Course(new Student("Fifth student"), 2);
        Course student6 = new Course(new Student("Sixth student"), 4);
        Course student7 = new Course(new Student("Seventh student"), 2);
        Course student8 = new Course(new Student("Eighth student"), 5);
        TreeNode<Course> root = new TreeNode<>(student1);
        root.setLeft(new TreeNode<>(student2));
        root.getLeft().setLeft(new TreeNode<>(student3));
        root.getLeft().setRight(new TreeNode<>(student4));
        root.getLeft().getRight().setRight(new TreeNode<>(student5));
        root.setRight(new TreeNode<>(student6));
        root.getRight().setLeft(new TreeNode<>(student7));
        root.getRight().setRight(new TreeNode<>(student8));

        return root;
    }

    public static TreeNode<Mark> buildMarkTree() {
        Mark student1 = new Mark(new Student("First student"), Arrays.asList(9,7,8,9));
        Mark student2 = new Mark(new Student("Second student"), Arrays.asList(9,7,8,9,6,6));
        Mark student3 = new Mark(new Student("Third student"), Arrays.asList(9,7,8,9,5));
        Mark student4 = new Mark(new Student("Fourth student"), Arrays.asList(9,7,8));
        Mark student5 = new Mark(new Student("Fifth student"), Arrays.asList(9,7,8,9,10));
        Mark student6 = new Mark(new Student("Sixth student"), Arrays.asList(7,8,9));
        Mark student7 = new Mark(new Student("Seventh student"), Arrays.asList(8,9,7));
        Mark student8 = new Mark(new Student("Eighth student"), Arrays.asList(9,7,8,8,8));
        TreeNode<Mark> root = new TreeNode<>(student1);
        root.setLeft(new TreeNode<>(student2));
        root.getLeft().setLeft(new TreeNode<>(student3));
        root.getLeft().setRight(new TreeNode<>(student4));
        root.getLeft().getRight().setRight(new TreeNode<>(student5));
        root.setRight(new TreeNode<>(student6));
        root.getRight().setLeft(new TreeNode<>(student7));
        root.getRight().setRight(new TreeNode<>(student8));

        return root;
    }

}
