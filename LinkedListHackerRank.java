import java.io.*;
import java.util.*;

public class LinkedListHackerRank{
    Node head;
    Node tail;
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    void addNode(int newData){
        Node newNode=new Node(newData);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    
    void display(){
        Node current=head;
        if(head==null)
            System.out.println("List is Empty");
        while(current != null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        Solution list = new Solution();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.display();
    }
}