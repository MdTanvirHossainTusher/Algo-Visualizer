package algoVisualizer.algorithms.searching;

import algoVisualizer.VariablesManager;
import algoVisualizer.utils.DelayUtils;
import algoVisualizer.utils.UpdateUtils;

public class LinearSearch {

//    private int currentKey = -1;
//    private boolean got = false;

    private int arr[] = VariablesManager.getArray();

    public void linearSearch() { // int arr[], int len, boolean sorting, int key


        for (int i = 0; i < VariablesManager.getLen() - 1 && VariablesManager.isSorting(); i++) {
            //currentKey=i;
            if (arr[i] == VariablesManager.getKey()) {
                //System.out.println("found");
//                currentKey=i;
//                got=true;

                VariablesManager.setCurrentKey(i);
                VariablesManager.setGot(true);

                break;
            } else {
//                currentKey = i;
//                got = false;

                VariablesManager.setCurrentKey(i);
                VariablesManager.setGot(false);
            }
//            check = i;
            VariablesManager.setCheck(i);
            UpdateUtils.update();
            DelayUtils.delay();
        }
    }
}
