package algoVisualizer.panels;

import algoVisualizer.VariablesManager;

import javax.swing.*;
import java.awt.*;

public class PanelInitialization extends JFrame{

//    private static Container container = VariablesManager.getContainer();

//    private Container container;
    public Container panelInitialization(Container container) {

        // Frame Create
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(150,20,1280,720);
        setTitle("Algorithm Visualizer");
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);
        container.setBackground(Color.GRAY);

        setVisible(true);

        return container;
//        VariablesManager.setContainer(getContentPane());
//        VariablesManager.getContainer().setLayout(null);
//        VariablesManager.getContainer().setBackground(Color.GRAY);
    }
}
