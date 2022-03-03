package SortingAlgorithms;

public class SelectionSort implements Sorter {
    @Override
    public void sort(int[] arr) {
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

    @Override
    public String getName() {
        return "Selection Sort";
    }

    @Override
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
