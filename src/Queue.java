/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duane
 */
/*
 * Interface for a queue: a collection of elements that are 
 * inserted and removed according to the first-in first-out 
 * (FIFO) principle.
 */

public interface Queue  {  
	 
	// Returns the number of elements in the queue.
	public int size();  
	
	// Returns whether the queue is empty.
	public boolean isEmpty(); 
	
	// Inspects the element at the front of the queue.
	public int front() throws EmptyQueueException; 

	// Inserts an element at the rear of the queue.
	public void enqueue  (int element); 

	// Removes the element at the front of the queue.
	public int dequeue() throws EmptyQueueException; 
}