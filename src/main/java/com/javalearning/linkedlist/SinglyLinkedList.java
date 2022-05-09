package com.javalearning.linkedlist;

public class SinglyLinkedList {

    private Node head = null;
    private Node tail = null;

    class Node {
        Node next;
        int data;

        public Node(int data) {
            this.next = null;
            this.data = data;
        }
    }

    private void addNode(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    private void addNode(int data,int position) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }


    public void printAllNodes() {
        Node travel = head;

        while (travel != null) {
            System.out.println(travel.data);
            travel = travel.next;
        }

    }

    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.addNode(1);
        sl.addNode(2);
        sl.addNode(3);
        sl.addNode(4);
        sl.addNode(5);
        sl.printAllNodes();
    }
}
