/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Iterator;
import java.util.EmptyStackException;

/**
 *
 * @author duane
 */
public class NodeQueue implements Queue{
    private Node first;
    private Node last;
    private int n;
    
    public NodeQueue(){
        first=null;
        last=null;
        n=0;
    }
    
    public NodeQueue(Node f,Node l){
        first=f;
        last=l;
//        n++;
        }
    
    
    public boolean isEmpty(){
        return first==null;
    }
    
    public int size(){
        return n;
    }
    
    public int front() throws EmptyQueueException{
        if(isEmpty()) throw new EmptyQueueException();
        return first.getElement();
    }
    
    public void enqueue(int item){
        if(n==0){
            Node one = new Node(item,null);
            first=one;
            last=one;
        }else{
            Node tmp=last;
            Node end=new Node(item,null);
            tmp.setNext(end);
            last=end;
        }
        n++;
//        Node oldlast=last;
//        last=new Node(item,null);
//        last=new Node();
//        last.setElement(item);
//        last.setNext(null);
//        if(isEmpty()){first=last;}
//        else{last.setNext(oldLast);}
//        n++;
    }
    
    public int dequeue() throws EmptyQueueException{
        if(isEmpty()) throw new EmptyQueueException();
        int item=first.getElement();
        first=first.getNext();
        n--;
        if(isEmpty()){last=null;}
        return item;
    }
    
    public void display(){
        Node position=first;
        while(position!=null){
            System.out.print(position.getElement()+", ");
            position=position.getNext();
        }
    }
    
    public void get40th(){
       Node position=first;
       int count=0;
        while(position!=null){
            count++;
            if(count==40){System.out.println("The 40th prime number in the list is: "+position.getElement());}
            position=position.getNext();
        }
        
        
    }
}
