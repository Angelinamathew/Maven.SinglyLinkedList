package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    class Node{
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail;


    public T find(T str2) {
    }

    public int size() {
    }

    //Represent a node of the singly linked list


    public void add(T add) {
        Node node = new Node(add);

    }

    public int get(int i) {
    }

    public void remove(int i) {
    }

    public boolean contains(T s) {
    }


}
