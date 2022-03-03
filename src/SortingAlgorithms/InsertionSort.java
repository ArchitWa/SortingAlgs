package SortingAlgorithms;

public class InsertionSort implements Sorter {
    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int loc = i;

            while (loc != 0 && arr[loc] < arr[loc - 1]) {
                swap(arr, loc, loc - 1);
                loc--;
            }
        }
    }

    @Override
    public String getName() {
        return "Insertion Sort";
    }

    @Override
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
