package algoVisualizer.utils;


import algoVisualizer.VariablesManager;
import algoVisualizer.algorithms.SelectAlgo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PauseUtils {
    private static SelectAlgo selectAlgo = new SelectAlgo();
    public static void pause(){
        int i=0;
//        while(!sorting){
        boolean isSorting = VariablesManager.isSorting();
        while(!isSorting){
            i++;
            if(i>100)
                i=0;
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
                Logger.getLogger(PauseUtils.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
//        sorting();
        selectAlgo.sorting();
    }
}
