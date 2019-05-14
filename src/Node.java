/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duane
 */
public class Node {
    public int element;
    public Node next;
    
    public Node(){
        element=0;
        next=null;
    }
    
    public Node(int element,Node next){
        this.element=element;
        this.next=next;
    }
    
    public void setElement(int element){
        this.element=element;
    }
    
    public void setNext(Node next){
        this.next=next;
    }
    
    public int getElement(){
        return element;
    }
    
    public Node getNext(){
        return next;
    }

    @Override
    public String toString() {
        return "Node{" + "element=" + element + ", next=" + next + '}';
    }
    
    
}
