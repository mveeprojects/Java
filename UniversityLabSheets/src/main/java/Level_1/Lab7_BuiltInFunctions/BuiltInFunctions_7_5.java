package Level_1.Lab7_BuiltInFunctions;

import java.io.File;

class BuiltInFunctions_7_5 {

    BuiltInFunctions_7_5() {
        printFilesInDir();
    }

    private void printFilesInDir() {
        System.out.println("\n" + "1) Print files in dir");

        String dir_name = "c:\\Users";
        File dir = new File(dir_name);
        File[] dir_list = dir.listFiles();

        if (dir_list != null) {
            System.out.println("Files inside \"" + dir_name + "\":");
            for (File file : dir_list) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("No files or directories found in \"" + dir_name + "\", also check that directory \"" + dir_name + "\" exists");
        }
    }
}