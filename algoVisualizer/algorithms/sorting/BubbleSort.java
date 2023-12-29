package algoVisualizer.algorithms.sorting;

public class BubbleSort {

    public void bubbleSort(int arr[], int len, boolean sorting, int check){
        int i=1;
        boolean noSwap=false;
        for(;!noSwap && sorting;){
            int current=len-i;
            noSwap=true;
            for(int j=0;j<len-i;j++){
                if(!sorting) break;

                if(arr[j]>arr[j+1]){
                    noSwap=false;

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
                check=j+1;
                update();
                delay();
            }
            i++;
        }
    }
}
