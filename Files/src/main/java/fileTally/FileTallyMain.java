package fileTally;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

import static java.util.stream.Collectors.toMap;

public class FileTallyMain {
    public static void main(String[] args) {
        new FileTally();
    }
}

class FileTally {

    FileTally() {
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
        String st;
        List<String> stringList = new ArrayList<>();
        while ((st = br.readLine()) != null)
            stringList.add(st);
        br.close();
        return stringList;
    }

    private HashMap<String, Integer> calculateOccurrences(List<String> stringList, Set<String> uniqueValues) {
        HashMap<String, Integer> resultMap = new HashMap<>();
        uniqueValues.forEach(a -> {
                    int frequency = Collections.frequency(stringList, a);
                    resultMap.put(a, frequency);
                }
        );
        return resultMap;
    }

    private HashMap<String, Integer> retrieveTopFiveOccurrences(HashMap<String, Integer> occurrenceMap) {
        int count = 0;
        HashMap<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : occurrenceMap.entrySet()) {
            if (count == 5) break;
            result.put(entry.getKey(), entry.getValue());
            count++;
        }
        return result;
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