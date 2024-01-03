package algoVisualizer.algorithms.sorting;

import algoVisualizer.VariablesManager;
import algoVisualizer.utils.DelayUtils;
import algoVisualizer.utils.UpdateUtils;

public class MergeSort {

    //    private int check = -1;
    private static int arr[] = VariablesManager.getArray();
    private static int len = VariablesManager.getLen();
    private static int check = VariablesManager.getCheck();
    private static boolean sorting = VariablesManager.isSorting();

    public void doMerge(int l, int m, int r) { // int arr[], int l,int m,int r, boolean sorting

        int s1 = m - l + 1, s2 = r - m;
        int leftAuxiliary[] = new int[s1];
        int rightAuxiliary[] = new int[s2];

        for (int i = 0; i < s1; i++) {
            leftAuxiliary[i] = arr[l + i];
        }

        for (int i = 0; i < s2; i++) {
            rightAuxiliary[i] = arr[m + 1 + i];
        }

        int i = 0, j = 0, k = l;

        while (i < s1 && j < s2 && sorting) {

            check = k;
            if (leftAuxiliary[i] <= rightAuxiliary[j]) {
                arr[k] = leftAuxiliary[i];
                i++;
                k++;
            } else {
                arr[k] = rightAuxiliary[j];
                j++;
                k++;
            }
            UpdateUtils.update();
            DelayUtils.delay();

        }

        while (i < s1 && sorting) {
            arr[k] = leftAuxiliary[i];
            i++;
            k++;
            UpdateUtils.update();
            DelayUtils.delay();
        }
        while (j < s2 && sorting) {
            arr[k] = rightAuxiliary[j];
            j++;
            k++;
            UpdateUtils.update();
            DelayUtils.delay();
        }
    }

    public void mergeSort(int l, int r) { // int arr[], int l,int r, boolean sorting
        if (l < r) {
            int m = l + (r - l) / 2;

            int current = r;

            mergeSort(l, m);
            mergeSort(m + 1, r);

            doMerge(l, m, r);
        }
    }
}
