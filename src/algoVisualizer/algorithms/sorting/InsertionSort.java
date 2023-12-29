package algoVisualizer.algorithms.sorting;

import algoVisualizer.utils.DelayUtils;
import algoVisualizer.utils.UpdateUtils;

public class InsertionSort {

    public void insertionSort(int arr[], int len, boolean sorting, int check){
        for(int i = 1; i < len; i++) {
            int current = i;
            int j = i;
            while(arr[j] < arr[j-1] && sorting) {

                int tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
                check = j;
                UpdateUtils.update();
                DelayUtils.delay();
                if(j > 1)
                    j--;
            }
        }
    }
}
