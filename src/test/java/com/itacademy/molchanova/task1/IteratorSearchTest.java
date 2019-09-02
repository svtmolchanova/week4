package com.itacademy.molchanova.task1;

import com.itacademy.molchanova.common.model.TreeNode;
import com.itacademy.molchanova.util.TreeNodeEntityUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IteratorSearchTest {

    private TreeNode<Integer> root = TreeNodeEntityUtil.buildDefaultTree();

    @Test
    public void checkDepthSearchTest() {
        final String expectedValue = "12345678";
        TreeIterator treeIterator = new TreeIterator(root);
        treeIterator.setSearchStrategy(DepthSearchStrategy.getDepthSearchStrategy());
        StringBuilder actualValue = new StringBuilder();
        while (treeIterator.hasNext()) {
            actualValue.append(treeIterator.next().getValue());
        }
        assertEquals(expectedValue, actualValue.toString());
    }

    @Test
    public void checkWidthSearchTest() {
        final String expectedValue = "12634785";
        TreeIterator treeIterator = new TreeIterator(root);
        treeIterator.setSearchStrategy(WidthSearchStrategy.getWidthSearchStrategyt());
        StringBuilder actualValue = new StringBuilder();
        while (treeIterator.hasNext()) {
            actualValue.append(treeIterator.next().getValue());
        }
        assertEquals(expectedValue, actualValue.toString());
    }

}
