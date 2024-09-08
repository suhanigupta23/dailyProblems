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
            size++;
            if(size==0){
            head=tail=temp;
            }
            else{
            tail.next=temp;
            tail=temp;
         } 
        }
    }
}
