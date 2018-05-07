package Level_1.Lab5;

import java.util.ArrayList;
import java.util.Collections;

class ObjectsAndArrays_5_5 {

    ObjectsAndArrays_5_5() {
        System.out.println("\n\n*** Objects and Arrays 5.5 ***");
        arrayListConsiderations1();
        arrayListConsiderations2();
    }


    private void arrayListConsiderations1() {
        ArrayList<Data> arrayA = createArrayList();
        ArrayList<Data> arrayB = new ArrayList<Data>();

        System.out.println("\nPrinting arrayA");
        printDataArray(arrayA);

        System.out.println("\nMaking arrayB reference arrayA");
        arrayB = arrayA;
        printDataArray(arrayB);

        System.out.println("\nRemoving an element from arrayA and re-printing it");
        arrayA.remove(1);
        printDataArray(arrayA);

        System.out.println("\nPrinting arrayB (arrayB stays up to date with arrayA as it directly references the arrayA variable (not just cloned)");
        printDataArray(arrayB);

        System.out.println("\nAdding new Data Object to arrayA and re-printing it");
        arrayA.add(new Data("Mark", 30));
        printDataArray(arrayA);

        System.out.println("\nPrinting arrayB");
        printDataArray(arrayB);
    }

    private void arrayListConsiderations2() {
        ArrayList<Data> arrayC = createArrayList();
        ArrayList<Data> arrayD;

        System.out.println("\nPrinting arrayC");
        printDataArray(arrayC);

        System.out.println("\nCloning arrayC to arrayD");
        arrayD = (ArrayList<Data>)arrayC.clone();

        System.out.println("\nPrinting arrayD");
        printDataArray(arrayD);

        System.out.println("\nRemoving an element from arrayC and re-printing");
        arrayC.remove(1);
        printDataArray(arrayC);

        System.out.println("\nPrinting arrayD (arrayD doesn't stay up to date with changes in arrayC as it just cloned the value of arrayC at a given point in time)");
        printDataArray(arrayD);
    }

    private ArrayList<Data> createArrayList() {
        ArrayList<Data> dataArrayList = new ArrayList<Data>();
        Data data1 = new Data("Fred", 21);
        Data data2 = new Data("Jane", 43);
        Data data3 = new Data("Zoe", 37);
        Collections.addAll(dataArrayList, data1, data2, data3);
        return dataArrayList;
    }

    private static void printDataArray(ArrayList<Data> array) {
        for (Data data : array) {
            data.Print();
        }
    }
}