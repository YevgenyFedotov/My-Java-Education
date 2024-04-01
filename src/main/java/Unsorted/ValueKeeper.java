package Unsorted;

public class ValueKeeper {
    public static int value = -1;
    static {
        ++value;
    }
    public ValueKeeper(){
        value++;
    }
}
