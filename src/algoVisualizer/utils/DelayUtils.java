package algoVisualizer.utils;



import java.util.logging.Level;
import java.util.logging.Logger;

public class DelayUtils {
    public static void delay(){
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(DelayUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
