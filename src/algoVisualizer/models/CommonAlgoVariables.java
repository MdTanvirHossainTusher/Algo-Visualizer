package algoVisualizer.models;

public class CommonAlgoVariables {
    private int arr[], len, check, low, high, key;
    private boolean sorting;

    public CommonAlgoVariables() {
    }

    public CommonAlgoVariables(int[] arr, int len, int check, boolean sorting) {
        this.arr = arr;
        this.len = len;
        this.check = check;
        this.sorting = sorting;
    }

    public CommonAlgoVariables(int[] arr, int len, int check, int low, int high, int key, boolean sorting) {
        this.arr = arr;
        this.len = len;
        this.check = check;
        this.low = low;
        this.high = high;
        this.key = key;
        this.sorting = sorting;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public boolean isSorting() {
        return sorting;
    }

    public void setSorting(boolean sorting) {
        this.sorting = sorting;
    }
}
