package edu.norcocollege.cis18b.week5.mini05;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnrollmentMapDemo 
{

    public static void main(String[] args) 
    {
        Map<String, Integer> enrollment = new HashMap<>();

        enrollment.put("SEC-101", 30);
        enrollment.put("SEC-102", 28);
        enrollment.put("SEC-099", 12);

        // Core map lifecycle operations
        enrollment.put("SEC-101", 32);
        enrollment.remove("SEC-099");

        // Lambda-based updates
        enrollment.merge("SEC-101", 1, Integer::sum);
        enrollment.compute("SEC-102", (key, value) -> value == null ? 1 : value + 2);
        enrollment.replace("SEC-102", enrollment.get("SEC-102"), 28);

        // Report using entrySet()
        for (Map.Entry<String, Integer> entry : enrollment.entrySet()) 
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Removed SEC-099");
        System.out.println("Updated with merge/compute operations.");

        Map<String, Integer> defaults = Map.of("retryLimit", 3, "waitlistCap", 10);
        System.out.println("Defaults: " + defaults);

        Map<String, List<String>> departments = new HashMap<>();
        departments.computeIfAbsent("CIS", key -> new java.util.ArrayList<>()).add("SEC-101");
        departments.computeIfAbsent("CIS", key -> new java.util.ArrayList<>()).add("SEC-102");
        System.out.println("Grouped sections: " + departments);

        // Final report using forEach()
        enrollment.forEach((section, count) ->
            System.out.println("Final report: " + section + " -> " + count)
        );

        System.out.println("Mutable key hazard: if a key's state changes after insertion, its hash code or equality can change, which can break lookup and make the entry hard to find in a hash-based map.");
    }
}