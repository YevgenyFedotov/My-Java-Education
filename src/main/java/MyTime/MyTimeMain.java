package MyTime;

import java.util.Date;

public class MyTimeMain {
    public static void main(String[] args) {
        MyTime myTime1 = new MyTime();
        MyTime myTime2 = new MyTime(555550000);
        MyTime myTime3 = new MyTime(5,23,55);
        System.out.println(myTime1.getHour() + ":" + myTime1.getMinute() + ":" + myTime1.getSecond());
        System.out.println(myTime2.getHour() + ":" + myTime2.getMinute() + ":" + myTime2.getSecond());
        System.out.println(myTime3.getHour() + ":" + myTime3.getMinute() + ":" + myTime3.getSecond());

    }
}
