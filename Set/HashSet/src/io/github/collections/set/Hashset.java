package io.github.collections.set;

import java.util.*;  

/*
 * HashSet inherits the AbstractSet class and implements Set interface.
 * No size limits.
 * Contains unique elements only
 * Stores the elements by using a hashing mechanism.
 * Not synchronized.
 * Doesn't maintain the insertion order.
 * Allows null value.
 * Best approach for search operations
 */

class Hashset{  
    public static void main(String args[])
    {  

        /*
         * HashSet add elements_________________________________________________________________________________________________________________
         */

        System.out.println("\n\nHashSet add elements --->"); 

        //Adding elements to the HashSet
        HashSet<String> hashSet = new HashSet<>();  
        hashSet.add("One");    
        hashSet.add("Two");    
        hashSet.add("Three");   //doesn't allow duplicate elements
        hashSet.add("Four");  
        hashSet.add("Five");   
        hashSet.add("Three");
        System.out.println("\nInitial list of elements: " + hashSet);  

        //Adding second set elements to the first set 
        HashSet<String> subSet=new HashSet<String>();  
        subSet.add("Six");  
        subSet.add("Seven");  
        hashSet.addAll(subSet);  
        System.out.println("\naddAll(Collection<? extends E> c) method: " + hashSet); 

        //HashSet form ArrayList
        ArrayList<String> list = new ArrayList<String>();  
        list.add("Ravi");  
        list.add("Vijay");   
        list.add("Ravi"); 
        list.add("Simbu");  

        HashSet<String> arrSet = new HashSet<>(list);  
        arrSet.add("Ajith");  
        System.out.println("\nHashSet form ArrayList: " + arrSet); 


        /*
         * HashSet remove elements_______________________________________________________________________________________________________________
         */

        System.out.println("\n\nHashSet remove elements ---> ");

        //Removing specific element from HashSet  
        hashSet.remove("One");  
        System.out.println("\nremove(One) method: "+hashSet);  
 
        //Removing all the new elements from HashSet  
        hashSet.removeAll(subSet);  
        System.out.println("\nremoveAll(subSet) method: "+hashSet);  

        //Removing elements on the basis of specified condition  
        hashSet.removeIf(str->str.contains("Three"));    
        System.out.println("\nremoveIf() method: "+hashSet);  

        //Removing all the elements available in the set  
        arrSet.clear();  
        System.out.println("\nclear() method: " + arrSet);  


        /*
         * HashSet methods_______________________________________________________________________________________________________________________
         */

        System.out.println("\n\nHashSet methods ---> ");

        //Displaying the size of the HashSet  
        System.out.println("\nThe size of the hashSet is: " + hashSet.size());  

        //Check for the empty set  
        System.out.println("\nIs the arrSet empty: " + arrSet.isEmpty());  

        //Check for "Two" in the set  
        System.out.println("\nDoes the hashSet contains 'Two'? :- " + hashSet.contains("Two"));    


        /*
         * Ways to iterate the HashSet elements__________________________________________________________________________________________________
         */

        System.out.println("\n\nWays to iterate the HashSet elements --->"); 

        //Traversing hashSet through Iterator
        System.out.println("\nTraversing hashSet through Iterator:");
        Iterator<String> itr = hashSet.iterator();  
        while(itr.hasNext())
        {  
            System.out.println(itr.next());  
        }  

        //Getting Spliterator and traversing elements
        System.out.println("\nTraversing elements through Spliterator:");
        Spliterator<String> namesSpliterator = hashSet.spliterator();               
        namesSpliterator.forEachRemaining(System.out::println);  
    }  
}  