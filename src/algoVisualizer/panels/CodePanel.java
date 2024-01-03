package algoVisualizer.panels;

import algoVisualizer.VariablesManager;
import algoVisualizer.canvas.GraphCanvas;
import algoVisualizer.utils.ResetUtils;
import algoVisualizer.utils.ShuffleListUtils;
import algoVisualizer.utils.UpdateUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CodePanel extends JFrame{

    private JPanel codePanel = new JPanel();
    private JLabel codeLabel1 = new JLabel("Code: ");

    private String[] showCode = {"public void bubbleSort()\n{\n    int i=1;\n    boolean noSwap=false;\n    for(;!noSwap && sorting;)\n    {\n        current=len-i;\n        noSwap=true;\n\n        for(int j=0;j<len-i;j++)\n        {\n            if(!sorting) break;\n            if(arr[j]>arr[j+1])\n            {\n                noSwap=false;\n\n                int temp=arr[j];\n                arr[j]=arr[j+1];\n                arr[j+1]=temp;\n            }\n            check=j+1;\n            update();\n            delay();\n        }\n        i++;\n    }\n}",
            "public void selectionSort()\n{\n    for(int i=0;i<len && sorting;i++)\n    {\n        int item=i;\n        current=i;\n        for(int j=i+1;j<len;j++)\n        {\n            if(!sorting) break;\n            if(arr[j]<arr[item])\n            {\n                item=j;\n            }\n            check=j;\n            update();\n            delay();\n        }\n        if(i!=item)\n        {\n            int tmp = arr[i];\n            arr[i] = arr[item];\n            arr[item] = tmp;\n        }\n    }\n}\n",
            "public void insertionSort()\n{\n    for(int i = 1; i < len; i++)\n    {\n        current = i;\n        int j = i;\n        while(arr[j] < arr[j-1] && sorting)\n        {\n            int tmp = arr[j];\n            arr[j] = arr[j-1];\n            arr[j-1] = tmp;\n\n            check = j;\n            update();\n            delay();\n\n            if(j > 1)\n                j--;\n        }\n    }\n}\n",
            "public void doMerge(int l,int m,int r)\n{\n    int s1=m-l+1;\n    int s2=r-m;\n    int left_auxi[]=new int[s1];\n    int right_auxi[]=new int[s2];\n    for(int i=0;i<s1;i++)\n    {\n        left_auxi[i]=arr[l+i];\n    }\n    for(int i=0;i<s2;i++)\n    {\n        right_auxi[i]=arr[m+1+i];\n    }\n    int i=0,j=0,k=l;\n    while(i<s1 && j<s2 && sorting)\n    {\n        check=k;\n        if(left_auxi[i]<=right_auxi[j])\n        {\n            arr[k]=left_auxi[i];\n            i++;\n            k++;\n        }\n        else\n        {\n            arr[k]=right_auxi[j];\n            j++;\n            k++;\n        }\n        update();\n        delay();\n    }\n    while(i<s1 && sorting)\n    {\n        arr[k]=left_auxi[i];\n        i++;\n        k++;\n        update();\n        delay();\n    }\n    while(j<s2 && sorting)\n    {\n        arr[k]=right_auxi[j];\n        j++;\n        k++;\n        update();\n        delay();\n    }\n}\n\npublic void mergeSort(int l,int r)\n{\n    if(l<r)\n    {\n        int m=l+(r-l)/2;\n        current=r;\n        mergeSort(l,m);\n        mergeSort(m+1,r);\n        doMerge(l,m,r);\n    }\n}\n",
            "public int partition(int low,int high)\n{\n    int pivot=arr[high];\n    int i=low-1;\n    for(int j=low;j<=high-1;j++)\n    {\n        check=j;\n        if(arr[j]<pivot)\n        {\n            i++;\n            int tmp = arr[i];\n            arr[i] = arr[j];\n            arr[j] = tmp;\n        }\n        update();\n        delay();\n    }\n    int tmp = arr[i+1];\n    arr[i+1] = arr[high];\n    arr[high] = tmp;\n    update();\n    delay();\n    return (i+1);\n}\n\npublic void quickSort(int low,int high)\n{\n    current=high;\n    if(low<high)\n    {\n        int pi=partition(low,high);\n\n        quickSort(low,pi-1);\n        quickSort(pi+1,high);\n    }\n}\n",
            "public void linearSearch()\n{\n    for(int i=0;i<len-1 && sorting;i++)\n    {\n        if(arr[i]==key)\n        {\n            System.out.println(\"found\");\n            currentKey=i;\n            got=true;\n            break;\n        }\n        else \n        {\n            currentKey=i;\n            System.out.println(\"not found\");\n            got=false;\n        }\n        check=i;\n        update();\n        delay();\n    }\n}\n",
            "public void binarySearch()\n{\n    Arrays.sort(arr);\n    int low=0,high=arr.length-1;\n    found=false;\n    while(low<=high && sorting)\n    {\n        mid=low+(high-low)/2;\n        currentKey2=mid;\n        if(arr[mid]==key)\n        {\n            System.out.println(\"found\");\n            found=true;\n            break;\n        }\n        else if(arr[mid]>key)\n        {\n            high=mid-1;\n        }\n        else\n        {\n            low=mid+1;\n        }\n        check=mid;\n        update();\n        delay();\n    }\n    if(!found)\n    {\n        System.out.println(\"not found\");\n    }\n}\n"};



//    private JTextArea codeField = new JTextArea(showCode[crntIndex]);
//    private JScrollPane codeScroll = new JScrollPane(codeField, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    private JLabel inputLabel = new JLabel("Insert Data:");
    private JLabel noNegative = new JLabel("1) Negative value is not allowed");
    private JLabel whichIsKey = new JLabel("2) Last value is the key");

    private JTextField inputField = new JTextField();
    private JButton okBtn = new JButton("Ok");

//    private Container container;

    public Container codePanelInitialization(Container container) {

        /* --------------------   Code Panel Start   ------------------- */

        // Code Panel create

        JTextArea codeField = new JTextArea(showCode[VariablesManager.getCurrentIndex()]);
        JScrollPane codeScroll = new JScrollPane(codeField, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);



        codePanel.setLayout(null);
        codePanel.setBounds(940,0,340,720);
        codePanel.setBackground(new Color(21,49,75));
        container.add(codePanel);

        // "Code" label create
        //codeLabel1=new JLabel("Code: ");
        codeLabel1.setBounds(10,5,100,15);
        codeLabel1.setFont(VariablesManager.getFont());
        codeLabel1.setForeground(Color.WHITE);
        codePanel.add(codeLabel1);

        // "Code-Field" create to show code
        //codeField=new JTextArea();
        codeField.setFont(VariablesManager.getFont());
        codeField.setBackground(new Color(65,68,73));// new Color(8,82,70)
        codeField.setForeground(Color.WHITE);

        codeScroll=new JScrollPane(codeField, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        codeScroll.setBounds(5,25,320,460);
        codePanel.add(codeScroll);

        // "Insert data" label create
        //inputLabel=new JLabel("Insert Data: ");
        inputLabel.setBounds(5,495,100,15);
        inputLabel.setForeground(Color.WHITE);
        inputLabel.setFont(VariablesManager.getFont());
        codePanel.add(inputLabel);

        noNegative.setBounds(5,515,320,15);
        noNegative.setForeground(Color.WHITE);
        noNegative.setFont(VariablesManager.getFont());
        codePanel.add(noNegative);

        whichIsKey.setBounds(5,535,320,15);
        whichIsKey.setForeground(Color.WHITE);
        whichIsKey.setFont(VariablesManager.getFont());
        codePanel.add(whichIsKey);


        // "Input-Field" create to take input

        inputField.setBounds(5,565,320,70);
        inputField.setBackground(new Color(65,68,73));
        inputField.setForeground(Color.WHITE);
        inputField.setFont(VariablesManager.getFont3());
        codePanel.add(inputField);


        okBtn.setBounds(130,650,80,25);
        okBtn.setFont(VariablesManager.getFont2());
        codePanel.add(okBtn);

//        container.setVisible(true);
        setVisible(true);
        return container;

        /* --------------------   Code Panel End   ------------------- */
    }

    public void okButtonListener() {
        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String str = inputField.getText();
                //System.out.println(str);

                if (str.equals("")) {


//                    getInput = false;
//                    update();
//                    reset();

                    VariablesManager.setGetInput(false);
                    System.out.println(VariablesManager.isGetInput()+ " getInputttttttttttttttttt\n");
                    UpdateUtils.update();
                    ResetUtils.reset();

                    ShuffleListUtils.shuffleList();

                } else {
//                    a.clear();
                    ArrayList<Integer> arrayList = VariablesManager.getArrayList();
                    arrayList.clear();
                    String[] val = str.split(" ");
//                    inputTaken = true;
                    VariablesManager.setInputTaken(true);

                    for (String ss : val) {

//                        a.add(Integer.parseInt(ss));
                        arrayList.add(Integer.parseInt(ss));

                    }

                    int len = arrayList.size();
//                    key = arrayList.get(len - 1);
                    VariablesManager.setKey(arrayList.get(len - 1));

//                    getInput = true;
//                    got = false;
//                    found = false;
                    VariablesManager.setGetInput(true);
                    VariablesManager.setGot(false);
                    VariablesManager.setFound(false);
                    ShuffleListUtils.shuffleList();


                }

            }

        });
    }

}
