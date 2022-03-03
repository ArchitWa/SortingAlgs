package SortingAlgorithms;

public class DoubleSelectionSort implements Sorter {
    @Override
    public void sort(int[] arr) {
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

            swap(arr, minIdx, i);
            swap(arr, maxIdx, arr.length - i - 1);
        }
    }

    @Override
    public String getName() {
        return "Double Selection Sort";
    }

    @Override
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
