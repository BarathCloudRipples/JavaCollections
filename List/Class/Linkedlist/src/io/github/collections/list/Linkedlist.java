package io.github.collections.list;

import java.util.*;  
import io.github.collections.Entity.Employee;

/*
 * LinkedList inherits the AbstractList class and implements List and Deque interfaces.
 * Can be used as a list, stack or queue.
 * Uses a doubly linked list to store the elements
 * Can have duplicate values and maintains insertion order.
 * Not synchronized.
 * Manipulation is fast because no shifting needs to occur.
 */

class Linkedlist{  
    public static void main(String args[])
    {  

        /*
        * LinkedList add elements_______________________________________________________________________________________________________________________
        */

        System.out.println("\n\nLinkedList add elements --->"); 

        LinkedList<String> lList = new LinkedList<String>(); 

        lList.add("Ravi"); 
        lList.add("Vijay");  
        lList.add("Aniruth");  
        lList.add("Siva");
        lList.add("Arjun"); 
        lList.add("Karthick");
        lList.add("Surya");

        System.out.println("\nInitial list of elements: " + lList); 

        //Adding second list elements to the first list at specific position  
        LinkedList<String> list=new LinkedList<String>();  
        list.add("Ravi");  
        list.add("Vikram");  
        lList.addAll(1, list);  
        System.out.println("\naddAll(int index, Collection<? extends E> c) method: " + lList);  

         //Adding an element at the first position  
         lList.addFirst("Dhruv");  
         System.out.println("\naddFirst(E e) method: " + lList);  

         //Adding an element at the last position  
         lList.addLast("Ajith");  
         System.out.println("\naddLast(E e) method: " + lList); 

        //Adding User-defined class objects
        List<Employee> empList = new LinkedList<Employee>();
        Employee emp1 = new Employee(101,"Jay","Software Developer");  
        Employee emp2 = new Employee(102,"Kumar","Support Engineer"); 
        empList.add(emp1);
        empList.add(emp2);
        
        
        /*
         * LinkedList remove elements___________________________________________________________________________________________________________________
         */

        System.out.println("\n\nLinkedList remove elements ---> ");

        //Removing specific element from LinkedList  
        lList.remove("Vijay");  
        System.out.println("\nremove('vijay') method: " + lList);   

        //Removing element on the basis of specific position  
        lList.remove(0);  
        System.out.println("\nremove(0) method: " + lList);   

        //Removing all the new elements from LinkedList  
        lList.removeAll(list);  
        System.out.println("\nremoveAll(list) method: " + lList); 

        //Removing first element from the list  
        lList.removeFirst();  
        System.out.println("\nremoveFirst() method: " + lList);  

        //Removing first element from the list  
        lList.removeLast();  
        System.out.println("\nremoveLast() method: " + lList);  

        //Removing first occurrence of element from the list  
        lList.removeFirstOccurrence("Siva");  
        System.out.println("\nremoveFirstOccurrence('Siva') method: " + lList);  

        //Removing last occurrence of element from the list  
        lList.removeLastOccurrence("Arjun");  
        System.out.println("\nremoveLastOccurrence('Arjun') method: " + lList);  


        /*
         * LinkedList methods___________________________________________________________________________________________________________________________
         */

        System.out.println("\n\nLinkedList methods ---> ");

        // LinkedList size
        System.out.println("\nThe size of the array is: " + lList.size());  

        //accessing the element    
        System.out.println("\nReturning element[1]: "+lList.get(1)); 

        //changing the element  
        lList.set(1,"Simbu");  
        System.out.println("\nAfter changing the element[1]: " + lList); 
        
        // Sorting LinkedList
        Collections.sort(lList); 
        System.out.println("\nSorted LinkedList: " + lList);  

        //Check whether the LinkedList is empty
        System.out.println("\nIs LinkedList Empty: "+lList.isEmpty());   


        /*
         * Ways to iterate the LinkedList elements______________________________________________________________________________________________________
         */

        System.out.println("\n\nWays to iterate the LinkedList elements--->"); 

        //Traversing the list of elements in reverse order  
        System.out.println("\nTraversing the list of elements in reverse order : "); 
        Iterator<String> desc = lList.descendingIterator();  
        while(desc.hasNext())  
        {  
            System.out.println(desc.next());  
        }  

        //Traversing the list of User-defined objects
        System.out.println("\nTraversing the list of User-defined objects : "); 
        for(Employee emp:empList)
        {  
            System.out.println(emp.empID+" "+emp.name+" "+emp.department);  
        }  
    }  
}  