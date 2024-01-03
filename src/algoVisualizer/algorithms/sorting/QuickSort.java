package algoVisualizer.algorithms.sorting;

import algoVisualizer.VariablesManager;
import algoVisualizer.models.CommonAlgoVariables;
import algoVisualizer.utils.DelayUtils;
import algoVisualizer.utils.UpdateUtils;

public class QuickSort {

    private static int arr[] = VariablesManager.getArray();
    CommonAlgoVariables commonAlgoVariables = new CommonAlgoVariables();
//    private int check = -1;


    public int partition(int low, int high) { // int arr[], int low,int high

        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
//            check=j;
            VariablesManager.setCheck(j);
            if (arr[j] < pivot) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            UpdateUtils.update();
            DelayUtils.delay();
        }

        int tmp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = tmp;

        UpdateUtils.update();
        DelayUtils.delay();

        return (i + 1);
    }

    public void quickSort(int low, int high) { // int arr[], int low,int high
//        int current=high;
        VariablesManager.setCurrent(high);
        if (low < high) {
            int pi = partition(low, high);
            quickSort(low, pi - 1);
            quickSort(pi + 1, high);
        }
    }
}
