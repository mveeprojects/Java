package GeneralFileStuff;

import java.io.*;
import java.util.Random;

class CheckFiles {

    private FileWriter fw;
    private FileReader readhandle;

    private final String filePath = new File("").getAbsolutePath() + "/Files/src/main/resources/";
    private final String outputFile = filePath.concat("somefile.txt");

    CheckFiles() {
        writeIntToFile();
        showFilesInDir();
//        readFileCountWords();


//        int x = generateRandomNumber(5, 10);
//        writeToFile(String.valueOf(x));
//        String rev = RevString("hello");
//        writeToFile(rev);
    }

    private void writeIntToFile() {
        for (int a = 1; a < 4; a++) {
            writeToFile(Integer.toString(a));
        }
    }

    private void writeToFile(String a) {
        try {
            fw = new FileWriter(outputFile);
            fw.write("here's the string you passed in: " + a);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFilesInDir() {
        String d = "";
        File dir = new File(filePath);
        File[] filesInDir = dir.listFiles();
        assert filesInDir != null;
        for (File aFilesInDir : filesInDir) {
            if (aFilesInDir.isFile()) {
                d = aFilesInDir.getName();
                if (d.endsWith(".json")) {
                    System.out.println(aFilesInDir.getName() + " is a JSON file");
                }
            } else {
                d = aFilesInDir.getName();
                System.out.println(d + " is a directory");
            }
        }
    }

    private void readFileCountWords() {
        int words = 0;
        try {
            readhandle = new FileReader("./somefile1.json");
            BufferedReader br = new BufferedReader(readhandle);
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] wordsOnLine = line.split(" ");
                words += wordsOnLine.length;
                System.out.println(words);
            }
            br.close();
            readhandle.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int generateRandomNumber(int a, int b) {
        int result = 0;
        Random rand = new Random();
        for (int i = 0; i < 10; ++i) {
            result = a + rand.nextInt(b - a + 1);
        }
        System.out.println(result);
        return result;
    }

    private String RevString(String x) {
        String reverse;
        reverse = (new StringBuffer(x).reverse().toString());
        return reverse;
    }
}
