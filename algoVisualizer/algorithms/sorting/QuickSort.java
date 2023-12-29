package algoVisualizer.algorithms.sorting;

public class QuickSort {
    public int partition(int arr[], int low,int high, int check){

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
            update();
            delay();
        }

        int tmp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = tmp;

        update();
        delay();

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
