package com.javalearning.linkedlist;

public class ReverseKLinkedlist {

    Node head = null;
    Node tail = null;

    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
        }
    }

    public Node reverse(int k){

        Node current = this.head;
        Node head = null;
        while(current != null){

            int counter = 0;

            while(counter < k){

            }
        }
        return head;
    }

    void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void printList(){
        Node current = head;
        while(current != null){
            System.out.print("->" + current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ReverseKLinkedlist rl = new ReverseKLinkedlist();
        rl.push(1);
        rl.push(2);
        rl.push(3);
        rl.push(4);
        rl.push(5);
        rl.push(6);
        rl.push(7);
        rl.push(8);
        rl.printList();
    }
}
