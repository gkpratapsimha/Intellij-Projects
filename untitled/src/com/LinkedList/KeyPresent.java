package com.LinkedList;

public class KeyPresent {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static boolean checkForKey(int key){
        while(head!=null) {
            if(head.data == key)
            return true;
            head = head.next;
        }
        return false;
    }



     public static void main(String[] args){
         KeyPresent list = new KeyPresent();
         list.head = new Node(85);
         list.head.next = new Node(15);
         list.head.next.next = new Node(4);
         list.head.next.next.next = new Node(20);

        System.out.println(checkForKey(20));
     }
 }
