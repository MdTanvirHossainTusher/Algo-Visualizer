package algoVisualizer.utils;

public class UpdateUtils {

    public void update(){

        width=width_size/((crntIndex==5 || crntIndex==6) ? (len-1):len);
        canvas.repaint();
    }
}
