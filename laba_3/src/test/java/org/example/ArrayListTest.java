package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    private List<Integer> arrayList;

    @BeforeEach
    public void setUp() {
        arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
    }

    @Test
    public void whenAdded100ElementsThenSizeMustBe100() {
        assertEquals(100, arrayList.size());
    }

    @Test
    public void whenElementRemovedByIndexThenSizeMustBeDecreased() {
        arrayList.remove(5);
        assertEquals(99, arrayList.size());
    }

    @Test
    public void whenElementRemovedThenSizeMustBeDecreased() {
        arrayList.add(102);
        assertEquals(101, arrayList.size());
        assertTrue(arrayList.remove(Integer.valueOf(102)));
        assertEquals(100, arrayList.size());
    }

    @Test
    public void whenListClearedThenSizeMustBe0() {
        arrayList.clear();
        assertEquals(0, arrayList.size());
    }

    @Test
    public void whenIndexOutOfBoundsThenThrownException() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            arrayList.get(100);
        });
    }

    @Test
    public void methodGetReturnedRightValue() {
        int i = arrayList.get(0);
        assertEquals(0, i);
    }

    @Test
    public void insertIntoMiddle() {
        arrayList.add(50, 66);
        assertEquals(66, arrayList.get(50).intValue());
    }

    @Test
    public void insertIntoFirstPosition() {
        arrayList.add(0, 0);
        assertEquals(0, arrayList.get(0).intValue());
    }

    @Test
    public void insertIntoLastPosition() {
        arrayList.add(100, 100);
        assertEquals(100, arrayList.get(100).intValue());
    }
}
