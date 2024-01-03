package algoVisualizer.utils;

import algoVisualizer.VariablesManager;

public class UpdateUtils {
    private static int currentIndex = VariablesManager.getCurrentIndex(), len = VariablesManager.getLen();
    private static int width_size = 800;//780
    private static int height_size = 680;
    private static int width = width_size / ((currentIndex == 5 || currentIndex == 6) ? (len - 1) : len);

    public static void update() {

        width = width_size / ((currentIndex == 5 || currentIndex == 6) ? (len - 1) : len);
//        algoVisualizer.canvas.repaint();
        VariablesManager.getCanvas().repaint();
    }
}
