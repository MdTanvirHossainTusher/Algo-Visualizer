package algoVisualizer.utils;

import algoVisualizer.VariablesManager;

import java.util.ArrayList;
import java.util.Random;

public class CreateArrayUtils {

    private static Random rand = new Random();
    private static int len = VariablesManager.getLen();
    private static int currentIndex = VariablesManager.getCurrentIndex();

    public static int[] createArray() {

        int newLen = ((currentIndex == 5 || currentIndex == 6) ? len - 1 : len);
        System.out.println(newLen+" +++++++++++++++++++++++ \n");
        int arr[] = new int[newLen];
//        int key = -1;

        for (int i = 0; i < newLen; i++) {
            arr[i] = rand.nextInt(newLen);
            //arr[i]=i+1;

        }
        System.out.println(arr.length+" ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,+ \n");

        VariablesManager.setArray(arr); //// new

//        key = arr[arr.length - 1];
        VariablesManager.setKey(arr[arr.length - 1]);
        return arr;
    }

    public static int[] createInputArray() {

        int newLen = ((currentIndex == 5 || currentIndex == 6) ? len - 1 : len);
        int arr[];
//        int key = -1;

        if (currentIndex == 5 || currentIndex == 6) {// search algo
            arr = new int[newLen - 1];
            for (int i = 0; i < newLen - 1; i++) {
                arr[i] = VariablesManager.getArrayList().get(i);

            }
        } else {
            arr = new int[newLen];
            for (int i = 0; i < newLen; i++) {
//                arr[i] = arrayList.get(i);
                arr[i] = VariablesManager.getArrayList().get(i);

            }
        }

        VariablesManager.setArray(arr); //// new

        ResetUtils.reset();
        UpdateUtils.update();

        return arr;
    }
}
