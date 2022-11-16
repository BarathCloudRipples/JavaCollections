package io.github.collections.list;

import java.util.*;  

/*
 * Stack implements the last-in-first-out data structure (stack), List interface.
 * It is the subclass of Vector
 * No size limits.
 * Contains only the default constructor that creates an empty stack.
 * Can have duplicate values.
 * It is synchronized.
 */

class Stacklist{  
    public static void main(String args[])
    {  

        /*
        * Stack add elements_______________________________________________________________________________________________________________________
        */

        System.out.println("\n\nStack add elements ---> ");

        Stack<String> stack = new Stack<String>();  

        pushelement(stack, "Ravi");  
        pushelement(stack, "Ajith");  
        pushelement(stack, "Kamal");  
        pushelement(stack, "Vijay");  
        pushelement(stack, "Dhanush");  
        pushelement(stack, "Ravi");  
        System.out.println("\nInitial list of elements: " + stack);


        /*
         * Stack remove elements____________________________________________________________________________________________________________________
         */

        System.out.println("\n\nStack remove elements ---> ");

        popelement(stack);   
        popelement(stack);
        popelement(stack);


        /*
         * Stack methods____________________________________________________________________________________________________________________________
         */

        System.out.println("\n\nStack methods ---> ");

        // Size of the Stack 
        System.out.println("\nThe stack size is: " + stack.size());  

        // Checking stack is empty or not  
        boolean result = stack.empty();  
        System.out.println("\nIs the stack empty? " + result);  

        // Access element from the top of the stack  
        String actor = stack.peek();  
        System.out.println("\nElement at top: " + actor);  

        // Search an element   
        System.out.println("\nIndex of Ajith: " + stack.search("Ajith"));  


        /*
         * Ways to iterate the Stack elements________________________________________________________________________________________________________
         */

        System.out.println("\n\nWays to iterate the Stack elements--->"); 

        // Iteration over the stack  
        System.out.println("\nIteration over the stack: ");
        Iterator<String> itr = stack.iterator(); 
        while(itr.hasNext())
        {  
            System.out.println(itr.next());  
        }  

        // Invoking forEach() method for iteration over the stack  
        System.out.println("\nInvoking forEach() method: ");
        stack.forEach(n ->  
        {  
            System.out.println(n);  
        });  

        // Iteration over the Stack from top to bottom
        System.out.println("\nIteration over the Stack from top to bottom:");  
        ListIterator<String> ListIterator = stack.listIterator(stack.size());  
        while (ListIterator.hasPrevious())   
        {   
            System.out.println(ListIterator.previous());  
        }  
    }  

    //performing push operation  
    static void pushelement(Stack<String> stk, String str)   
    {  
        stk.push(str);  
        System.out.println("\npush -> " + str); 
        System.out.println("stack: " + stk);  
    }  

    //performing pop operation  
    static void popelement(Stack<String> stk)   
    {  
        System.out.print("\npop -> ");  
        String str = (String) stk.pop();  
        System.out.println(str);  
        System.out.println("stack: " + stk);  
    }  
}  