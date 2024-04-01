package Unsorted.MyInteger;

public class MyInteger {
    private int value;

    public MyInteger(int value){
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public boolean isEven(){
        return isEven(value);
    }
    public boolean isOdd(){
        return isOdd(value);
    }
    public  boolean isPrime(){
        return isPrime(value);
    }

    public static boolean isEven(int value){
        return ( value % 2 ==0 );
    }
    public static boolean isOdd(int value){
        return ( value % 2 != 0 );
    }
    public static boolean isPrime(int value){
        for ( int i = 1; i < value - 1 ; i++){
            if (value % (value - i) == 0) return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger value){
        return isEven(value.getValue());
    }
    public static boolean isOdd(MyInteger value){
        return isOdd(value.getValue());
    }
    public static boolean isPrime(MyInteger value){
        return isPrime(value.getValue());
    }

    public boolean equals(int value){
        return this.value == value;
    }
    public boolean equals(MyInteger myInteger){
        return this.value == myInteger.getValue();
    }

    public static int parseInt(char[] value){
        int result = 0;
        for ( int i = 0 ; i < value.length ; i++ ){
        result += (value[i] - '0')*Math.pow(10, value.length-i-1);
        }
        return result;
    }
    public static int parseInt(String value){
        return parseInt(value.toCharArray());
    }
}
