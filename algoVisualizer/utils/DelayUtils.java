package algoVisualizer.utils;

import algorithmvisualizer.Visualization;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DelayUtils {
    public void delay(int speed){
        try {
            Thread.sleep(speed);
        } catch (InterruptedException ex) {
            Logger.getLogger(Visualization.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
