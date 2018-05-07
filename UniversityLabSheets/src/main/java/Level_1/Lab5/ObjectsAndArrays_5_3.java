package Level_1.Lab5;

import java.util.ArrayList;
import java.util.Collections;

class ObjectsAndArrays_5_3 {

    ObjectsAndArrays_5_3() {
        System.out.println("\n" + "*** Objects and Arrays 5.3 ***");
        usingArrayLists();
    }

    private void usingArrayLists() {
        ArrayList<Data> dataArrayList = new ArrayList<Data>();
        Data data1 = new Data("Fred", 21);
        Data data2 = new Data("Jane", 43);
        Data data3 = new Data("Zoe", 37);
        Collections.addAll(dataArrayList, data1, data2, data3);
        PrintDataArray(dataArrayList);
    }

    private static void PrintDataArray(ArrayList<Data> array) {
        for (Data data : array) {
            data.Print();
        }
    }
}