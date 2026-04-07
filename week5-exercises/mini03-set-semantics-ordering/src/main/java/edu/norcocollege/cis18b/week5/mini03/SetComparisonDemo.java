package edu.norcocollege.cis18b.week5.mini03;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * Demonstrates how different Set implementations handle
 * uniqueness and ordering.
*/
public class SetComparisonDemo 
{

    public static void main(String[] args) 
    {
        // Source list includes duplicates and mixed capitalization
        List<String> tags = List.of("queue", "stack", "map", "set", "stack", "Queue");

        // HashSet removes duplicates but does not guarantee iteration order
        Set<String> hashSet = new HashSet<>(tags);

        // LinkedHashSet removes duplicates and preserves insertion order
        Set<String> linkedHashSet = new LinkedHashSet<>(tags);

        // TreeSet removes duplicates and sorts by natural (alphabetical) order
        Set<String> treeSet = new TreeSet<>(tags);

        System.out.println("HashSet: " + hashSet);
        System.out.println("HashSet explanation: removes duplicates, but output order is not guaranteed.");

        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("LinkedHashSet explanation: removes duplicates and preserves insertion order.");

        System.out.println("TreeSet: " + treeSet);
        System.out.println("TreeSet explanation: removes duplicates and stores elements in sorted order.");

        // Case-insensitive TreeSet treats values like "queue" and "Queue" as duplicates
        Set<String> caseInsensitive = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        caseInsensitive.addAll(tags);
        System.out.println("TreeSet (case-insensitive): " + caseInsensitive);
        System.out.println("Case-insensitive explanation: comparator affects sorting and what counts as a duplicate.");

        // Custom comparator: sort by length first, then alphabetically
        Set<String> customOrder = new TreeSet<>(
            Comparator.comparingInt(String::length).thenComparing(String::compareTo)
        );
        customOrder.addAll(tags);
        System.out.println("TreeSet (custom comparator): " + customOrder);
        System.out.println("Custom comparator explanation: sorts by length first, then alphabetically for ties.");
    }
}