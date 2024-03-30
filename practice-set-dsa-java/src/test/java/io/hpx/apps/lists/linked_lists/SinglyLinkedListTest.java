package io.hpx.apps.lists.linked_lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SinglyLinkedListTest {

    SinglyLinkedList list = new SinglyLinkedList();

    @BeforeEach
    void setUp() {
        list.flush();
        list.insert("First");
        list.insert("Second");
        list.insert("Third");
    }

    @Test
    void insert() {
        list.print();
        assertEquals(3, list.length());
        assertEquals("First", list.get(1));
        assertEquals("Second", list.get(2));
        assertEquals("Third", list.get(3));

        assertFalse(list.length() > 3);
        assertFalse(list.length() < 2);
    }

    @Test
    void insertAtFirst() {
    }

    @Test
    void insertAtLast() {
    }

    @Test
    void insertAt() {
        /* before inserting new element */
        assertEquals(3, list.length());

        /* after inserting new element at position */
        list.insertAt(2, "New Second");
        assertEquals(4, list.length());
        assertEquals("New Second", list.get(2));

        /* after inserting new element at first */
        list.insertAt(1, "New First");
        assertEquals(5, list.length());
        assertEquals("New First", list.get(1));

        /* after inserting new element at last */
        list.insertAt(list.length(), "New Last");
        assertEquals(6, list.length());
        assertEquals("New Last", list.get(list.length()-1));

        /* should fail */
        assertEquals("invalid position!", list.insertAt(0, "New Zeroth"));
        assertEquals("invalid position!", list.insertAt(-1, "New Arbitrary"));
    }

    @Test
    void deleteFirst() {
    }

    @Test
    void deleteLast() {
    }

    @Test
    void deleteAt() {
    }

    @Test
    void get() {
    }

    @Test
    void search() {
    }

    @Test
    void print() {
    }

    @Test
    void length() {
    }

    @Test
    void isEmpty() {
    }
}