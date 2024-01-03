package algoVisualizer.canvas;

import algoVisualizer.VariablesManager;
import algoVisualizer.utils.ResetUtils;
import algoVisualizer.utils.ShuffleListUtils;
import algoVisualizer.utils.UpdateUtils;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GraphTypes {
//    private final String[] algorithms = {"Bubble Sort", "Selection Sort", "Insertion Sort", "Merge Sort", "Quick Sort",
//            "Linear Search", "Binary Search"
//    };
//    private JComboBox algoType = new JComboBox(algorithms);
//    private JLabel controlLabel2 = new JLabel("Graph Types: ");
//    private final String[] barName = {"Bar Graph", "Dot Graph"};
//    private JComboBox barType = new JComboBox(barName);
//    private int type = 0;

    public GraphTypes() {
    }

    public void graphTypes() {
//        barType.addItemListener(new ItemListener() {
//        barType.addItemListener(new ItemListener() {
        VariablesManager.getBarType().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
//                type = barType.getSelectedIndex();
                VariablesManager.setType(VariablesManager.getBarType().getSelectedIndex());

                ShuffleListUtils.shuffleList();
                ResetUtils.reset();
                UpdateUtils.update();
            }
        });
    }
}
