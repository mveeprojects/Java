package fileTally;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

import static java.util.stream.Collectors.toMap;

public class TopFiveNumbersMain {
    public static void main(String[] args) {
        new TopFiveNumbers();
    }
}

class TopFiveNumbers {

    TopFiveNumbers() {
        // replace the string value below with the full path to testfile.txt on your machine
        String filePath = "D:\\Workspace\\Java\\Files\\src\\main\\java\\fileTally\\testfile.txt";
        try {
            List<String> stringList = retrieveFileLines(filePath);
            Set<String> uniqueValues = new HashSet<>(stringList);
            HashMap<String, Integer> occurrenceMap = sortMapOutput(calculateOccurrences(stringList, uniqueValues));
            HashMap<String, Integer> topFiveOccurrences = sortMapOutput(retrieveTopFiveOccurrences(occurrenceMap));
            printMap(topFiveOccurrences);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<String> retrieveFileLines(String filePath) throws Exception {
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        List<String> lineList = new ArrayList<>();
        while ((line = br.readLine()) != null)
            lineList.add(line);
        br.close();
        return lineList;
    }

    private HashMap<String, Integer> calculateOccurrences(List<String> stringList, Set<String> uniqueValues) {
        HashMap<String, Integer> resultMap = new HashMap<>();
        uniqueValues.forEach(uniqueValue -> {
                    int frequency = Collections.frequency(stringList, uniqueValue);
                    resultMap.put(uniqueValue, frequency);
                }
        );
        return resultMap;
    }

    private HashMap<String, Integer> retrieveTopFiveOccurrences(HashMap<String, Integer> occurrenceMap) {
        return occurrenceMap
                .entrySet()
                .stream()
                .limit(5)
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
    }

    private HashMap<String, Integer> sortMapOutput(HashMap<String, Integer> mapToSort) {
        return mapToSort
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
    }

    private void printMap(Map<String, Integer> occurrenceMap) {
        occurrenceMap.forEach((key, value) -> System.out.println(key + " " + value));
    }
}