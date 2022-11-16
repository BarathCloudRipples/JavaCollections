package io.github.collections.queue;

import java.util.*;  

/*
 * ArrayList inherits the AbstractQueue class and implements Queue interface.
 * No size limits.
 * Follows FIFO pattern in the Java pQueue.
 * Holds the elements which are to be processed by their priorities.
 * Not Synchronized
 * Doesn't allow null values.
 */

public class Priorityqueue
{  
    static int max = 0;
    public static void main(String args[])
    {  

        /*
         * PriorityQueue add elements__________________________________________________________________________________________________________
         */

        System.out.println("\n\nPriorityQueue add elements --->"); 

        //Adding elements to the PriorityQueue
        PriorityQueue<String> pQueue = new PriorityQueue<String>();  
        addelement(pQueue, "Ravi");  
        addelement(pQueue, "Vijay");  
        addelement(pQueue, "Kamal");   
        addelement(pQueue, "Aniruth"); 
        addelement(pQueue, "Ravi");  
        addelement(pQueue, "Simbu");  
        addelement(pQueue, "Dhanush"); 
        System.out.println("\nInitial list of elements: " + pQueue);  

        //Adding an element at the specific position  
        pQueue.offer("Vishal");  
        System.out.println("\nPriority Queue values after addition of 'Vishal': " +pQueue );  

        //Adding elements to the PriorityQueue using Comparator
        PriorityQueue<Integer> intQueue = new PriorityQueue<>(new CustomIntegerComparator());

        for(int i = 1 ; i <= 4 ; i++)
        {
            intQueue.add(i);
        }
        System.out.println("\nIntegers stored in reverse order of priority in a Priority Queue: " + intQueue);  


        /*
         * PriorityQueue remove elements________________________________________________________________________________________________________
         */

        System.out.println("\n\nPriorityQueue remove elements ---> ");

        //Using remove() method
        pQueue.remove();  
        System.out.println("\nremove() method: " + pQueue); 

        //Using poll() method
        pQueue.poll();  
        System.out.println("\npoll() method: " + pQueue); 


        /*
         * PriorityQueue methods_________________________________________________________________________________________________________________
         */

        System.out.println("\n\nPriorityQueue methods ---> ");

        //Get the latest element using element()
        System.out.println("\nLatest element using element():" + pQueue.element());  

        //Get the latest element using peek()
        System.out.println("\nLatest element using peek():" + pQueue.peek());  

        //Get the max Value
        System.out.println("\nMax element: " + Collections.max(intQueue));  
  
        //Get the min value
        System.out.println("\nMin element: " + Collections.min(intQueue));  

        //To get order the elements of this queue or returns null if the elements are sorted accordingly
        Comparator comparator = intQueue.comparator();  
        System.out.println("\nComparator value is: " +  comparator);  

        //contains() method
        System.out.println("\nIf Vishal is present in the queue? " + pQueue.contains("Vishal"));

        
        /*
         * Ways to iterate the PriorityQueue elements_____________________________________________________________________________________________
         */

        System.out.println("\n\nWays to iterate the PriorityQueue elements --->"); 

        //Iterating the pQueue elements
        System.out.println("\nIterating the pQueue elements:");  
        Iterator<String> itr = pQueue.iterator();  
        while(itr.hasNext())
        {  
            System.out.println(itr.next());  
        }  
    }

    //performing add operation  
    static void addelement(PriorityQueue<String> queue, String str)   
    {    
        if(str.length() > max)
            max = str.length();
        int width = max + 2;
        queue.add(str);

        System.out.println("\nadd -> " + str); 
        System.out.println("Queue: ");  
        for (String value :queue) {  
            value = String.format("%-" + width  + "s", String.format("%" + (value.length() + (width - value.length()) / 2) + "s", value));
            System.out.println("      |" + value + "|");
        }  
    } 

    //Overriding Comparator for iterating Descending order
    static class CustomIntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer n1, Integer n2) {
            return n1 < n2 ? 1 : -1;
        }
    }
}  