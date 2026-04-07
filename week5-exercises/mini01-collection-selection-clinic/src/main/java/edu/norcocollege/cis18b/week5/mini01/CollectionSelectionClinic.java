package edu.norcocollege.cis18b.week5.mini01;

import java.util.List;

// Added comments to understand program logic:

/*
 * Demonstrates choosing appropriate Java collection interfaces
 * based on different real-world scenarios.
*/
public class CollectionSelectionClinic 
{

    /*
     * Represents a scenario with a recommended collection type
     * and justification.
    */
    private static class Scenario 
    {
        private final String name;
        private final String bestChoice;
        private final String why;
        private final String implementationHint;

        Scenario(String name, String bestChoice, String why, String implementationHint) {
            this.name = name;
            this.bestChoice = bestChoice;
            this.why = why;
            this.implementationHint = implementationHint;
        }
    }

    public static void main(String[] args) 
    {

        // List of scenarios demonstrating when to use different collections
        List<Scenario> scenarios = List.of(
            new Scenario("Attendance log", "List", "Duplicates and arrival order matter.", "ArrayList"),
            new Scenario("Unique course codes", "Set", "Values should appear once.", "LinkedHashSet"),
            new Scenario("Student score lookup by ID", "Map", "Key-based lookup is the core operation.", "HashMap"),
            new Scenario("Help desk intake", "Queue", "First ticket in should be processed first.", "ArrayDeque"),
            new Scenario("Undo operations", "Deque", "LIFO behavior is needed for undo.", "ArrayDeque"),

            // Custom scenario added to meet assignment requirement
            new Scenario("Course waitlist", "Queue",
                "Students should be admitted in the order they joined the waitlist.",
                "ArrayDeque")
        );

        // Print each scenario and its recommended collection
        for (Scenario scenario : scenarios) {
            System.out.println("Scenario: " + scenario.name);
            System.out.println("Best choice: " + scenario.bestChoice);
            System.out.println("Why: " + scenario.why);
            System.out.println("Implementation hint: " + scenario.implementationHint);
            System.out.println();
        }
    }
}