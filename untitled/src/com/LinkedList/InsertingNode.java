package com.LinkedList;

import java.util.Scanner;

public class InsertingNode {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        head = null;
        if (n > 0) {
            head = new Node(s.nextInt());
            Node temp = head;
            for (int i = 1; i < n; i++) {
                temp.next = new Node(s.nextInt());
                temp = temp.next;
            }
        }
        int k = s.nextInt();
        int index = s.nextInt();
        addElementAtEnd(k);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

System.out.println();
        inserInSpeciedIndex(k,index);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void addElementAtEnd(int key){
        Node new_node = new Node(key);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new_node;

    }
    public static void inserInSpeciedIndex(int key,int index){
        //Node new_Node = new Node(key);
        Node temp = head;int i =0;
        while(temp.next!=null && i++<index-1){
            temp = temp.next;
            Node new_Node = new Node(key);
            new_Node.next = temp.next;
            temp.next = new_Node;
        }
    }

}
