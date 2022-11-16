package io.github.collections.list;

import java.util.*;  

/*
 * List is interface and inherits the Collection interface.
 * No size limits.
 * Can have duplicate values and store null elements.
 * Implementation classes are ArrayList, LinkedList, Stack and Vector.
 * Can iterate the list in forward and backward directions.
 */

public class ListInterface
{  
    public static void main(String args[])
    {  

        /*
        * List add elements_______________________________________________________________________________________________________________________
        */

        System.out.println("\n\nLinkedList add elements --->"); 

        List<String> list = new ArrayList<String>();  

        list.add("Mango");  
        list.add("Apple");  
        list.add("Banana");  
        list.add("Grapes");  

        //accessing the element    
        System.out.println("\nReturning second element: " + list.get(1));

        //changing the element  
        list.set(1,"Dates");  

        System.out.println("\nIterating the Initial List element");
        for(String fruit:list)  
            System.out.println(fruit);   
  

        /*
         * Converting Array to List_______________________________________________________________________________________________________________
         */

        System.out.println("\n\nConverting Array to List --->"); 

        String[] arr = {"Java","Python","PHP","C++"};  
        System.out.println("\nPrinting Array: "+Arrays.toString(arr));  

        List<String> arrList = new ArrayList<String>();  
        for(String lang:arr)
        {  
            arrList.add(lang);  
        }  
        System.out.println("\nPrinting List: "+arrList);  


        //Sorting the list  
        Collections.sort(arrList);  


        /*
         * Converting List to Array________________________________________________________________________________________________________________
         */

        System.out.println("\n\nConverting List to Array --->"); 

        String[] array = arrList.toArray(new String[arrList.size()]);    
        System.out.println("\nPrinting Array: "+Arrays.toString(array));  
        System.out.println("\nPrinting List: "+arrList);  


        /*
         * Ways to iterate the List elements_______________________________________________________________________________________________________
         */

        System.out.println("\n\nWays to iterate the List elements --->");  

        //Traversing elements in forward direction
        ListIterator<String> itr = list.listIterator();  
        System.out.println("\nTraversing elements in forward direction:");    
        while(itr.hasNext())
        {    
            System.out.println("list[" + itr.nextIndex() + "]: " + itr.next());    
        }    

        //Traversing elements in backward direction
        System.out.println("\nTraversing elements in backward direction:");    
        while(itr.hasPrevious())
        {    
            System.out.println("list[" + itr.previousIndex() + "]: " + itr.previous());    
        }  
    }
}  