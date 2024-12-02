package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
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
}
