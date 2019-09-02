package com.itacademy.molchanova.task2;

import com.itacademy.molchanova.common.model.TreeNode;
import com.itacademy.molchanova.task1.SearchStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class Mark extends Decorator {

    private Student student;
    private List<Integer> marks;

    @Override
    public void Accept(Visitor visitor, TreeNode root, SearchStrategy searchStrategy) {
        visitor.visitMark(root, searchStrategy);
    }

}
