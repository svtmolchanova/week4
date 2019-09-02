package com.itacademy.molchanova.task2;

import com.itacademy.molchanova.common.model.TreeNode;
import com.itacademy.molchanova.task1.DepthSearchStrategy;
import com.itacademy.molchanova.task1.SearchStrategy;
import com.itacademy.molchanova.task1.TreeIterator;
import com.itacademy.molchanova.util.TreeNodeEntityUtil;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class NodeVisitorTest {

    private TreeNode<Course> root = TreeNodeEntityUtil.buildCourseTree();

    private TreeNode<Mark> node = TreeNodeEntityUtil.buildMarkTree();

    private NodeVisitor visitor = new NodeVisitor();

    @Test
    public void checkCourseVisitor() {
        final List<Integer> expectedValue = Arrays.asList(1,2,3,1,2,4,2,5);
        SearchStrategy strategy = DepthSearchStrategy.getDepthSearchStrategy();
        List<Integer> actualValue = visitor.visitCourse(root, strategy);
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void checkMarkVisitor() {
        Map<String, List<Integer>> expectedValue = new HashMap<>();
        expectedValue.put("First student", Arrays.asList(9,7,8,9));
        expectedValue.put("Second student", Arrays.asList(9,7,8,9,6,6));
        expectedValue.put("Third student", Arrays.asList(9,7,8,9,5));
        expectedValue.put("Fourth student", Arrays.asList(9,7,8));
        expectedValue.put("Fifth student", Arrays.asList(9,7,8,9,10));
        expectedValue.put("Sixth student", Arrays.asList(7,8,9));
        expectedValue.put("Seventh student", Arrays.asList(8,9,7));
        expectedValue.put("Eighth student", Arrays.asList(9,7,8,8,8));

        SearchStrategy strategy = DepthSearchStrategy.getDepthSearchStrategy();
        Map<String, List<Integer>> actualValue = visitor.visitMark(node, strategy);
        assertEquals(expectedValue, actualValue);

    }
}
