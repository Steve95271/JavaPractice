package A05_StagePractice01;

import java.util.*;

public class NestedCollection {
    public static void main(String[] args) {
        ArrayList<String> walesCities = new ArrayList<>();
        ArrayList<String> englandCiteis = new ArrayList<>();
        ArrayList<String> scotlandCiteis = new ArrayList<>();

        walesCities.add("Cardiff");
        walesCities.add("Swansea");
        walesCities.add("Mumbles");
        walesCities.add("Southgate");

        englandCiteis.add("London");
        englandCiteis.add("Cambridge");
        englandCiteis.add("Southamton");
        englandCiteis.add("Bristol");

        scotlandCiteis.add("Edinburgh");
        scotlandCiteis.add("Glasgow");
        scotlandCiteis.add("Aberdeen");
        scotlandCiteis.add("Inverness");

        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

        hashMap.put("Wales", walesCities);
        hashMap.put("England", englandCiteis);
        hashMap.put("Scotland", scotlandCiteis);

        Set<Map.Entry<String, ArrayList<String>>> entries = new HashSet<>();

        entries = hashMap.entrySet();

        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String nation = entry.getKey();
            ArrayList<String> cities = entry.getValue();

            System.out.print(nation);
            System.out.print(": ");
            System.out.println(cities);
        }



    }
}
