package algoVisualizer.algorithms.sorting;

public class MergeSort {
    public void doMerge(int arr[], int l,int m,int r, boolean sorting, int check){

        int s1=m-l+1;
        int s2=r-m;
        int left_auxi[]=new int[s1];
        int right_auxi[]=new int[s2];

        for(int i=0;i<s1;i++){
            left_auxi[i]=arr[l+i];
        }

        for(int i=0;i<s2;i++){
            right_auxi[i]=arr[m+1+i];
        }

        int i=0,j=0,k=l;

        while(i<s1 && j<s2 && sorting){

            check=k;
            if(left_auxi[i]<=right_auxi[j]){
                arr[k]=left_auxi[i];
                i++;
                k++;
            }
            else{
                arr[k]=right_auxi[j];
                j++;
                k++;
            }
            update();
            delay();

        }

        while(i<s1 && sorting){
            arr[k]=left_auxi[i];
            i++;
            k++;
            update();
            delay();
        }
        while(j<s2 && sorting){
            arr[k]=right_auxi[j];
            j++;
            k++;
            update();
            delay();
        }
    }
    public void mergeSort(int arr[], int l,int r, boolean sorting){
        if(l<r){
            int m=l+(r-l)/2;

            int current=r;

            mergeSort(arr, l,m, sorting);
            mergeSort(arr, m+1,r, sorting);

            doMerge(arr, l,m,r, sorting);
        }
    }
}
