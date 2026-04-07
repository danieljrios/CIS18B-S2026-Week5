package edu.norcocollege.cis18b.week5.mini04;

import java.util.ArrayDeque;
import java.util.Deque;


// Adding comments again to understand the code logic

/*
 * Demonstrates how ArrayDeque can model both FIFO queue behavior
 * and LIFO stack behavior. 
*/
public class DequeWorkbench 
{

    public static void main(String[] args) 
    {
        runFifoDemo();
        runLifoDemo();

        System.out.println("Explanation: ArrayDeque is preferred over legacy Stack because it is more modern, flexible, and supports both queue and stack operations efficiently.");
    }

    /*
     * Demonstrates FIFO behavior using addLast and removeFirst.
    */
    private static void runFifoDemo() 
    {
        Deque<String> helpDesk = new ArrayDeque<>();

        helpDesk.addLast("import roster");
        helpDesk.addLast("email reminder");
        helpDesk.addFirst("urgent outage");

        System.out.println("FIFO initial state: " + helpDesk);

        while (!helpDesk.isEmpty()) 
        {
            System.out.println("FIFO processed: " + helpDesk.removeFirst());
            System.out.println("FIFO current state: " + helpDesk);
        }
    }

    /*
     * Demonstrates LIFO behavior using push and pop.
    */
    private static void runLifoDemo() 
    {
        Deque<String> undoStack = new ArrayDeque<>();

        undoStack.push("rename file");
        undoStack.push("insert checkpoint");
        undoStack.push("delete paragraph");

        System.out.println("LIFO initial state: " + undoStack);

        while (!undoStack.isEmpty()) 
        {
            System.out.println("Undo popped: " + undoStack.pop());
            System.out.println("LIFO current state: " + undoStack);
        }
    }
}