package algoVisualizer.complexity;

import algoVisualizer.VariablesManager;
import algoVisualizer.utils.ResetUtils;
import algoVisualizer.utils.UpdateUtils;

import javax.swing.*;
import java.awt.event.ItemEvent;

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


//import static algoVisualizer.VariablesManager.complexityField;

public class AlgoComplexityShow extends JFrame{
//    private final String[] algoComplexity={
//            "Bubble Sort:\n\nTime Complexity:\n\nBest Case: O(n^2)\nAverage Case: O(n^2)\nWorst Case: O(n^2)\n\nSpace Complexity: O(1)\n",
//            "Selection Sort:\n\nTime Complexity:\n\nBest Case: O(n^2)\nAverage Case: O(n^2)\nWorst Case: O(n^2)\n\nSpace Complexity: O(1)\n",
//            "Insertion Sort:\n\nTime Complexity:\n\nBest Case: O(n)\nAverage Case: O(n^2)\nWorst Case: O(n^2)\n\nSpace Complexity: O(1)\n",
//            "Merge Sort:\n\nTime Complexity:\n\nBest Case: O(nlogn)\nAverage Case: O(nlogn)\nWorst Case: O(nlogn)\n\nSpace Complexity: O(n)\n",
//            "Quick Sort:\n\nTime Complexity:\n\nBest Case: O(nlogn)\nAverage Case: O(nlogn)\nWorst Case: O(n^2)\n\nSpace Complexity: O(n)\n",
//            "Linear Search:\n\nTime Complexity:\n\nBest Case: O(1)\nAverage Case: O(n/2)\nWorst Case: O(n)\n\nSpace Complexity: O(1)\n",
//            "Binary Search:\n\nTime Complexity:\n\nBest Case: O(1)\nAverage Case: O(logn)\nWorst Case: O(logn)\n\nSpace Complexity: O(1)\n"
//    };
//    JTextArea complexityField=new JTextArea(algoComplexity[crntIndex]);
    private static JLabel complexity = new JLabel("Complexity:");
//    private static JTextArea complexityField=new JTextArea(algoComplexity[VariablesManager.getCurrentIndex()]);
//    JScrollPane complexityScroll = new JScrollPane(complexityField, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);



    // "Complexity" text-field to show the complexity of the algorithm
    //complexityField=new JTextArea(algoComplexity[crntIndex]);
//        complexityField.setFont(font2);
//        complexityField.setLineWrap(true);
//        complexityField.setWrapStyleWord(true);

    public static void showAlgoComplexity() {
        VariablesManager.getComplexityField().setFont(VariablesManager.getFont2());
        VariablesManager.getComplexityField().setLineWrap(true);
        VariablesManager.getComplexityField().setWrapStyleWord(true);
    }


}
