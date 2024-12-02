package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    private List<Integer> linkedList;

    @BeforeEach
    public void setUp() {
        linkedList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            linkedList.add(i);
        }
    }

    @Test
    public void whenAdded100ElementsThenSizeMustBe100() {
        assertEquals(100, linkedList.size());
    }

    @Test
    public void whenElementRemovedByIndexThenSizeMustBeDecreased() {
        linkedList.remove(5);
        assertEquals(99, linkedList.size());
    }

    @Test
    public void whenElementRemovedThenSizeMustBeDecreased() {
        linkedList.add(102);
        assertEquals(101, linkedList.size());
        assertTrue(linkedList.remove(Integer.valueOf(102)));
        assertEquals(100, linkedList.size());
    }

    @Test
    public void whenListClearedThenSizeMustBe0() {
        linkedList.clear();
        assertEquals(0, linkedList.size());
    }

    @Test
    public void whenIndexOutOfBoundsThenThrownException() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            linkedList.get(100);
        });
    }

    @Test
    public void methodGetReturnedRightValue() {
        int i = linkedList.get(0);
        assertEquals(0, i);
    }

    @Test
    public void insertIntoMiddle() {
        linkedList.add(50, 66);
        assertEquals(66, linkedList.get(50).intValue());
    }

    @Test
    public void insertIntoFirstPosition() {
        linkedList.add(0, 0);
        assertEquals(0, linkedList.get(0).intValue());
    }

    @Test
    public void insertIntoLastPosition() {
        linkedList.add(100, 100);
        assertEquals(100, linkedList.get(100).intValue());
    }
}
