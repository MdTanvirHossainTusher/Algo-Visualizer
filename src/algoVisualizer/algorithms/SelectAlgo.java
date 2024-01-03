package algoVisualizer.algorithms;

import algoVisualizer.VariablesManager;
import algoVisualizer.algorithms.searching.BinarySearch;
import algoVisualizer.algorithms.searching.LinearSearch;
import algoVisualizer.algorithms.sorting.*;
import algoVisualizer.utils.PauseUtils;
import algoVisualizer.utils.ResetUtils;

public class SelectAlgo {

    BubbleSort bubbleSort = new BubbleSort();
    SelectionSort selectionSort = new SelectionSort();
    InsertionSort insertionSort = new InsertionSort();
    MergeSort mergeSort = new MergeSort();
    QuickSort quickSort = new QuickSort();

    LinearSearch linearSearch = new LinearSearch();
    BinarySearch binarySearch = new BinarySearch();
    public void sorting() {


        if (VariablesManager.isSorting()) {
//            switch (currentIndex) {
            switch (VariablesManager.getCurrentIndex()) {
                case 0:
//                    selectedAlgo.bubbleSort();
                    bubbleSort.bubbleSort(); // arr, len, sorting, check
                    break;
                case 1:
                    selectionSort.selectionSort(); // arr, len, sorting, check
                    break;
                case 2:
//                    selectedAlgo.insertionSort();
                    insertionSort.insertionSort(); // arr, len, sorting, check
                    break;
                case 3:
//                    selectedAlgo.mergeSort(0, arr.length - 1);
                    mergeSort.mergeSort(0, VariablesManager.getArray().length - 1); // arr, 0, arr.length - 1, sorting
                    break;
                case 4:
//                    selectedAlgo.quickSort(0, arr.length - 1);
                    quickSort.quickSort(0, VariablesManager.getArray().length - 1); // arr, 0, arr.length - 1, sorting
                    break;
                case 5:
//                    selectedAlgo.linearSearch();
                    linearSearch.linearSearch(); // arr, len, sorting, key
                    break;
                case 6:
//                    selectedAlgo.binarySearch();
                    binarySearch.binarySearch(); // arr, sorting, key
                    break;

            }
        }
        ResetUtils.reset();
        PauseUtils.pause();
    }
}
