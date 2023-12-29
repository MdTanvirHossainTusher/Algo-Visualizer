package algoVisualizer.algorithms.sorting;

import algoVisualizer.utils.DelayUtils;
import algoVisualizer.utils.UpdateUtils;

public class QuickSort {
    private int check = -1;

    public int partition(int arr[], int low,int high){

        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            check=j;
            if(arr[j]<pivot){
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            UpdateUtils.update();
            DelayUtils.delay();
        }

        int tmp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = tmp;

        UpdateUtils.update();
        DelayUtils.delay();

        return (i+1);
    }

    public void quickSort(int arr[], int low,int high){
        int current=high;
        if(low<high){
            int pi=partition(arr, low,high);
            quickSort(arr, low,pi-1);
            quickSort(arr, pi+1,high);
        }
    }
}
