package com.LinkedList;

//Creating Linked list class.
class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public  void addToEmpty(int data){
        Node new_node = new Node(data);
        head = new_node;
    }

    public void addElementAtBegining(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void addElementAtEnd(int data){
        Node new_node = new Node(data);
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = new_node;
    }

    public void addInbetween(int data,int key){
        Node new_node = new Node(data);
        Node temp = head;
        while(temp!=null && temp.data!=key)
            temp = temp.next;
        if(temp==null){
            System.out.println("Key not found");
            return;
        }
         new_node.next = temp.next;
        temp.next = new_node;
    }
    public void deleteNodeInbetween(int key){
        Node prev = null,curr = head;
        while(curr != null && curr.data!= key){
            prev = curr;
            curr = curr.next;
        }
        if(curr == null){
            System.out.println("Node not found");
            return
                    ;
        }
        prev.next = curr.next;
    }

    public void reverseLinkedList(){
        Node curr = head, prev = null,next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public  void print(){
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}


public class AddingElementAtTheBegining {
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.addToEmpty(10);
        list.print();
        System.out.println();

        list.addElementAtBegining(20);
        list.print();
        System.out.println();


        list.addElementAtEnd(30);
        list.print();
        System.out.println();

        list.addInbetween(40,10);
        list.print();

        System.out.println();

        list.deleteNodeInbetween(40);
        list.print();

        System.out.println();

        list.reverseLinkedList();
        list.print();

    }

}
