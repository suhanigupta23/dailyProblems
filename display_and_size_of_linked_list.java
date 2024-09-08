import java.io.*;
import java.util.*;

public class Main{
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addList(int val){
            Node temp=new Node();
            temp.data=val;
            temp.next=null;
            if(size==0){
            head=tail=temp;
            }
            else{
            tail.next=temp;
            tail=temp;
         } 
         size++;
        }
        public int size(){
            return size;
        }
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
}
