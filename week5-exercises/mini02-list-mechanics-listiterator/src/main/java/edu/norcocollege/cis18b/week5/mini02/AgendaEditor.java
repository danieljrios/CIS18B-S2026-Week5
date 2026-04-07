package edu.norcocollege.cis18b.week5.mini02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * Demonstrates safe list editing with ListIterator by updating,
 * inserting, removing, and traversing in reverse
*/
public class AgendaEditor 
{

    public static void main(String[] args) 
    {
        List<String> agenda = new ArrayList<>(List.of("Intro", "Demo", "Optional", "Quiz"));

        applyEdits(agenda);
        System.out.println("Forward: " + agenda);

        printReverse(agenda);
    }

    /*
     * Walks through the agenda using a ListIterator so edits can be made safely.
     * Replaces "Demo" with "Live Demo", inserts "Reflection" after it,
     * and removes any item that's labeled "Optional"
    */
    static void applyEdits(List<String> agenda) 
    {
        ListIterator<String> iterator = agenda.listIterator();

        while (iterator.hasNext()) 
            {
            String step = iterator.next();

            if ("Demo".equals(step)) 
            {
                iterator.set("Live Demo");
                iterator.add("Reflection");
            }

            // Safely removes "Optional" while iterating
            if ("Optional".equals(step)) 
            {
                iterator.remove();
            }
        }
    }

    /*
     * Traverses the list backward using ListIterator and prints the reversed order
    */
    static void printReverse(List<String> agenda) 
    {
        ListIterator<String> reverse = agenda.listIterator(agenda.size());
        List<String> reversed = new ArrayList<>();

        while (reverse.hasPrevious()) 
        {
            reversed.add(reverse.previous());
        }

        System.out.println("Reverse: " + reversed);
    }
}