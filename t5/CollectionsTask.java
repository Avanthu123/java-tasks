package t5;

import java.util.*;

public class CollectionsTask {
    public static void main(String[] args) {
        // 1. Store objects in List
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Apple");
        items.add("Orange");
        items.add("Banana");
        items.add("Apple");

        System.out.println("Original List: " + items);

        // 2. Remove duplicates with Set
        Set<String> uniqueItems = new LinkedHashSet<>(items);
        System.out.println("Unique Items (Set): " + uniqueItems);

        // 3. Count frequency using Map
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String item : items) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
        
        System.out.println("Frequency Count: " + frequencyMap);
    }
}
