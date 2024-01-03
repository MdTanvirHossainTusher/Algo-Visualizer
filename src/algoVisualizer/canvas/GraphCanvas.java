package algoVisualizer.canvas;

import algoVisualizer.VariablesManager;

import javax.swing.*;
import java.awt.*;

public class GraphCanvas extends JPanel {

    private int current = VariablesManager.getCurrent();
    private int crntIndex = VariablesManager.getCurrentIndex();
    private int currentKey = VariablesManager.getCurrentKey();
    private int currentKey2 = VariablesManager.getCurrentKey2();
    private int len = VariablesManager.getLen();
    private int arr[] = VariablesManager.getArray();
    private int type = VariablesManager.getType();
    private int check = VariablesManager.getCheck();

    public GraphCanvas() {
        setBackground(Color.BLACK);
    }

    public void paintComponent(Graphics graph) {
        super.paintComponent(graph);

        //len=value;
        int changeLength = ((crntIndex == 5 || crntIndex == 6) ? len - 1 : len);
        //System.out.println(changeLength+"======");
        for (int i = 0; i < changeLength; i++) {
            //int height;
            try {
//                height = (arr[i] * width);
                VariablesManager.setHeight(arr[i] * VariablesManager.getWidth());
            }
            catch (Exception e) {
            }

            if (type == 0) {
                graph.setColor(new Color(64, 135, 252));//new Color(64,135,252)

                if (crntIndex == 5) {// linear search
                    if (currentKey > -1 && i == check) {
                        graph.setColor(Color.RED);
                    }
//                    if (currentKey == i && i < len - 2 && got) {
                    if (currentKey == i && i < len - 2 && VariablesManager.isGot()) {
                        graph.setColor(Color.GREEN);

                    }

                } else if (crntIndex == 6) {// binary search
                    if (currentKey2 > -1 && check == i) {
                        graph.setColor(Color.RED);
                    }

//                    if (i == mid && found && i < len - 2) {
                    if (i == VariablesManager.getMid() && VariablesManager.isFound() && i < len - 2) {
                        graph.setColor(Color.GREEN);

                    }

                } else {
                    if (current > -1 && i == current) {
                        graph.setColor(Color.GREEN);
                    }
                    if (check > -1 && i == check) {
                        graph.setColor(Color.RED);
                    }
                }
//                graph.fillRect(i * width, width_size - height, width, height);
                graph.fillRect(i * VariablesManager.getWidth(), VariablesManager.getWidthSize() - VariablesManager.getHeight(),
                        VariablesManager.getWidth(), VariablesManager.getHeight());
                graph.setColor(Color.BLACK);
//                graph.drawRect(i * width, width_size - height, width, height);
                graph.drawRect(i * VariablesManager.getWidth(), VariablesManager.getWidthSize() - VariablesManager.getHeight(),
                        VariablesManager.getWidth(), VariablesManager.getHeight());
            } else if (type == 1) {
                graph.setColor(new Color(64, 135, 252));

                if (crntIndex == 5) {// linear search
                    if (currentKey > -1 && i == check) {
                        graph.setColor(Color.RED);
                    }
//                    if (currentKey == i && i < len - 2 && got) {
                    if (currentKey == i && i < len - 2 && VariablesManager.isGot()) {
                        graph.setColor(Color.GREEN);

                    }

                } else if (crntIndex == 6) {// binary search
                    if (currentKey2 > -1 && check == i) {
                        graph.setColor(Color.RED);
                    }

//                    if (i == mid && found && i < len - 2) {
                    if (i == VariablesManager.getMid() && VariablesManager.isFound() && i < len - 2) {
                        graph.setColor(Color.GREEN);

                    }
                } else {
                    if (current > -1 && i == current) {
                        graph.setColor(Color.GREEN);
                    }
                    if (check > -1 && i == check) {
                        graph.setColor(Color.RED);
                    }
                }
//                graph.fillOval(i * width, width_size - height, width, width);
                graph.fillOval(i * VariablesManager.getWidth(), VariablesManager.getWidthSize() - VariablesManager.getHeight(),
                        VariablesManager.getWidth(), VariablesManager.getHeight());
            }
        }
    }
}