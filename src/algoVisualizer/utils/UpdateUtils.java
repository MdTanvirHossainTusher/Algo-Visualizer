package algoVisualizer.utils;

public class UpdateUtils {

    public static void update(){

        width=width_size/((currentIndex==5 || currentIndex==6) ? (len-1):len);
        canvas.repaint();
    }
}
