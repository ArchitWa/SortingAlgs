import java.util.ArrayList;
import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        // Some test arrays
        int[] test1 = {5, 2, 5, 5, 3, 3, 3, 2, 2, 2, 6, 3, 3, 5};
        int[] test2 = {7, 3, 4, 2, 6, 9, 1, 2};
        int[] test3 = {9, 8, 7, 6, 5, 4, 3, 2};
        int[] test4 = {3};
        int[] test5 = {};

        ArrayList<int[]> tests = new ArrayList<>();
        tests.add(test1);
        tests.add(test2);
        tests.add(test3);
        tests.add(test4);
        tests.add(test5);

//        for (int[] test : tests) {
//            System.out.println("-------------------------------");
//            System.out.println("Before: " + Arrays.toString(test));
//            DSSort(test);
//            System.out.println("After: " + Arrays.toString(test));
//            System.out.println("-------------------------------");
//        }

        DSSort(test3);
    }

    private static void bubbleSort(int[] arr) {
        boolean s = true;
        while (s) {
            s = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    s = true;
                }
            }
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int loc = i;

            while (loc != 0 && arr[loc] < arr[loc - 1]) {
                swap(arr, loc, loc - 1);
                loc--;
            }
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int m = Integer.MAX_VALUE, idx = -1;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < m) {
                    idx = j;
                    m = arr[j];
                }
            }
            swap(arr, i, idx);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void DSSort(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int minIdx = -1, maxIdx = -1;
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

            for (int j = i; j < arr.length - 1 - i; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIdx = j;
                }
                if (arr[j] > max) {
                    max = arr[j];
                    maxIdx = j;
                }
            }
            System.out.println(min + " " + max);
            System.out.println(Arrays.toString(arr));
            swap(arr, minIdx + 1, i);
            swap(arr, maxIdx, arr.length - i - 1);
        }
    }


}
