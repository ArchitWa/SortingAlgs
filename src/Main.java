import java.util.ArrayList;

import SortingAlgorithms.Sorter;
import SortingAlgorithms.SelectionSort;
import SortingAlgorithms.InsertionSort;
import SortingAlgorithms.DoubleSelectionSort;

public class Main {
    private static final int NUM_TRIALS = 100;

    private static final int MIN_SIZE = 10;
    private static final int MAX_SIZE = 5000;
    private static final int SKIP_INTERVAL = 100;

    public static void main(String[] args) {
        ArrayList<Sorter> sorters = new ArrayList<>();
        sorters.add(new DoubleSelectionSort());


        for (Sorter sort : sorters) {
            System.out.println("------------" + sort.getName() + "-------------");
            for (int size = MIN_SIZE; size < MAX_SIZE; size += SKIP_INTERVAL) {
                double time = testOnSize(sort, size, NUM_TRIALS);
                System.out.println(size + ", " + time);
            }
        }

    }

    private static double testOnSize(Sorter sort, int size, int numTrials) {
        double ellapsedTime = 0.0;

        for (int i = 0; i < numTrials; i++) {
            int[] testArr = generateRandomArray(size, 10);

            long start = System.nanoTime();
            sort.sort(testArr);
            long time = System.nanoTime() - start;

            ellapsedTime += time / 1000000.0;  // convert to milliseconds
        }

        return ellapsedTime;
    }

    private static int[] generateRandomArray(int size, int MAX_VAL) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * MAX_VAL + 1);
        }
        return arr;
    }
}
