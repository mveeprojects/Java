package FileSorter;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FileSorter {

    private final String filePath = new File("").getAbsolutePath() + "/Files/src/main/resources/";
    private final String inputFile = filePath.concat("samplefile.txt");
    private final String outputFile = filePath.concat("samplefilesorted.txt");

    private List<String> lineList;

    private FileReader fileReader;
    private BufferedReader bufferedReader;
    private FileWriter fileWriter;
    private PrintWriter printWriter;

    FileSorter() {
        setUp();
        try {
            readFromFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sortFileContents();
        writeToFile();
    }

    private void setUp() {
        try {
            fileReader = new FileReader(inputFile);
            fileWriter = new FileWriter(outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        bufferedReader = new BufferedReader(fileReader);
        lineList = new ArrayList<>();
        printWriter = new PrintWriter(fileWriter);
    }

    private void readFromFile() throws IOException {
        String inputLine;
        while ((inputLine = bufferedReader.readLine()) != null) {
            lineList.add(inputLine);
        }
        try {
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sortFileContents() {
        Collections.sort(lineList);
    }

    private void writeToFile() {
        for (String outputLine : lineList) {
            printWriter.println(outputLine);
        }
        printWriter.flush();
        printWriter.close();
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}