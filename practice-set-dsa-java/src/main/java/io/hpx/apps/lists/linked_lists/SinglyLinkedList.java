package io.hpx.apps.lists.linked_lists;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

/* OBJECTIVE : Allow random-access, allow operations
 * like insert, delete, search, sort, traverse & print */
public class SinglyLinkedList {

    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    @Getter
    @Setter
    private static class Node {
        private Node next;
        private String data;
    }

    private Node linkedList = null;
    private Node head, tail; // TODO

    public String insert(String data) {
        /* when linked list is empty */
        if (this.isEmpty()) {
            linkedList = new Node(null, data);
            return linkedList.toString();
        } else {
            /* when linked list is not empty */
            return insertAtLast(data);
        }
    }

    public String insertAtFirst(String data) {
        linkedList = new Node(linkedList, data);
        return linkedList.toString();
    }

    public String insertAtLast(String data) {
        /* initialise linked list if empty */
        if (this.isEmpty()) {
            linkedList = new Node(null, data);
            return linkedList.toString();
        } else {
            Node currentNode = linkedList;
            while (Objects.nonNull(currentNode.getNext())) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new Node(null, data));
            return currentNode.toString();
        }
    }

    public String insertAt(int position, String data) {
        // 1->2->3->4->5, insert at 3, data 45
        if (this.isEmpty()) {
            return "list empty!";
        } else if (this.length() < position || 0 >= position) {
            return "invalid position!";
        } else if (1 == position) {
            insertAtFirst(data);
            return linkedList.toString();
        } else {
            Node currentNode = linkedList;
            position = position - 1;
            while (--position != 0) {
                currentNode = currentNode.getNext();
            }
            Node newNode = new Node(currentNode.getNext(), data);
            currentNode.setNext(newNode);
            return linkedList.toString();
        }
    }

    public String deleteFirst() {
        if (this.isEmpty()) {
            return "list empty!";
        } else {
            Node firstNode = linkedList;
            linkedList = firstNode.getNext();
            return firstNode.getData();
        }
    }

    public String deleteLast() {
        if (this.isEmpty()) {
            return "list empty!";
        } else if (1 == this.length()) {
            linkedList = null;
            return "last element deleted, list empty!";
        } else {
            Node currentNode = linkedList;
            for (int i = 1; i < this.length() - 1; i++) {
                currentNode = currentNode.getNext();
            }
            String deletedData = currentNode.getNext().getData();
            currentNode.setNext(null);
            return deletedData;
        }
    }

    public String deleteAt(int position) {
        /* TODO */
        return "";
    }

    public String get(int position) {
        if (this.isEmpty()) {
            return "list empty!";
        } else if (this.length() < position || 0 >= position) {
            return "no element at " + position;
        } else {
            Node currentNode = linkedList;
            for (int i = 0; i < position - 1; i++) {
                currentNode = currentNode.getNext();
            }
            return currentNode.getData();
        }
    }

    public int search(String data) {
        /* TODO */
        return -1;
    }

    public String join(SinglyLinkedList newList) {
        /* TODO */
        return "";
    }

    public String joinAfter(int position, SinglyLinkedList newList) {
        /* TODO */
        return "";
    }

    public String bulkInsert(String... data) {
        /* TODO */
        return "";
    }

    public String bulkInsertAt(int position, String... data) {
        /* TODO */
        return "";
    }


    public void print() {
        /* traversal of linked list */
        if (this.isEmpty()) {
            System.out.println("list empty!");
        } else {
            Node currentNode = linkedList;
            do {
                System.out.println(currentNode.getData());
                currentNode = currentNode.getNext();
            }
            while (Objects.nonNull(currentNode));
        }
    }

    public int length() {
        if (this.isEmpty()) {
            return 0;
        } else {
            int ctr = 1;
            Node currentNode = linkedList;
            while (Objects.nonNull(currentNode.getNext())) {
                ctr++;
                currentNode = currentNode.getNext();
            }
            return ctr;
        }
    }

    public boolean isEmpty() {
        return Objects.isNull(linkedList);
    }

    public void flush() {
        linkedList = null;
    }
}
