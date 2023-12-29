package algoVisualizer.algorithms.searching;

import algoVisualizer.utils.DelayUtils;
import algoVisualizer.utils.UpdateUtils;
import algorithmvisualizer.Visualization;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BinarySearch {
    private boolean found = false;
    public void binarySearch(int array[], boolean sorting, int key){

        Arrays.sort(array);

        int low=0, high=array.length-1;
//        found=false;

        while(low<=high && sorting){
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Visualization.class.getName()).log(Level.SEVERE, null, ex);
            }
            int mid = low+(high-low)/2;
            currentKey2=mid;
            if(array[mid]==key){
                //System.out.println("found");
                found=true;
                break;
            }
            else if(array[mid]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            check=mid;
            UpdateUtils.update();
            DelayUtils.delay();
        }
        if(!found){
            System.out.println("Key not found");
        }
        return;
    }
}
