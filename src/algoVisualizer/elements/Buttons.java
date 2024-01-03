package algoVisualizer.elements;

import algoVisualizer.VariablesManager;
import algoVisualizer.utils.ResetUtils;
import algoVisualizer.utils.ShuffleListUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons {

    private JButton sortBtn = new JButton("Sort");
    private JButton stopBtn = new JButton("Exit");
    private JButton shuffleBtn = new JButton("Shuffle");

    public void sortButtonListener() {
        sortBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (VariablesManager.isShuffle()) {
//                    sorting = true;
                    VariablesManager.setSorting(true);
                }
            }
        });
    }

    public void stopButtonListener() {
        stopBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
    }

    public void shuffleButtonListener() {
        shuffleBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ShuffleListUtils.shuffleList();
                ResetUtils.reset();
            }
        });
    }
}
