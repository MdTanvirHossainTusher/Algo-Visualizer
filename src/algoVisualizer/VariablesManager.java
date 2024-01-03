package algoVisualizer;

import algoVisualizer.canvas.GraphCanvas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VariablesManager {
    // Variable Declare
//    private boolean sorting = false, shuffled = true, getInput = false, inputTaken = false, found = false, got = false;
//    private int currentIndex=0, len=70;
//    //    private int width_size = 800;//780
////    private int height_size = 680;
////    private int width=width_size/((currentIndex==5 || currentIndex==6) ? (len-1):len);
//    private int speed = 20, current = -1, check = -1, type = 0, key = 0, currentKey = -1, currentKey2 = -1, mid = -1;
//    private int value = -1, height;

    private static Font font = new Font("Arial", Font.BOLD, 14);
    private static Font font2 = new Font("Arial", Font.BOLD, 12);
    private static Font font3 = new Font("Arial", Font.BOLD, 18);

    private static int currentIndex = 0;
    private static int len = 70;
    private static ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private static int arr[];
    private static String[] algorithms = {"Bubble Sort", "Selection Sort", "Insertion Sort", "Merge Sort", "Quick Sort",
            "Linear Search", "Binary Search"
    };
    private static JComboBox algoType = new JComboBox(algorithms);

    private static String[] barName = {"Bar Graph", "Dot Graph"};

    private static String[] algoComplexity = {
            "Bubble Sort:\n\nTime Complexity:\n\nBest Case: O(n^2)\nAverage Case: O(n^2)\nWorst Case: O(n^2)\n\nSpace Complexity: O(1)\n",
            "Selection Sort:\n\nTime Complexity:\n\nBest Case: O(n^2)\nAverage Case: O(n^2)\nWorst Case: O(n^2)\n\nSpace Complexity: O(1)\n",
            "Insertion Sort:\n\nTime Complexity:\n\nBest Case: O(n)\nAverage Case: O(n^2)\nWorst Case: O(n^2)\n\nSpace Complexity: O(1)\n",
            "Merge Sort:\n\nTime Complexity:\n\nBest Case: O(nlogn)\nAverage Case: O(nlogn)\nWorst Case: O(nlogn)\n\nSpace Complexity: O(n)\n",
            "Quick Sort:\n\nTime Complexity:\n\nBest Case: O(nlogn)\nAverage Case: O(nlogn)\nWorst Case: O(n^2)\n\nSpace Complexity: O(n)\n",
            "Linear Search:\n\nTime Complexity:\n\nBest Case: O(1)\nAverage Case: O(n/2)\nWorst Case: O(n)\n\nSpace Complexity: O(1)\n",
            "Binary Search:\n\nTime Complexity:\n\nBest Case: O(1)\nAverage Case: O(logn)\nWorst Case: O(logn)\n\nSpace Complexity: O(1)\n"
    };

    private static boolean sorting = false, shuffle = true, getInput = false, inputTaken = false, found = false, got = false;

    private static int widthSize = 800;//780
    private static int heightSize = 680;
    private static int width=widthSize/((currentIndex==5 || currentIndex==6) ? (len-1):len);
    private static int speed = 20, current = -1, check = -1, type = 0, key = 0, currentKey = -1, currentKey2 = -1, mid = -1;
    private static int value = -1, height = -1;

    private static String[] showCode = {"public void bubbleSort()\n{\n    int i=1;\n    boolean noSwap=false;\n    for(;!noSwap && sorting;)\n    {\n        current=len-i;\n        noSwap=true;\n\n        for(int j=0;j<len-i;j++)\n        {\n            if(!sorting) break;\n            if(arr[j]>arr[j+1])\n            {\n                noSwap=false;\n\n                int temp=arr[j];\n                arr[j]=arr[j+1];\n                arr[j+1]=temp;\n            }\n            check=j+1;\n            update();\n            delay();\n        }\n        i++;\n    }\n}",
            "public void selectionSort()\n{\n    for(int i=0;i<len && sorting;i++)\n    {\n        int item=i;\n        current=i;\n        for(int j=i+1;j<len;j++)\n        {\n            if(!sorting) break;\n            if(arr[j]<arr[item])\n            {\n                item=j;\n            }\n            check=j;\n            update();\n            delay();\n        }\n        if(i!=item)\n        {\n            int tmp = arr[i];\n            arr[i] = arr[item];\n            arr[item] = tmp;\n        }\n    }\n}\n",
            "public void insertionSort()\n{\n    for(int i = 1; i < len; i++)\n    {\n        current = i;\n        int j = i;\n        while(arr[j] < arr[j-1] && sorting)\n        {\n            int tmp = arr[j];\n            arr[j] = arr[j-1];\n            arr[j-1] = tmp;\n\n            check = j;\n            update();\n            delay();\n\n            if(j > 1)\n                j--;\n        }\n    }\n}\n",
            "public void doMerge(int l,int m,int r)\n{\n    int s1=m-l+1;\n    int s2=r-m;\n    int left_auxi[]=new int[s1];\n    int right_auxi[]=new int[s2];\n    for(int i=0;i<s1;i++)\n    {\n        left_auxi[i]=arr[l+i];\n    }\n    for(int i=0;i<s2;i++)\n    {\n        right_auxi[i]=arr[m+1+i];\n    }\n    int i=0,j=0,k=l;\n    while(i<s1 && j<s2 && sorting)\n    {\n        check=k;\n        if(left_auxi[i]<=right_auxi[j])\n        {\n            arr[k]=left_auxi[i];\n            i++;\n            k++;\n        }\n        else\n        {\n            arr[k]=right_auxi[j];\n            j++;\n            k++;\n        }\n        update();\n        delay();\n    }\n    while(i<s1 && sorting)\n    {\n        arr[k]=left_auxi[i];\n        i++;\n        k++;\n        update();\n        delay();\n    }\n    while(j<s2 && sorting)\n    {\n        arr[k]=right_auxi[j];\n        j++;\n        k++;\n        update();\n        delay();\n    }\n}\n\npublic void mergeSort(int l,int r)\n{\n    if(l<r)\n    {\n        int m=l+(r-l)/2;\n        current=r;\n        mergeSort(l,m);\n        mergeSort(m+1,r);\n        doMerge(l,m,r);\n    }\n}\n",
            "public int partition(int low,int high)\n{\n    int pivot=arr[high];\n    int i=low-1;\n    for(int j=low;j<=high-1;j++)\n    {\n        check=j;\n        if(arr[j]<pivot)\n        {\n            i++;\n            int tmp = arr[i];\n            arr[i] = arr[j];\n            arr[j] = tmp;\n        }\n        update();\n        delay();\n    }\n    int tmp = arr[i+1];\n    arr[i+1] = arr[high];\n    arr[high] = tmp;\n    update();\n    delay();\n    return (i+1);\n}\n\npublic void quickSort(int low,int high)\n{\n    current=high;\n    if(low<high)\n    {\n        int pi=partition(low,high);\n\n        quickSort(low,pi-1);\n        quickSort(pi+1,high);\n    }\n}\n",
            "public void linearSearch()\n{\n    for(int i=0;i<len-1 && sorting;i++)\n    {\n        if(arr[i]==key)\n        {\n            System.out.println(\"found\");\n            currentKey=i;\n            got=true;\n            break;\n        }\n        else \n        {\n            currentKey=i;\n            System.out.println(\"not found\");\n            got=false;\n        }\n        check=i;\n        update();\n        delay();\n    }\n}\n",
            "public void binarySearch()\n{\n    Arrays.sort(arr);\n    int low=0,high=arr.length-1;\n    found=false;\n    while(low<=high && sorting)\n    {\n        mid=low+(high-low)/2;\n        currentKey2=mid;\n        if(arr[mid]==key)\n        {\n            System.out.println(\"found\");\n            found=true;\n            break;\n        }\n        else if(arr[mid]>key)\n        {\n            high=mid-1;\n        }\n        else\n        {\n            low=mid+1;\n        }\n        check=mid;\n        update();\n        delay();\n    }\n    if(!found)\n    {\n        System.out.println(\"not found\");\n    }\n}\n"};

//    private static JTextArea complexityField=new JTextArea(algoComplexity[currentIndex]);

    private static GraphCanvas canvas = new GraphCanvas();
    private static Container container;

    private static JSlider arraySizeSlider = new JSlider(50, 200, 50);
    private static JComboBox barType = new JComboBox(barName);

    private static JLabel delay = new JLabel("Delay (ms) : ");
    private static JSlider delaySlider = new JSlider(0, 100, 20);

    public static JTextArea codeField = new JTextArea(showCode[VariablesManager.getCurrentIndex()]);
//    JScrollPane codeScroll = new JScrollPane(codeField, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

//    JLabel inputLabel = new JLabel("Insert Data:");
//    JLabel noNegative = new JLabel("1) Negative value is not allowed");
//    JLabel whichIsKey = new JLabel("2) Last value is the key");
//
//    JTextField inputField = new JTextField();
//    JButton okBtn = new JButton("Ok");

    //    private final Random rand = new Random();
//    GraphCanvas canvas;
//    SortingAlgorithms selectedAlgo = new SortingAlgorithms();

    JLabel codeLabel1=new JLabel("Code: ");
//    JTextArea codeField=new JTextArea(showCode[crntIndex]);
    JScrollPane codeScroll=new JScrollPane(codeField,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    public VariablesManager() {
    }

    public static GraphCanvas getCanvas() {
        return canvas;
    }

    public static Container getContainer() {
        return container;
    }

    public static void setContainer(Container contains) {
        container = contains;
    }

    public static Font getFont() {
        return font;
    }

    public static Font getFont2() {
        return font2;
    }

    public static Font getFont3() {
        return font3;
    }

    public static int getCurrentIndex() {
        return currentIndex;
    }
    public static void setCurrentIndex(int idx) {
        currentIndex = idx;
    }

    public static int getLen() {
        return len;
    }

    public static void setLen(int length) {
        len = length;
    }

    public static String[] getAlgoNames() {
        return algorithms;
    }

    public static JComboBox getAlgoType() {
        return algoType;
    }

    public static String[] getAlgoComplexity() {
        return algoComplexity;
    }

    public static ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public static void setArrayList(ArrayList<Integer> arrList) {
        arrayList = arrList;
    }

    public static int[] getArray() {
        return arr;
    }

    public static void setArray(int array[]) {
        arr = array;
    }

//    private static boolean sorting = false, shuffle = true, getInput = false, inputTaken = false, found = false, got = false;
//    private static int speed = 20, current = -1, check = -1, type = 0, key = 0, currentKey = -1, currentKey2 = -1, mid = -1;
//    private static int value = -1, height;

    public static int getSpeed() {
        return speed;
    }

    public static void setSpeed(int speedValue) {
        speed = speedValue;
    }

    public static JComboBox getBarType() {
        return barType;
    }

//    public static void setBarType(int i) {
//        idx = i;
//    }

    public static int getCurrent() {
        return current;
    }

    public static void setCurrent(int curr) {
        current = curr;
    }

    public static int getCheck() {
        return check;
    }

    public static void setCheck(int checkVal) {
        check = checkVal;
    }

    public static int getType() {
        return type;
    }
    public static void setType(int typeVal) {
        type = typeVal;
    }

    public static int getKey() {
        return key;
    }

    public static void setKey(int keyVal) {
        key = keyVal;
    }

    public static int getCurrentKey() {
        return currentKey;
    }

    public static void setCurrentKey(int currKey) {
        currentKey = currKey;
    }

    public static int getCurrentKey2() {
        return currentKey2;
    }

    public static void setCurrentKey2(int currKey2) {
        currentKey2 = currKey2;
    }

    public static int getMid() {
        return mid;
    }

    public static int getValue() {
        return value;
    }

    public static int getHeight() {
        return height;
    }


    public static boolean isSorting() {
        return sorting;
    }

    public static void setSorting(boolean sort) {
        sorting = sort;
    }

    public static boolean isShuffle() {
        return shuffle;
    }

    public static void setShuffle(boolean shuffled) {
        shuffle = shuffled;
    }

    public static boolean isGetInput() {
        return getInput;
    }

    public static void setGetInput(boolean input) {
        getInput = input;
    }

    public static boolean isInputTaken() {
        return inputTaken;
    }

    public static void setInputTaken(boolean input) {
        inputTaken = input;
    }

    public static boolean isFound() {
        return found;
    }

    public static void setFound(boolean foundVal) {
        found = foundVal;
    }

    public static boolean isGot() {
        return got;
    }

    public static void setGot(boolean gotVal) {
        got = gotVal;
    }

    public static JTextArea getComplexityField() {
//        return new JTextArea(algoComplexity[currentIndex]);
        return new JTextArea(algoComplexity[VariablesManager.getCurrentIndex()]);
    }

    public static String[] getShowCode() {
        return showCode;
    }

    public static JTextArea getCodeField() {
        return codeField;
    }

    public static JSlider getArraySizeSlider() {
        return arraySizeSlider;
    }

    public static void setArraySizeSlider(JSlider arraySizeSlide) {
        arraySizeSlider = arraySizeSlide;
    }

    public static JSlider getDelaySlider() {
        return delaySlider;
    }

    public static void setDelaySlider(JSlider delaySlide) {
        delaySlider = delaySlide;
    }

    public static int getWidth() {
        return width;
    }
    public static void setWidth(int wide) {
        width = wide;
    }
    public static int getWidthSize() {
        return widthSize;
    }
    public static void setWidthSize(int wideSize) {
        widthSize = wideSize;
    }
    public static void setHeight(int h) {
        height = h;
    }
    public static int getHeightSize() {
        return heightSize;
    }
    public static void setHeightSize(int hSize) {
        heightSize = hSize;
    }
    public static void setMid(int midVal) {
        mid = midVal;
    }
}
