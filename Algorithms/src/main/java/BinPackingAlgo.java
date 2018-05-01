import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class BinPackingAlgo {

    private int numberOfItems;
    private int binSize;
    private ArrayList<Integer> items;
    private Scanner input;
    private boolean success;

    BinPackingAlgo() {
        success = true;
        items = new ArrayList<>();
        input = new Scanner(System.in);
        setNumberOfItems();
        setBinSize();
        addItemsToList();
        checkIfItemsFitInBins();
    }

    private void setNumberOfItems() {
        System.out.println("Enter the number of items");
        numberOfItems = input.nextInt();
    }

    private void setBinSize() {
        System.out.println("Enter the Size of the bin. All bins are of same size");
        binSize = input.nextInt();
    }

    private void addItemsToList() {
        System.out.println("Enter the items");
        for (int member = 0; member < numberOfItems; member++) {
            items.add(input.nextInt());
        }
        Collections.sort(items);
    }

    private void checkIfItemsFitInBins() {
        int count = 0;
        int binsize = numberOfItems - 1;
        int i = 0;
        while (i <= binsize) {
            int tmpsize = binSize;
            tmpsize = tmpsize - items.get(binsize--);
            if (tmpsize >= items.get(i)) {
                i++;
            } else if (tmpsize < items.get(i)) {
                System.out.println("one or more of the items exceeds the bin size");
                success = false;
                break;
            }
            count++;
        }
        if (success) {
            System.out.println("The Minimum number of bins required is " + count);
        } else {
            System.out.println("Failed to fit items in bins");
        }
    }
}