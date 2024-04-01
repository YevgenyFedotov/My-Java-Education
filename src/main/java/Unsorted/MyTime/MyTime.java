package Unsorted.MyTime;

import java.util.Date;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    MyTime(){
        this(System.currentTimeMillis());
    }
    MyTime(long millisecond){
        this.setTime(millisecond);
    }
    MyTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond() {
        return this.second;
    }

    private void setTime(long elapseTime){
        this.hour = (int)(elapseTime/1000/60/60%24);
        this.minute = (int)(elapseTime/1000/60%60);
        this.second = (int)(elapseTime/1000%60);
    }
}
