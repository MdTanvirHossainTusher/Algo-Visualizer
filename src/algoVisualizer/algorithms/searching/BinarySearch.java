package algoVisualizer.algorithms.searching;

import algoVisualizer.VariablesManager;
import algoVisualizer.utils.DelayUtils;
import algoVisualizer.utils.UpdateUtils;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BinarySearch {
//    private boolean found = VariablesManager.isFound();
    private boolean sorting = VariablesManager.isSorting();
    private int array[] = VariablesManager.getArray();
    private int key = VariablesManager.getKey();
    private int check = VariablesManager.getCheck();

    public void binarySearch() { // int array[], boolean sorting, int key

        Arrays.sort(array);

        int low = 0, high = array.length - 1;
//        found=false;
        VariablesManager.setFound(false);

        while (low <= high && sorting) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(BinarySearch.class.getName()).log(Level.SEVERE, null, ex);
            }
            int mid = low + (high - low) / 2;
//            currentKey2=mid;
            VariablesManager.setCurrentKey2(mid);

            if (array[mid] == key) {
                //System.out.println("found");
//                found = true;
                VariablesManager.setFound(true);
                break;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
//            check = mid;
            VariablesManager.setCheck(mid);
            UpdateUtils.update();
            DelayUtils.delay();
        }
        if (!VariablesManager.isFound()) {
            System.out.println("Key not found");
        }
        return;
    }
}
