package SortingAlgorithms;

public interface Sorter {
    public void sort(int[] arr);	// perform a sort on the input array

    public String getName();	// return the name for the sort

    public void swap(int[] arr, int i, int j);    // swaps two locations

}
