package algoVisualizer.panels;

import algoVisualizer.VariablesManager;
import algoVisualizer.utils.ResetUtils;
import algoVisualizer.utils.ShuffleListUtils;
import algoVisualizer.utils.UpdateUtils;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ControlPanel extends JFrame{

//    private Font VariablesManager.getFont() = new Font("Arial", Font.BOLD, 14);
//    private Font VariablesManager.getFont2() = new Font("Arial", Font.BOLD, 12);
//    private Font VariablesManager.getFont()3 = new Font("Arial", Font.BOLD, 18);

    private JPanel controlPanel = new JPanel();
    private final JLabel controlLabel1 = new JLabel("Algorithms: ");

//    JComboBox algoType = new JComboBox(algorithms);
    private JComboBox algoType = new JComboBox(VariablesManager.getAlgoNames());

    private final JLabel controlLabel2 = new JLabel("Graph Types: ");
    private final String[] barName = {"Bar Graph", "Dot Graph"};
    private JComboBox barType = new JComboBox(barName);

    private JButton sortBtn = new JButton("Sort");
    private JButton stopBtn = new JButton("Exit");
    private JButton shuffleBtn = new JButton("Shuffle");



//    private JLabel codeLabel1 = new JLabel("Code: ");

//    private String[] showCode = {"public void bubbleSort()\n{\n    int i=1;\n    boolean noSwap=false;\n    for(;!noSwap && sorting;)\n    {\n        current=len-i;\n        noSwap=true;\n\n        for(int j=0;j<len-i;j++)\n        {\n            if(!sorting) break;\n            if(arr[j]>arr[j+1])\n            {\n                noSwap=false;\n\n                int temp=arr[j];\n                arr[j]=arr[j+1];\n                arr[j+1]=temp;\n            }\n            check=j+1;\n            update();\n            delay();\n        }\n        i++;\n    }\n}",
//            "public void selectionSort()\n{\n    for(int i=0;i<len && sorting;i++)\n    {\n        int item=i;\n        current=i;\n        for(int j=i+1;j<len;j++)\n        {\n            if(!sorting) break;\n            if(arr[j]<arr[item])\n            {\n                item=j;\n            }\n            check=j;\n            update();\n            delay();\n        }\n        if(i!=item)\n        {\n            int tmp = arr[i];\n            arr[i] = arr[item];\n            arr[item] = tmp;\n        }\n    }\n}\n",
//            "public void insertionSort()\n{\n    for(int i = 1; i < len; i++)\n    {\n        current = i;\n        int j = i;\n        while(arr[j] < arr[j-1] && sorting)\n        {\n            int tmp = arr[j];\n            arr[j] = arr[j-1];\n            arr[j-1] = tmp;\n\n            check = j;\n            update();\n            delay();\n\n            if(j > 1)\n                j--;\n        }\n    }\n}\n",
//            "public void doMerge(int l,int m,int r)\n{\n    int s1=m-l+1;\n    int s2=r-m;\n    int left_auxi[]=new int[s1];\n    int right_auxi[]=new int[s2];\n    for(int i=0;i<s1;i++)\n    {\n        left_auxi[i]=arr[l+i];\n    }\n    for(int i=0;i<s2;i++)\n    {\n        right_auxi[i]=arr[m+1+i];\n    }\n    int i=0,j=0,k=l;\n    while(i<s1 && j<s2 && sorting)\n    {\n        check=k;\n        if(left_auxi[i]<=right_auxi[j])\n        {\n            arr[k]=left_auxi[i];\n            i++;\n            k++;\n        }\n        else\n        {\n            arr[k]=right_auxi[j];\n            j++;\n            k++;\n        }\n        update();\n        delay();\n    }\n    while(i<s1 && sorting)\n    {\n        arr[k]=left_auxi[i];\n        i++;\n        k++;\n        update();\n        delay();\n    }\n    while(j<s2 && sorting)\n    {\n        arr[k]=right_auxi[j];\n        j++;\n        k++;\n        update();\n        delay();\n    }\n}\n\npublic void mergeSort(int l,int r)\n{\n    if(l<r)\n    {\n        int m=l+(r-l)/2;\n        current=r;\n        mergeSort(l,m);\n        mergeSort(m+1,r);\n        doMerge(l,m,r);\n    }\n}\n",
//            "public int partition(int low,int high)\n{\n    int pivot=arr[high];\n    int i=low-1;\n    for(int j=low;j<=high-1;j++)\n    {\n        check=j;\n        if(arr[j]<pivot)\n        {\n            i++;\n            int tmp = arr[i];\n            arr[i] = arr[j];\n            arr[j] = tmp;\n        }\n        update();\n        delay();\n    }\n    int tmp = arr[i+1];\n    arr[i+1] = arr[high];\n    arr[high] = tmp;\n    update();\n    delay();\n    return (i+1);\n}\n\npublic void quickSort(int low,int high)\n{\n    current=high;\n    if(low<high)\n    {\n        int pi=partition(low,high);\n\n        quickSort(low,pi-1);\n        quickSort(pi+1,high);\n    }\n}\n",
//            "public void linearSearch()\n{\n    for(int i=0;i<len-1 && sorting;i++)\n    {\n        if(arr[i]==key)\n        {\n            System.out.println(\"found\");\n            currentKey=i;\n            got=true;\n            break;\n        }\n        else \n        {\n            currentKey=i;\n            System.out.println(\"not found\");\n            got=false;\n        }\n        check=i;\n        update();\n        delay();\n    }\n}\n",
//            "public void binarySearch()\n{\n    Arrays.sort(arr);\n    int low=0,high=arr.length-1;\n    found=false;\n    while(low<=high && sorting)\n    {\n        mid=low+(high-low)/2;\n        currentKey2=mid;\n        if(arr[mid]==key)\n        {\n            System.out.println(\"found\");\n            found=true;\n            break;\n        }\n        else if(arr[mid]>key)\n        {\n            high=mid-1;\n        }\n        else\n        {\n            low=mid+1;\n        }\n        check=mid;\n        update();\n        delay();\n    }\n    if(!found)\n    {\n        System.out.println(\"not found\");\n    }\n}\n"};



    private JLabel arraySize = new JLabel("Array Size: ");
    private JSlider arraySizeSlider = new JSlider(50, 200, 50);
    private JLabel delay = new JLabel("Delay (ms) : ");
    private JSlider delaySlider = new JSlider(0, 100, 20);
    private JLabel complexity = new JLabel("Complexity:");

    private static final String[] algoComplexity = {
            "Bubble Sort:\n\nTime Complexity:\n\nBest Case: O(n^2)\nAverage Case: O(n^2)\nWorst Case: O(n^2)\n\nSpace Complexity: O(1)\n",
            "Selection Sort:\n\nTime Complexity:\n\nBest Case: O(n^2)\nAverage Case: O(n^2)\nWorst Case: O(n^2)\n\nSpace Complexity: O(1)\n",
            "Insertion Sort:\n\nTime Complexity:\n\nBest Case: O(n)\nAverage Case: O(n^2)\nWorst Case: O(n^2)\n\nSpace Complexity: O(1)\n",
            "Merge Sort:\n\nTime Complexity:\n\nBest Case: O(nlogn)\nAverage Case: O(nlogn)\nWorst Case: O(nlogn)\n\nSpace Complexity: O(n)\n",
            "Quick Sort:\n\nTime Complexity:\n\nBest Case: O(nlogn)\nAverage Case: O(nlogn)\nWorst Case: O(n^2)\n\nSpace Complexity: O(n)\n",
            "Linear Search:\n\nTime Complexity:\n\nBest Case: O(1)\nAverage Case: O(n/2)\nWorst Case: O(n)\n\nSpace Complexity: O(1)\n",
            "Binary Search:\n\nTime Complexity:\n\nBest Case: O(1)\nAverage Case: O(logn)\nWorst Case: O(logn)\n\nSpace Complexity: O(1)\n"
    };
    private JTextArea complexityField = new JTextArea(algoComplexity[VariablesManager.getCurrentIndex()]);
    private JScrollPane complexityScroll = new JScrollPane(complexityField, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    private JButton creditBtn = new JButton("Credit");

    private int arr[];

//    private Container container = VariablesManager.getContainer();
    public Container controlPanelInitialization(Container container) {
        /* --------------------  Control Panel Start  -------------------- */

        // Control Panel create and add into ContentPane
        //controlPanel=new JPanel();
        controlPanel.setLayout(null);
        controlPanel.setBounds(0,0,150,720);
        controlPanel.setBackground(new Color(31,56,78));
        container.add(controlPanel);

        // "Algorithms" label create
        //controlLabel1=new JLabel("Algorithms: ");
        controlLabel1.setBounds(30,5,100,15);
        controlLabel1.setForeground(Color.WHITE);
        controlLabel1.setFont(VariablesManager.getFont());
        controlPanel.add(controlLabel1);

        // Combo-box for Algorithms
        //algoType=new JComboBox(algorithms);
        algoType.setBounds(15,27,120,20);
        algoType.setFont(VariablesManager.getFont2());
        algoType.setEditable(true);
        controlPanel.add(algoType);

        // "Graph Types" label create
        //controlLabel2=new JLabel("Graph Types: ");
        controlLabel2.setBounds(25,55,100,15);
        controlLabel2.setForeground(Color.WHITE);
        controlLabel2.setFont(VariablesManager.getFont());
        controlPanel.add(controlLabel2);

        // Combo-box for Graph Types
        //barType=new JComboBox(barName);
        barType.setBounds(15,75,120,20);
        barType.setFont(VariablesManager.getFont2());
        barType.setEditable(true);
        controlPanel.add(barType);

        // Sort Button create
        //sortBtn=new JButton("Sort");
        sortBtn.setBounds(35,105,80,20);
        sortBtn.setFont(VariablesManager.getFont2());
        controlPanel.add(sortBtn);

        // Stop Button create
        //stopBtn=new JButton("Stop");
        stopBtn.setBounds(35,130,80,20);
        stopBtn.setFont(VariablesManager.getFont2());
        controlPanel.add(stopBtn);

        // Shuffle Button create
        //shuffleBtn=new JButton("Shuffle");
        shuffleBtn.setBounds(35,155,80,20);
        shuffleBtn.setFont(VariablesManager.getFont2());
        controlPanel.add(shuffleBtn);

        // "Array Size" label create
        //arraySize=new JLabel("Array Size: ");
        arraySize.setBounds(5,198,100,20);
        arraySize.setForeground(Color.WHITE);
        arraySize.setFont(VariablesManager.getFont());
        controlPanel.add(arraySize);

        // "JSlider" for Array Size
        //arraySizeSlider=new JSlider(50,300,50);
        arraySizeSlider.setBounds(0,230,150,40);
        arraySizeSlider.setBackground(new Color(31,56,78));
        arraySizeSlider.setForeground(Color.WHITE);
        arraySizeSlider.setMajorTickSpacing(50);
        arraySizeSlider.setPaintTicks(true);
        arraySizeSlider.setPaintLabels(true);
        controlPanel.add(arraySizeSlider);

        // "Delay" label create
        //delay=new JLabel("Delay (ms) : ");
        delay.setBounds(10,300,100,20);
        delay.setForeground(Color.WHITE);
        delay.setFont(VariablesManager.getFont());
        controlPanel.add(delay);

        // "JSlider" for Delay
        //delaySlider=new JSlider(0,100,20);
        delaySlider.setBounds(0,330,150,40);
        delaySlider.setBackground(new Color(31,56,78));
        delaySlider.setForeground(Color.WHITE);
        delaySlider.setMajorTickSpacing(25);
        delaySlider.setPaintTicks(true);
        delaySlider.setPaintLabels(true);
        controlPanel.add(delaySlider);


        // "Complexity" label create
        //complexity=new JLabel("Complexity:");
        complexity.setBounds(10,405,100,20);
        complexity.setForeground(Color.WHITE);
        complexity.setFont(VariablesManager.getFont());
        controlPanel.add(complexity);

        // "Complexity" text-field to show the complexity of the algorithm
        //complexityField=new JTextArea(algoComplexity[crntIndex]);
        complexityField.setFont(VariablesManager.getFont2());
        complexityField.setLineWrap(true);
        complexityField.setWrapStyleWord(true);

        complexityScroll.setBounds(5,430,140,200);
        controlPanel.add(complexityScroll);

        // "Credit" Button create
        //creditBtn=new JButton("Credit");
        creditBtn.setBounds(35,650,80,20);
        creditBtn.setFont(VariablesManager.getFont2());
        controlPanel.add(creditBtn);

        this.setVisible(true);
//        container.setVisible(true);

        return container;

        /* --------------------  Control Panel End  -------------------- */

    }

    public void algoTypeSelectionListener() {
        algoType.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
//                reset();
//                update();
                ResetUtils.reset();
                UpdateUtils.update();
//                currentIndex = algoType.getSelectedIndex();
                VariablesManager.setCurrentIndex(algoType.getSelectedIndex());

                System.out.println(algoType.getSelectedIndex()+ " getInputttttttttttttttttt\n");
                System.out.println(VariablesManager.getCurrentIndex()+ " iiiiiiiiiinnnnnnnnnnnnnddddddddddddd\n");

                complexityField.setText(algoComplexity[VariablesManager.getCurrentIndex()]);


//                VariablesManager.getCodeField().setText(showCode[VariablesManager.getCurrentIndex()]);
                VariablesManager.getCodeField().setText(VariablesManager.getShowCode()[VariablesManager.getCurrentIndex()]);
            }
        });
    }

    public void barTypeSelectionListener() {
        barType.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
//                type = barType.getSelectedIndex();
                VariablesManager.setType(barType.getSelectedIndex());

//                shuffleList();
//                reset();
//                update();
                ShuffleListUtils.shuffleList();
                ResetUtils.reset();
                UpdateUtils.update();
            }
        });
    }

    public void arraySizeSliderListener() {
        arraySizeSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
//                value = arraySizeSlider.getValue();
                int value = arraySizeSlider.getValue();

                //System.out.println(value+"--------");

//                len = value;
                int len = value;
                System.out.println(VariablesManager.getArray().length+ "aaaaaaaaaaSSSSSSSSSSSSSSSSS\n");
                if (VariablesManager.getArray().length != len) {
//                    shuffleList();
                    arr = ShuffleListUtils.shuffleList();
                }
//                reset();
                VariablesManager.setArray(arr);
                ResetUtils.reset();
            }
        });
    }

    public void delaySliderListener() {
        delaySlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
//                speed = (int) delaySlider.getValue();
                VariablesManager.setSpeed((int) delaySlider.getValue());

            }
        });
    }

    public void sortButtonListener() {
        sortBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
//                if (shuffled) {
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
//                shuffleList();
//                reset();

                arr = ShuffleListUtils.shuffleList();
                VariablesManager.setArray(arr);

                ResetUtils.reset();

            }

        });
    }
}
