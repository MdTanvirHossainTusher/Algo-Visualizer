package algoVisualizer.algorithms.searching;

import algoVisualizer.utils.DelayUtils;
import algoVisualizer.utils.UpdateUtils;

public class LinearSearch {

    private int currentKey = -1;
    private boolean got = false;
    public void linearSearch(int arr[], int len, boolean sorting, int key){



        for(int i=0;i<len-1 && sorting;i++){
            //currentKey=i;
            if(arr[i]==key){
                //System.out.println("found");
                currentKey=i;
                got=true;

                break;
            }
            else {
                currentKey=i;
                //System.out.println("not found");
                got=false;
            }
            check=i;
            UpdateUtils.update();
            DelayUtils.delay();
        }
    }
}
