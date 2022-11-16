package io.github.collections.list;

import java.util.*;  
import io.github.collections.Entity.Employee;

/*
 * ArrayList inherits the AbstractList class and implements List interface.
 * No size limits.
 * Can have duplicate values and maintains insertion order.
 * Not synchronized.
 * Little bit slower than the LinkedList.
 */

class Arraylist
{  
    public static void main(String args[])
    {  

        /*
         * ArrayList add elements_________________________________________________________________________________________________________________
         */

        System.out.println("\n\nArrayList add elements --->"); 
        
        ArrayList<String> arrList = new ArrayList<String>(); 
         
        //Adding elements to the ArrayList
        arrList.add("Ravi"); 
        arrList.add("Vijay");  
        arrList.add("Ravi");  
        arrList.add("Arjun"); 
        System.out.println("\nInitial list of elements: " + arrList);  

        //Adding an element at the specific position  
        arrList.add(1, "Ajith");  
        System.out.println("\nadd(int index, E element) method: " + arrList);  

        //Adding second list elements to the first list 
        ArrayList<String> arr1 = new ArrayList<String>();  
        arr1.add("Karthick");  
        arr1.add("Aniruth");   
        arrList.addAll(arr1);  
        System.out.println("\naddAll(Collection<? extends E> c) method: " + arrList);  

        //Adding second list elements to the first list at specific position 
        ArrayList<String> arr2 = new ArrayList<String>();  
        arr2.add("Kamal");  
        arr2.add("Simbu"); 
        arrList.addAll(1, arr2);  
        System.out.println("\naddAll(int index, Collection<? extends E> c) method: " + arrList); 
        
        //Adding User-defined class objects
        ArrayList<Employee> empList = new ArrayList<Employee>();
        Employee emp1 = new Employee(101,"Jay","Software Developer");  
        Employee emp2 = new Employee(102,"Kumar","Support Engineer"); 
        empList.add(emp1);
        empList.add(emp2);
        System.out.println("\nadd(E e) method for User-defined class: " + empList); 


        /*
         * ArrayList remove elements_________________________________________________________________________________________________________________
         */

        System.out.println("\n\nArrayList remove elements ---> ");

        //Removing specific element from arraylist  
        arrList.remove("Vijay");  
        System.out.println("\nremove(vijay) method: "+arrList);   

        //Removing element on the basis of specific position  
        arrList.remove(0);  
        System.out.println("\nremove(0) method: "+arrList);    

        //Removing all the new elements from arraylist  
        arrList.removeAll(arr2);  
        System.out.println("\nremoveAll() method: "+arrList);   

        //Removing elements on the basis of specified condition  
        arrList.removeIf(str -> str.contains("Arjun"));     
        System.out.println("\nremoveIf() method: "+arrList); 


        /*
         * ArrayList methods__________________________________________________________________________________________________________________________
         */

        System.out.println("\n\nArrayList methods ---> ");

        // ArrayList size
        System.out.println("\nThe size of the arrayList is: " + arrList.size());  

        //accessing the element    
        System.out.println("\nReturning element[1]: "+arrList.get(1)); 

        //changing the element  
        arrList.set(1,"Dhanush");  
        
        // Sorting ArrayList
        Collections.sort(arrList); 
        System.out.println("\nSorted ArrayList: " + arrList);  

        //Check whether the ArrayList is empty
        System.out.println("\nIs ArrayList Empty: "+arrList.isEmpty());   

        
        /*
         * Ways to iterate the ArrayList elements_____________________________________________________________________________________________________
         */

        System.out.println("\n\nWays to iterate the ArrayList elements --->"); 

        //Traversing arrList through Iterator
        Iterator<String> itr = arrList.iterator();    
        System.out.println("\nTraversing arrList through Iterator:");
        while(itr.hasNext())
        {  
            System.out.println(itr.next());  
        }  

        //Traversing arrList through List Iterator
        ListIterator<String> itrList = arrList.listIterator(arrList.size());
        System.out.println("\nTraversing arrList through List Iterator:"); 
        while(itrList.hasPrevious())  //Here, element iterates in reverse order
        {  
            String str = itrList.previous();  
            System.out.println(str);  
        }  

        //Traversing arrList through for loop
        System.out.println("\nTraversing arrList through for loop:");  
        for(int i = 0 ; i < arrList.size() ; i++)  
        {  
            System.out.println(arrList.get(i));     
        }  
              
        System.out.println("\nTraversing arrList through forEach() method:");
        arrList.forEach(a-> {  
            System.out.println(a);  
        });  

        //Traversing elements of ArrayList object
        Iterator<Employee> itr1 = empList.iterator(); 
        System.out.println("\nTraversing elements of ArrayList object:");
        while(itr1.hasNext())
        {  
            Employee employee = itr1.next();  
            System.out.println(employee.empID + " " + employee.name + " " + employee.department);  
        }  
    }  
}  