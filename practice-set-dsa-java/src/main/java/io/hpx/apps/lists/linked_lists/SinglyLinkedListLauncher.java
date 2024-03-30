package io.hpx.apps.lists.linked_lists;

public class SinglyLinkedListLauncher {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        /* insertFirst() when linked list empty */
        System.out.println(singlyLinkedList.insertAtFirst("First Data When List Empty"));
        System.out.println(singlyLinkedList.length());
        singlyLinkedList.print();

        /* insertAtLast() or insert() are designed to be called interchangeably */
        System.out.println(singlyLinkedList.insertAtLast("First Last Data"));
        System.out.println(singlyLinkedList.insertAtLast("Second Last Data"));
        System.out.println(singlyLinkedList.insertAtLast("Third Last Data"));

        /* another way to add data is simply calling insert() */
        System.out.println(singlyLinkedList.insert("First Data"));
        System.out.println(singlyLinkedList.insert("Second Data"));
        System.out.println(singlyLinkedList.insert("Third Data"));

        /* insertAtFirst() */
        System.out.println(singlyLinkedList.insertAtFirst("Before First Data"));
        System.out.println(singlyLinkedList.insertAtFirst("Another Before First Data"));

        System.out.println(singlyLinkedList.length());
        singlyLinkedList.print();

        /* deleteFirst() when list is full */
        System.out.println("Deleting : " + singlyLinkedList.deleteFirst());
        System.out.println(singlyLinkedList.length());
        singlyLinkedList.print();
    }
}
