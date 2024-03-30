package io.hpx.apps.lists.linked_lists;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

public class SinglyLinkedList {

    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    @Getter
    @Setter
    static class Node {
        private Node next;
        private String data;
    }

    private Node linkedList = null;

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
        /* TODO: position is always index+1 */
        int len = this.length();

        return "";
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
        /* TODO */
        return "";
    }

    public String deleteAt(int position) {
        /* TODO */
        return "";
    }

    public String get(int position) {
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
}
