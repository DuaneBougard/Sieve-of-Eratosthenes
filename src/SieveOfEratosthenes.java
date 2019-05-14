/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author duane
 */
public class SieveOfEratosthenes {
     
    private NodeQueue QPrime,Qtmp,Q;
    private int count = 0;
     
        /**
         * constructs a sieve object
         */
        public SieveOfEratosthenes(){
            //QPrime = new NodeQueue();
            Q = new NodeQueue();
             
        } 
        
        /**
         * 
         * @param n the number up to which the primes should be found
         * implements the sieve algorithm
     * @throws EmptyQueueException
         */    
        public void computeTo(int n) throws EmptyQueueException{
            if (n < 2){
                throw new IllegalArgumentException ("n must be greater than or equal to 2!");
            }
             
            for (int i = 2; i <= n; i++ ){ //fills queue Q with numbers greater than 1 up until n/max
                Q.enqueue(i);
                }
             QPrime=new NodeQueue();
//            int p=Q.dequeue(); //p=last element in the queue Q
            do {
                int p=Q.front();
                QPrime.enqueue(p);
                //count++;
                //System.out.print(p+", ");
                count++;
                Qtmp=new NodeQueue(); 
                while(!Q.isEmpty()){
                    int last=Q.dequeue();
                    if ((last%p) != 0){ 
                        Qtmp.enqueue(last); 
                    }
                }
                while(!Qtmp.isEmpty()){
                    int front=Qtmp.dequeue(); 
                    Q.enqueue(front);
                }
            }while (!Q.isEmpty());
            count++;
            System.out.println("");
            System.out.println("List of prime numbers up until "+n);
            QPrime.display();
            System.out.println("");
            //System.out.println("Number of primes= "+QPrime.size());
            System.out.println("");
            QPrime.get40th();
           }
//        /**
//         * 
//         * @return count - the number of primes found on the last call of computeTo
//         */
//        public int getCount(){
//             
//            if (!computed){
//                throw new IllegalStateException ("No call has been made on the computeTo method!");
//            }           
//            return count; 
//        } 
    
    public static void main(String[] args) throws EmptyQueueException {
        System.out.println("This program computes all the Prime numbers up to a");
        System.out.println("maximum number using the Sieve of Eratosthenes technique.");
        System.out.println();
        Scanner console = new Scanner(System.in);
        SieveOfEratosthenes s = new SieveOfEratosthenes();
        for(;;) {
            System.out.print("Maximum n to compute (Enter 0 to quit)? ");
            int max = console.nextInt();
            if (max<0){System.out.println("Enter number greater than 1!");continue;}
            if (max==1){System.out.println("Enter number greater than 1!");continue;}
            if (max == 0){
                break;}
            System.out.println();
            s.computeTo(max);
            //s.reportResults();
            System.out.println();
        }
    }
}
