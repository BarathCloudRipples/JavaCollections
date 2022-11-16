package io.github.collections.list;

import java.util.*;
import java.util.stream.Stream;

/*
 * Vector implements List interface.
 * No size limits.
 * Recommended to use the Vector class vector the thread-safe implementation.
 * Can have duplicate values.
 * It is synchronized.
 */

class Vectorlist extends Vector
{  
    public static void main(String args[])
    {  

        /*
        * Vector add elements_______________________________________________________________________________________________________________________
        */

        System.out.println("\n\nList add elements --->"); 

        Vector<String> vector = new Vector<String>(10); 
        vector.add("Vijay");  
        vector.add("Ravi");  
        vector.add("Dhruv");  
        vector.add("Vikram");  
        vector.addElement("Ravi");
        vector.addElement("Ajith"); 
        System.out.println("\nInitial list of elements: " + vector); 
         
        //Converting array to vector
        Vectorlist vecInt = new Vectorlist();
        int[] arr = {1, 2, 3, 4, 5};  

        for(int i = 0 ; i < arr.length ; i++)  
        {  
            vecInt.add(arr[i]);     
        }  
        System.out.println("\nPrinting array to vector: " + vecInt); 

        //Adding second list elements to the first vector 
        ArrayList<String> arr1 = new ArrayList<String>();  
        arr1.add("Karthick");  
        arr1.add("Aniruth");   
        vector.addAll(arr1); 


        /*
        * Vector remove elements_____________________________________________________________________________________________________________________
        */

        System.out.println("\n\nVector remove elements ---> ");

        //use remove() method to delete the first occurence of an element  
        vector.remove("vikram");  
        System.out.println("\nVector elements after remove() method  : " + vector);  

        //Remove the element at specified index  
        vector.remove(4);     // or removeElementAt()
        System.out.println("\nNew Value list in vector: " + vector);  

        //Remove the range of an element  
        vecInt.removeRange(1,3);  
        System.out.println("\nVector element after removal: " + vecInt);     


        /*
        * Vector methods_____________________________________________________________________________________________________________________________
        */

        System.out.println("\n\nVector methods ---> ");

        //Check size and capacity  
        System.out.println("\nSize is: " + vector.size());  
        System.out.println("\nDefault capacity is: " + vector.capacity()); 

        //Set the new size of the vector  
        vector.setSize(6);  
        System.out.println("\nNew size is: " + vector.size()); 

        //Trims the size to the number of elements  
        vector.trimToSize();   
        System.out.println("\nNew capacity is: " + vector.capacity());  

        //Get the element at specified index  
        System.out.println("\nElement at index 1 is = " + vector.get(1));  

        //Get the hashcode for this vector  
        System.out.println("\nHash code of this vector = "+vector.hashCode());  

        //Cloned vector
        System.out.println("\nCloned vector: "+vector.clone());  

        //Vector toArray() Method
        String[] array = new String[vector.size()];
        vector.toArray(array);
        System.out.println("\nVector to array : " + Arrays.toString(array));  

        //Get the first element
        System.out.println("\nFirst element of this vector = " + vector.firstElement());  
        
        //Insert the element at 2nd position  
        vector.insertElementAt("Kamal", 2);  
        System.out.println("\nElement in vector after insertion = " + vector); 

        //Set 5 at 4th index position  
        vector.set(4, "Ravi");              
        System.out.println("\nVector element after set: "+vector);  
        
        //Obtain an index of last occurrence of the specified element  
        System.out.println("\nIndex of element is: " + vector.lastIndexOf("Ravi")); 
        
        //Use subList() method to get subList of the vector  
        List<String> subList = vector.subList(2,6);  
        System.out.println("\nSublist elements: " + subList);   


        /*
         * Ways to iterate the Vector elements_______________________________________________________________________________________________________
         */

        System.out.println("\n\nWays to iterate the Vector elements--->"); 

        //Traversing vector through forEach() method
        System.out.println("\nTraversing vector through forEach() method:");
        vector.forEach(i-> {  
            System.out.println(i);  
        }); 

        //Get ListIterator object using listIterator() method along with returned index list  
        ListIterator<String> vectorItr = vector.listIterator(1);    
        System.out.println("\nIterate elements are: "); 
        while(vectorItr.hasNext()){  
            System.out.println(vectorItr.next());  
        }    

        //Get the element in the enumeration  
        Enumeration<Integer> enumobject = vecInt.elements();  
        System.out.println("\nData in enumeration object is: ");  
        while (enumobject.hasMoreElements())   
        {             
            System.out.println(enumobject.nextElement());  
        }  

        //Use forEachRemaining method    
        Stream<Integer> str = vecInt.stream();  
        Spliterator<Integer> splitr1 = str.spliterator();     
        System.out.println("\nEstimated size: " + splitr1.estimateSize());  
        System.out.println("\nContents of vector:");  

        splitr1.forEachRemaining((n) -> System.out.println(n));  

    }  
    
}  