import algoVisualizer.VariablesManager;
import algoVisualizer.algorithms.SelectAlgo;
import algoVisualizer.canvas.GraphCanvas;
import algoVisualizer.utils.PauseUtils;
import algoVisualizer.utils.ResetUtils;
import algoVisualizer.utils.ShuffleListUtils;
import algoVisualizer.panels.CodePanel;
import algoVisualizer.panels.PanelInitialization;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Random;

import algoVisualizer.algorithms.sorting.*;
import algoVisualizer.algorithms.searching.*;
import algoVisualizer.panels.*;


public class Visualization2 extends JFrame {

    CodePanel codePanel = new CodePanel();
    ControlPanel controlPanelObj = new ControlPanel();
    GraphPanel graphPanel = new GraphPanel();
    PanelInitialization panelInitialization = new PanelInitialization();
    private Container container;
    Visualization2() {
//        ShuffleListUtils.shuffleList();
//        initComponents();
    }

    public void initComponents() {

        int arr[] = ShuffleListUtils.shuffleList();

        System.out.println(arr.length+ " aaaaaaaaaaaalllllllllllllll\n");

        for (int x: arr) {
            System.out.print(x+" ee ");
        }

        CodePanel codePanel = new CodePanel();
        ControlPanel controlPanelObj = new ControlPanel();
        GraphPanel graphPanel = new GraphPanel();
        PanelInitialization panelInitialization = new PanelInitialization();

        container = panelInitialization.panelInitialization(container);
        container = controlPanelObj.controlPanelInitialization(container);
        container = graphPanel.graphPanelInitialization(container);
        container = codePanel.codePanelInitialization(container);

        controlPanelObj.algoTypeSelectionListener();
        controlPanelObj.barTypeSelectionListener();

        controlPanelObj.sortButtonListener();
        controlPanelObj.stopButtonListener();
        controlPanelObj.shuffleButtonListener();

        controlPanelObj.arraySizeSliderListener();
        controlPanelObj.delaySliderListener();


//        ****************** CREDIT ******************

//        creditBtn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                JOptionPane.showMessageDialog(null, "Golam Ibne Hamza\nID: 190104029\nAUST\n\n"
//                        + "Md Tanvir Hossain\nID: 190104036\nAUST", "Credit", JOptionPane.INFORMATION_MESSAGE);
//            }
//        });


        codePanel.okButtonListener();

        SelectAlgo selectAlgo = new SelectAlgo();
        selectAlgo.sorting();
    }
}
