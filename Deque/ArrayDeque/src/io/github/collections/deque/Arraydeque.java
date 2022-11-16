package io.github.collections.deque;

import java.util.*;  

/*
 * ArrayList inherits the ArrayDeque, AbstractCollection class and implements Deque interface.
 * No size limits.
 * Unlike Queue, we can add or remove elements from both sides.
 * Faster than LinkedList and Stack.
 * Not Synchronized
 * Doesn't allow null values.
 */

public class Arraydeque
{  
    public static void main(String args[])
    {  

        /*
         * ArrayDeque add elements____________________________________________________________________________________________________
         */

        System.out.println("\n\nPriorityQueue add elements --->"); 

        //Adding elements to the ArrayDeque
        Deque<String> deque = new ArrayDeque<String>();  
        deque.add("Ravi");    // or offer()
        deque.add("Vijay");  
        deque.add("Ravi");  
        System.out.println("\nInitial list of elements: " + deque); 

        //Adding elements in first occurance
        deque.offerFirst("Dhanush");    // or addFirst(), push()
        System.out.println("\nOfferFirst Traversal: " + deque); 
        
        //Adding elements in last occurance
        deque.offerLast("Ajith");    // or addLast()
        System.out.println("\nOfferLast Traversal: " + deque); 

        //Deque addAll() method
        Deque<String> subDeque = new ArrayDeque<String>();  
        subDeque.add("Simbu");  
        subDeque.add("Kamal");  
        subDeque.add("Aniruth");  
        deque.addAll(subDeque);  
        System.out.println("\naddAll(Collection<? extends E> c) method: " + deque); 



        /*
         * ArrayDeque remove elements__________________________________________________________________________________________________
         */

        System.out.println("\n\nPriorityQueue remove elements ---> ");

        
        //Using poll() method
        deque.poll();    // or pop(), remove()
        System.out.println("\npoll() method: " + deque); 

        //Using poll() method
        deque.pollFirst();    // or removeFirst()
        System.out.println("\npollFirst() method: " + deque); 

        //Using poll() method
        deque.pollLast();    // or removeLast()
        System.out.println("\npollLast() method: " + deque); 


        /*
         * ArrayDeque methods__________________________________________________________________________________________________________
         */

        System.out.println("\n\nPriorityQueue methods ---> ");

        //Get the latest element using element()
        System.out.println("\nLatest element using element():" + deque.element());    // or peek()

        //Get the latest element using peekFirst()
        System.out.println("\nLatest element using peekFirst():" + deque.peekFirst());  

        //Get the latest element using peekLast()
        System.out.println("\nLatest element using peekLast():" + deque.peekLast());  


        /*
         * Ways to iterate the ArrayDeque elements_____________________________________________________________________________________
         */

        System.out.println("\n\nWays to iterate the ArrayDeque elements --->"); 

        //Traversing deque through for loop
        System.out.println("\nTraversing deque through for loop:");  
        for (String str : deque) 
        {  
            System.out.println(str);  
        }  

        //Traversing deque through descendingIterator
        System.out.println("\nTraversing deque through descendingIterator:");
        Iterator<String>  iterator = deque.descendingIterator();  
        while(iterator.hasNext()) {  
            System.out.println(iterator.next());  
        }  
    }  
}  