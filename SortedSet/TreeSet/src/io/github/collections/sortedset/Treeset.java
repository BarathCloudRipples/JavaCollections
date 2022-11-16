package io.github.collections.sortedset;

/*
 * HashSet inherits the AbstractSet class and implements Set, NavigableSet interface.
 * No size limits.
 * Contains unique elements only
 * Uses a hashtable & a doubly-linked list to store & maintain the elements.
 * Not synchronized.
 * Maintain ascending order.
 * Dosen't allows null value.
 */

import java.util.*;  
class Treeset{  
    public static void main(String args[])
    {  
        
        /*
         * TreeSet add elements_________________________________________________________________________________________________________________
         */

        System.out.println("\n\nHashSet add elements --->"); 

        //Adding elements to the TreeSet
        TreeSet<String> treeSet = new TreeSet<>();  
        treeSet.add("Ravi");   
        treeSet.add("Kamal");  
        treeSet.add("Ajith");     
        treeSet.add("Simbu"); 
        treeSet.add("Ravi");   //doesn't allow duplicate elements
        treeSet.add("Vishal");
        treeSet.add("Siva");
        System.out.println("\nInitial list of elements: " + treeSet);  

        //Adding second set elements to the first set 
        TreeSet<String> subSet=new TreeSet<String>();  
        subSet.add("Kamal");  
        subSet.add("Surya");  
        treeSet.addAll(subSet);  
        System.out.println("\naddAll(Collection<? extends E> c) method: " + treeSet); 

        //TreeSet form ArrayList
        ArrayList<Integer> list = new ArrayList<>();  
        list.add(2);     
        list.add(8);  
        list.add(5);  
        list.add(1);  
        list.add(10);   

        TreeSet<Integer> arrSet = new TreeSet<>(list);  
        arrSet.add(3);  
        System.out.println("\nHashSet form ArrayList: " + arrSet); 


        /*
         * TreeSet remove elements_______________________________________________________________________________________________________________
         */

        System.out.println("\n\nHashSet remove elements ---> ");

        //Removing specific element from TreeSet  
        treeSet.remove("Surya");  
        System.out.println("\nremove(Surya) method: "+treeSet);  
 
        //Removing all the new elements from TreeSet  
        treeSet.removeAll(subSet);  
        System.out.println("\nremoveAll(subSet) method: "+treeSet);  

        //Removing elements on the basis of specified condition  
        treeSet.removeIf(str->str.contains("Ajith"));    
        System.out.println("\nremoveIf() method: "+treeSet);  

        //Removing first element
        arrSet.pollFirst();
        System.out.println("\nRemoved element using pollFirst() : " + arrSet);  

        //Removing last element
        arrSet.pollLast();
        System.out.println("\nRemoved element using pollLast() : " + arrSet);  


        /*
         * TreeSet methods_______________________________________________________________________________________________________________________
         */

        System.out.println("\n\nHashSet methods ---> ");

        //Displaying the size of the TreeSet  
        System.out.println("\nThe size of the treeSet is: " + treeSet.size());  

        //Check for the empty set  
        System.out.println("\nIs the arrSet empty: " + arrSet.isEmpty());  

        //Returns the largest element in the set which is greater than or equal the element in the argument
        System.out.println("\nCeiling value of 7 : " + arrSet.ceiling(7));  // or higher()

        //Returns the largest element in the set which is smaller than the element in the argument
        System.out.println("\nlowest value then 7 : " + arrSet.lower(7));    // or floor()

        //Check for "Ravi" in the set  
        System.out.println("\nDoes the treeSet contains 'Ravi'? : " + treeSet.contains("Ravi"));  

        //Returns First element in the set  
        System.out.println("\nFirst Element: " + treeSet.first());    

        //Returns Last element in the set  
        System.out.println("\nFirst Element: " + treeSet.last());    

        //Returns Starting element to the given range
        System.out.println("\nHead Set: " + treeSet.headSet("Siva"));  

        //Returns a set of elements that lie between the given range
        System.out.println("\nSubset of treeSet(1,2): " + treeSet.subSet("Ravi", "Vishal")); 

        //Returns Given range to the last element

        System.out.println("\nTail Set: " + treeSet.tailSet("Simbu"));  
        
        //synchronized Set
        Set<String> syncrSet = Collections.synchronizedSet(treeSet);  
        System.out.println("\nSynchronized Set: " + syncrSet);
        


        /*
         * Ways to iterate the TreeSet elements__________________________________________________________________________________________________
         */

        System.out.println("\n\nWays to iterate the TreeSet elements --->"); 

        //Traversing treeSet through Iterator
        System.out.println("\nTraversing treeSet through Iterator:");
        Iterator<String> itr = treeSet.iterator();  
        while(itr.hasNext())
        {  
            System.out.println(itr.next());  
        }  

        //Getting Spliterator and traversing elements
        System.out.println("\nTraversing elements through Spliterator:");
        Spliterator<String> namesSpliterator = treeSet.spliterator();               
        namesSpliterator.forEachRemaining(System.out::println);
    }  
}  