package algoVisualizer.algorithms.sorting;

import algoVisualizer.VariablesManager;
import algoVisualizer.utils.DelayUtils;
import algoVisualizer.utils.UpdateUtils;

public class SelectionSort {

    //    private int check=-1;
    private int len = VariablesManager.getLen();
    private boolean sorting = VariablesManager.isSorting();
    private int arr[] = VariablesManager.getArray();

    public void selectionSort() { // int arr[], int len, boolean sorting

        for (int i = 0; i < len && sorting; i++) {
            int item = i;
//            current=i;
            VariablesManager.setCurrent(i);
            for (int j = i + 1; j < len; j++) {
                if (!sorting) break;
                if (arr[j] < arr[item]) {
                    item = j;
                }
//                check=j;
                VariablesManager.setCheck(j);
                UpdateUtils.update();
                DelayUtils.delay();
            }
            if (i != item) {
                int tmp = arr[i];
                arr[i] = arr[item];
                arr[item] = tmp;
            }
        }
    }
}
