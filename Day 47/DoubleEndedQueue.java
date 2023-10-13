import java.util.*;
public class DoubleEndedQueue {
    public static void main(String[] args){
        Deque dll=new Deque();
        dll.addFirst(34);
        dll.addFirst(24);
        dll.addLast(3);
        dll.addLast(78);
        dll.printQueue();
        dll.pollFirst();
        dll.pollLast();
        dll.addLast(32);
        dll.printQueue();
    }
}
class Deque{
    class Node{
        Node prev;
        Node next;
        int data;
        Node(int d){
            data=d;
        }
    }
    Node front;
    Node rear;
    int count;
    void addFirst(int ele){
        Node node=new Node(ele);
        if(front==null){
            front=rear=node;
        }
        else {
            node.next = front;
            front.prev = node;
            front = node;
        }
        count++;
    }
    void addLast(int ele){
        Node node=new Node(ele);
        if(front==null){
            front=rear=node;
        }
        else {
            rear.next = node;
            node.prev = rear;
            rear = node;
        }
        count++;

    }
    int pollFirst(){
        if(front==null) {
            throw new IllegalStateException();
        }
        int value=0;
        if(front==rear){
            value=front.data;
            front=rear=null;
        }
        else{
            value=front.data;
            front=front.next;
            front.prev=null;
        }
        count--;
        return value;
    }
    int pollLast(){
        if(front==null) {
            throw new IllegalStateException();
        }
        int value=0;
        if(front==rear){
            value=front.data;
            front=rear=null;
        }
        else{
            value=rear.data;
            rear=rear.prev;
            rear.next=null;
        }
        count--;
        return value;
    }
    void printQueue(){
        Node current=front;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    boolean isEmpty(){
        return count==0;
    }
    int size(){
        return count;
    }
}