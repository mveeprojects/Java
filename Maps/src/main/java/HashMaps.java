import java.util.HashMap;
import java.util.Map;

class HashMaps {

    private Map<String, String> carMap;

    HashMaps() {
        carMap = new HashMap<>();
        populateHashMap();
        readHashMap();
    }

    private void populateHashMap() {
        carMap.put("Ford", "Fiesta");
        carMap.put("Ferrari", "458");
    }

    private void readHashMap() {
        for (String car : carMap.keySet()) {
            System.out.println(car);
        }
    }
}