package Unsorted.MyInteger;

public class MyIntegerMain {
    public static void main(String[] args) {
        MyInteger myInteger1 = new MyInteger(239);
        MyInteger myInteger2 = new MyInteger(5);
        System.out.println(myInteger1.isEven());
        System.out.println(myInteger1.isOdd());
        System.out.println(myInteger1.isPrime());
        System.out.println();
        System.out.println(MyInteger.isEven(239));
        System.out.println(MyInteger.isOdd(239));
        System.out.println(MyInteger.isPrime(239));
        System.out.println();
        System.out.println(MyInteger.isEven(myInteger1));
        System.out.println(MyInteger.isOdd(myInteger1));
        System.out.println(MyInteger.isPrime(myInteger1));
        System.out.println();
        System.out.println(myInteger1.equals(239));
        System.out.println(myInteger1.equals(myInteger2));
        //char ch = '1';
        //ch++;
        char[] ch = {'1','2','3'};
        System.out.println(MyInteger.parseInt(ch));
        System.out.println(MyInteger.parseInt("569949"));
    }
}
