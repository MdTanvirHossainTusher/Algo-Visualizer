package algoVisualizer.utils;

import algorithmvisualizer.Visualization;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PauseUtils {
    public static void pause(boolean sorting){
        int i=0;
        while(!sorting){
            i++;
            if(i>100)
                i=0;
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
                Logger.getLogger(Visualization.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        sorting();
    }
}
