package HackerRankIPK;

import java.util.*;
import java.util.stream.Collectors;

public class SparseArrays {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<String> queries = new ArrayList<>();

        Collections.addAll(strings, "ab", "ab", "abc");
        Collections.addAll(queries, "ab", "abc", "bc");

        List<Integer> integers = matchingString3(strings, queries);
        System.out.println(integers);
    }


    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> results = new ArrayList<>();
        for (String query : queries) {
            int frequency = Collections.frequency(strings, query);
            results.add(frequency);
        }

        return results;
    }

    /**
     * HashMap implementation
     * @param strings
     * @param queries
     * @return
     */
    public static List<Integer> matchingStrings2(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> results = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String query : queries) {
            hashMap.put(query, 0);
        }

        for (String string : strings) {
            if (hashMap.containsKey(string)) {
                hashMap.put(string, hashMap.get(string) + 1);
            }
        }

        for (String query : queries) {
            results.add(hashMap.get(query));
        }


        return results;
    }

    /**
     * Improved hashmap implementation
     * @param strings
     * @param queries
     * @return instances occurs
     */
    public static List<Integer> matchingString3(List<String> strings, List<String> queries) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String string : strings) {
            if (hashMap.containsKey(string)) {
                hashMap.put(string, hashMap.get(string) + 1);
            } else {
                hashMap.put(string, 1);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (String query : queries) {
            result.add(hashMap.getOrDefault(query, 0));
        }

        return result;
    }
}
