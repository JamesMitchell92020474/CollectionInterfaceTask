/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectioninterfacetask;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * CollectionInterfaceTask.java
 * @author James Mitchell 92020474
 * @date 3/09/19
 * 
 */
public class CollectionInterfaceTask {
    
    //creating 2 objects of concrete classes ArrayList and LinkedList
    private static final ArrayList testArrayList = new ArrayList();
    private static final LinkedList testLinkedList = new LinkedList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // adding elements to the concrete classes
        testArrayList.add(3.14);
        testArrayList.add(5.82);
        testArrayList.add(4.63);
        
        testLinkedList.add(5.87);
        testLinkedList.add(3.14);
        testLinkedList.add(3.37);
        
        //display the number of elements in the list.
        System.out.println("Number of items in ArrayList: " + testArrayList.size());
        System.out.println("Number of items in LinkedList: " + testLinkedList.size());
        
        //printing out collection elements
        System.out.println("\nArray List:");
        testArrayList.forEach((o) -> {
            System.out.println(o);
        });
        
        System.out.println("\nLinked List:");
        testLinkedList.forEach((o) -> {
            System.out.println(o);
        });
        
        //checks if collections contain 3.14 and removes the element
        if (testArrayList.contains(3.14)){
            System.out.println("\nThe ArrayList contains 3.14, which will now be removed.");
            testArrayList.remove(3.14);
        }
        else 
            System.out.println("\nThe ArrayList list does not contain 3.14.");
        
        if (testLinkedList.contains(3.14)){
            System.out.println("\nThe LinkedList contains 3.14, which will now be removed.");
            testLinkedList.remove(3.14);
        }
        else 
            System.out.println("\nThe LinkedList list does not contain 3.14.");
        
        //Print out the new lists after 3.14 has been removed
        System.out.println("\nNew Array List:");
        testArrayList.forEach((o) -> {
            System.out.println(o);
        });
        
        System.out.println("\nNew Linked List:");
        testLinkedList.forEach((o) -> {
            System.out.println(o);
        });
        
        //Clears the collection
        testArrayList.clear();
        testLinkedList.clear();
        
        //Displays the cleared lists
        if (testArrayList.isEmpty()) {
            System.out.println("\nThe ArrayList has now been cleared");
        } else {
            testArrayList.forEach((o) -> {
                System.out.println(o);
            });
        }
        
        if (testLinkedList.isEmpty()) {
            System.out.println("\nThe LinkedList has now been cleared");
        } else {
            testLinkedList.forEach((o) -> {
                System.out.println(o);
            });
        }
        
        System.out.println("\nMethods used to complete this task:");
        System.out.println("boolean add (E e)\nvoid clear()\nboolean contains(Object o)");
        System.out.println("boolean isEmpty()\nboolean remove()\nint size()\n");
    }
    
}
