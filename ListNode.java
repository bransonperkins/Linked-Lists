import java.util.LinkedList;
import java.util.*;

public class ListNode {
    public static void main(String[] args) {
        // create linked list
        LinkedList<String> list = new LinkedList<String>();

        // 1. Check if the list is empty or not - print it to make sure method is doing it's job
        System.out.println(isItEmpty(list));

        // 2. Add nodes to the linked list
        addNode(list, "Test addNode method");
        addNode(list, "Test again!");

        System.out.println(list); // Print the linked list to make sure nodes were added to the linked list

        // 3. Make the linked list empty using makeEmpty method that was created
        makeEmpty(list);

        // Add some nodes back into the linked list
        addNode(list, "First Node");
        addNode(list, "Second Node");
        addNode(list, "Third Node");

        // 4. Prints all of the nodes within the linked list
        printList(list);

        // 5. Remove a node given its specific index using removeNode method
        removeNode(list, 0);
        System.out.println();
        printList(list); // Print to test if the node was removed

        // 6. Remove all nodes in the list
        removeAllNodes(list);

        // Add some nodes back into the linked list
        addNode(list, "First Node");
        addNode(list, "Second Node");
        addNode(list, "Third Node");

        // 7. Add a new node to the beginning (head) of the LinkedList
        addToFront(list, "Charlie");
        System.out.println();
        printList(list); // Print to test if it added the node to the beginning

        // 8. Add a new node after a given index in a given list
        addAfter(list, "Branson", 2);
        System.out.println();
        printList(list); // Print to test that it worked

        // 9. Append the contents of one list to another list
        // Create new list and add nodes to it to test functionality
        LinkedList<String> newList = new LinkedList<String>();
        addNode(newList, "One");
        addNode(newList, "Two");
        addNode(newList, "Three");
        append(list, newList);

        System.out.println();
        printList(list); // Print to test that it worked
        
        // 10. Print the contents of the list in reverse order
        System.out.println();
        printListRev(list);
    }

    // Create a new method that uses isEmpty() to test if a LinkedList is empty, return a boolean value.
    public static boolean isItEmpty(LinkedList<String> list) {
        if (list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Create a new method that uses add() to add a new node to a given LinkedList, no return needed.
    public static void addNode(LinkedList<String> list, String node) {
        list.add(node);
    }

    // Create a new method that tests if a list is empty. If it is, return a string explaining, if it isn't empty use clear() and return a string explaining.
    public static void makeEmpty(LinkedList<String> list) {
        if (list.size() == 0) {
            System.out.println("The list was already empty");
        } else {
            list.clear();
            System.out.println("The list is now empty");
        }
    }
    
    // Create a new method that prints each node in a given LinkedList on its own line.
    public static void printList(LinkedList<String> list) {
        for (String values : list) {
            System.out.println(values);
        }
    }

    // Create a new method with a list and an index as its arguements, use remove() to delete a node at that specific index.
    public static void removeNode(LinkedList<String> list, int index) {
        list.remove();
    }

    // Create a method that searches a list for the given data value and remove each occurrence of it
    public static void removeAllNodes(LinkedList<String> list) {
        // Convert linkedlist to array so it will be possible to remove each item based off of the index number
        String[] array = list.toArray(new String[list.size()]);
        // for loop that will go through and remove each node until there are none left in the linked list
        for (int i = 0; i < array.length ; i++) {
            removeNode(list, i);
        }
        if (list.size() == 0) {
            System.out.println("All nodes have been removed from the list.");
        }
    }

    // Create a new method that adds a new node to the beginning (head) of a given LinkedList.
    public static void addToFront(LinkedList<String> list, String node) {
        list.addFirst(node);
    }

    // Create a new method that adds a new node after a given index in a given list
    public static void addAfter(LinkedList<String> list, String node, int index) {
        // "index + 1" will allow the node to be placed after the index given
        list.add(index + 1, node);
    }

    // Create a new method that appends the contents of one given list to the end of another given list. (List2 = List2 + List1)
    public static void append(LinkedList<String> list1, LinkedList<String> list2) {
        list1.addAll(list2);
    }

    // Create a new method that prints the contents of a given list in reverse order
    public static void printListRev(LinkedList<String> list) {
        Collections.reverse(list);
        for (String values: list) {
            System.out.println(values.toString());
        }
    }

}