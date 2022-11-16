package io.github.collections.set;

import java.util.*;  

/*
 * HashSet inherits the HashSet class and implements Set interface.
 * No size limits.
 * Contains unique elements only
 * Uses a hashtable & a doubly-linked list to store & maintain the elements.
 * Not synchronized.
 * Maintain the insertion order.
 * Allows null value.
 */

class Linkedhashset{  
    public static void main(String args[]){  

        /*
         * LinkedHashSet add elements_________________________________________________________________________________________________________________
         */

        System.out.println("\n\nHashSet add elements --->"); 

        //Adding elements to the LinkedHashSet
        LinkedHashSet<String> lHashSet = new LinkedHashSet<>();  
        lHashSet.add("Ravi");   
        lHashSet.add("Kamal");  
        lHashSet.add("Ajith");   
        lHashSet.add("Ravi");   //doesn't allow duplicate elements
        System.out.println("\nInitial list of elements: " + lHashSet);  

        //Adding second set elements to the first set 
        LinkedHashSet<String> subSet=new LinkedHashSet<String>();  
        subSet.add("Kamal");  
        subSet.add("Surya");  
        lHashSet.addAll(subSet);  
        System.out.println("\naddAll(Collection<? extends E> c) method: " + lHashSet); 

        //LinkedHashSet form ArrayList
        ArrayList<String> list = new ArrayList<String>();  
        list.add("Karthick");  
        list.add("Vijay");   
        list.add("Simbu"); 

        LinkedHashSet<String> arrSet = new LinkedHashSet<>(list);  
        arrSet.add("Ajith");  
        System.out.println("\nHashSet form ArrayList: " + arrSet); 


        /*
         * LinkedHashSet remove elements_______________________________________________________________________________________________________________
         */

        System.out.println("\n\nHashSet remove elements ---> ");

        //Removing specific element from LinkedHashSet  
        lHashSet.remove("Surya");  
        System.out.println("\nremove(Surya) method: "+lHashSet);  
 
        //Removing all the new elements from LinkedHashSet  
        lHashSet.removeAll(subSet);  
        System.out.println("\nremoveAll(subSet) method: "+lHashSet);  

        //Removing elements on the basis of specified condition  
        lHashSet.removeIf(str->str.contains("Ajith"));    
        System.out.println("\nremoveIf() method: "+lHashSet);  

        //Removing all the elements available in the set  
        arrSet.clear();  
        System.out.println("\nclear() method: " + arrSet);  


        /*
         * LinkedHashSet methods_______________________________________________________________________________________________________________________
         */

        System.out.println("\n\nHashSet methods ---> ");

        //Displaying the size of the LinkedHashSet  
        System.out.println("\nThe size of the lHashSet is: " + lHashSet.size());  

        //Check for the empty set  
        System.out.println("\nIs the arrSet empty: " + arrSet.isEmpty());  

        //Check for "Ravi" in the set  
        System.out.println("\nDoes the lHashSet contains 'Ravi'? :- " + lHashSet.contains("Ravi"));    


        /*
         * Ways to iterate the LinkedHashSet elements__________________________________________________________________________________________________
         */

        System.out.println("\n\nWays to iterate the LinkedHashSet elements --->"); 

        //Traversing lHashSet through Iterator
        System.out.println("\nTraversing lHashSet through Iterator:");
        Iterator<String> itr = lHashSet.iterator();  
        while(itr.hasNext())
        {  
            System.out.println(itr.next());  
        }  

        //Getting Spliterator and traversing elements
        System.out.println("\nTraversing elements through Spliterator:");
        Spliterator<String> namesSpliterator = lHashSet.spliterator();               
        namesSpliterator.forEachRemaining(System.out::println);  
    }  
}  