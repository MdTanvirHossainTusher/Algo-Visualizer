package algoVisualizer.algorithms.sorting;

import algoVisualizer.VariablesManager;
import algoVisualizer.utils.DelayUtils;
import algoVisualizer.utils.UpdateUtils;

public class BubbleSort {

    private static int arr[] = VariablesManager.getArray();
    private static int len = VariablesManager.getLen();
    private static int check = VariablesManager.getCheck();
    private static boolean sorting = VariablesManager.isSorting();

    public void bubbleSort() { // int arr[], int len, boolean sorting, int check
        int i = 1;
        boolean noSwap = false;
        for (; !noSwap && sorting; ) {
//        for(;!noSwap && VariablesManager.isSorting();){
            int current = len - i;
            noSwap = true;
            for (int j = 0; j < len - i; j++) {
                if (!sorting) break;
//                if(!VariablesManager.isSorting()) break;

                if (arr[j] > arr[j + 1]) {
                    noSwap = false;

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
//                check=j+1;
                VariablesManager.setCheck(j + 1);
                UpdateUtils.update();
                DelayUtils.delay();
            }
            i++;
        }
    }
}
