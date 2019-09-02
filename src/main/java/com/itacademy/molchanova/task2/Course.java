package com.itacademy.molchanova.task2;

import com.itacademy.molchanova.common.model.TreeNode;
import com.itacademy.molchanova.task1.SearchStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Course extends Decorator {

    private Student student;
    private Integer numberCourse;

    @Override
    public void Accept(Visitor visitor, TreeNode root, SearchStrategy searchStrategy) {
        visitor.visitCourse(root, searchStrategy);
    }
}
