import java.util.ArrayList;

public class StringListSort {

    public static void selectionSort(ArrayList<String> items) {
        for (int i = 0; i < items.size(); i++) {
            String minVal = items.get(i);
            int minPos = i;
            for (int j = i + 1; j < items.size(); j++) {
                if (minVal.compareTo(items.get(j)) > 0) {
                    minVal = items.get(j);
                    minPos = j;
                }
            }
            if (minPos != i) {
                String tmp = items.get(i);
                items.set(i, minVal);
                items.set(minPos, tmp);
            }
        }
    }

    public static void insertionSort(ArrayList<String> items) {
        for (int i = 1; i < items.size(); i++) {
            int j = i;
            while (j > 0 && items.get(j).compareTo(items.get(j-1)) < 0) {
                String tmp = items.get(j);
                items.set(j, items.get(j-1));
                items.set(j-1, tmp);
                j--;
            }
        }
    }
    
    public static void main(String[] args) {

    } 
}