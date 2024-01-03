package algoVisualizer.utils;


import algoVisualizer.VariablesManager;

public class ResetUtils {

    public static void reset(){
//        sorting=false;
//        current=-1;
//        check=-1;

        VariablesManager.setSorting(false);
        VariablesManager.setCurrent(-1);
        VariablesManager.setCheck(-1);
        UpdateUtils.update();

    }
}
