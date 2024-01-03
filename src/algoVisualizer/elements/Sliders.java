package algoVisualizer.elements;

import algoVisualizer.VariablesManager;
import algoVisualizer.utils.ResetUtils;
import algoVisualizer.utils.ShuffleListUtils;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Sliders {

//    private static JLabel arraySize = new JLabel("Array Size: ");
//    private static JSlider arraySizeSlider = new JSlider(50, 200, 50);
    private static JSlider arraySizeSlider = VariablesManager.getArraySizeSlider();

//    private static JLabel delay = new JLabel("Delay (ms) : ");
//    private static JSlider delaySlider = new JSlider(0, 100, 20);
    private static JSlider delaySlider = VariablesManager.getDelaySlider();

    public static void arraySizeSlider() {
        arraySizeSlider.addChangeListener(new ChangeListener() {
//            @Override
            public void stateChanged (ChangeEvent ce){
                int value = arraySizeSlider.getValue();
                //System.out.println(value+"--------");
//                len = value;
                VariablesManager.setLen(value);
                if (VariablesManager.getArray().length != VariablesManager.getLen()) {
                    ShuffleListUtils.shuffleList();
                }
                ResetUtils.reset();
            }
        });
    }

    public static void delaySlider() {
        delaySlider.addChangeListener(new ChangeListener() {
//            @Override
            public void stateChanged(ChangeEvent ce) {
//                speed = (int) delaySlider.getValue();
                VariablesManager.setSpeed((int) delaySlider.getValue());
            }
        });
    }
}
