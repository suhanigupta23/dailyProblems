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

        void addLast(int val){
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
            for(Node temp=head;temp!=null;temp=temp.next){
                System.out.println(temp.data+" ";)
            }
            System.out.println();
        }
        public void removeFirst(){
            if(size==0){
                System.out.println("List is empty")
            }
        }
    }
    public static void main(Stering [] args ) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        LInkedList lust =new LinkedList();
        String str=br.readLIne();
        while(str.equals("quit")==false)
        if(str.startsWith("addLast")){
            int val=Integer.parseInt(str.split(" "[1]));
        }
    }
}
