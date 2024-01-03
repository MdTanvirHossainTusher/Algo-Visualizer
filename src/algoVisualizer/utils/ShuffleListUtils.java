package algoVisualizer.utils;

import algoVisualizer.VariablesManager;

import java.util.Random;

public class ShuffleListUtils {

    private static Random rand = new Random();
//    private static int arr[] = VariablesManager.getArray();
    private static int arr[];
    private static int len = VariablesManager.getLen();
//    private static int len = 70;
    private static int currentIndex = VariablesManager.getCurrentIndex();
//    private static int currentIndex = 0;

    public static int[] shuffleList() {
//        if(!getInput){
        if(!VariablesManager.isGetInput()){
//        boolean getInput = false;
//        if(!getInput){
            arr = CreateArrayUtils.createArray();
            System.out.println(arr + "==============================");

            System.out.println(arr.length+" sssssssssssssssssssssssss+ \n");
            System.out.println(len+" llllllllllllllllllllllllll+ \n");

            for(int i = 0; i < 500; i++) {
//                for(int j = 0; j < ((crntIndex==5 || crntIndex==6) ? len-1:len); j++) {
//                    int random = rand.nextInt(((crntIndex==5 || crntIndex==6) ? len-1:len));
//
//                    int temp = arr[j];
//                    arr[j] = arr[random];
//                    arr[random] = temp;
//                }


                int chooseLength = ((currentIndex == 5 || currentIndex == 6) ? len - 1 : len);
                System.out.println(chooseLength+" cccccccccccccccccccccccc\n");
                for(int j = 0; j < chooseLength; j++) {
                    int random = rand.nextInt(chooseLength);

                    int temp = arr[j];
                    arr[j] = arr[random];
                    arr[random] = temp;
                    System.out.println("dhukseeeeeeeeeeeee\n");
                }
                for (int x: arr) {
                    System.out.print(x+" -- ");
                }
            }
        }
        else{
            CreateArrayUtils.createInputArray();

            if(currentIndex==5 || currentIndex==6){// search algo

                for(int i = 0; i < 500; i++) {
                    //System.out.println("---------------"+len);

//                    for(int j = 0; j < len-1; j++) {
//                        int random = rand.nextInt(len-1);
//
//                        int temp = arr[j];
//                        arr[j] = arr[random];
//                        arr[random] = temp;
//                    }


                    for(int j = 0; j < len-1; j++) {
                        int random = rand.nextInt(len-1);

                        int temp = arr[j];
                        arr[j] = arr[random];
                        arr[random] = temp;
                    }
                }
            }
            else{
                for(int i = 0; i < 500; i++) {
                    for(int j = 0; j < len; j++) {
                        int random = rand.nextInt(len);

                        int temp = arr[j];
                        arr[j] = arr[random];
                        arr[random] = temp;
                    }
                }
            }

        }
//        sorting = false;
//        shuffled = true;
        VariablesManager.setSorting(false);
        VariablesManager.setShuffle(true);

        return arr;
    }
}
