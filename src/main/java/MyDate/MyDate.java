package MyDate;

import java.util.GregorianCalendar;
import java.util.Date;

public class MyDate {
    private Integer year;
    private Integer month;
    private Integer day;

    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        System.out.println(date1.toString());
        MyDate date2 = new MyDate(34355555133101l);
        System.out.println(date2.toString());
        MyDate date0 = new MyDate(0l);
        System.out.println(date0.toString());
        Date date = new Date();
        System.out.println(date.toString());

    }

    public MyDate(){
        this(System.currentTimeMillis());
    }
    public MyDate(long millisecond){
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(millisecond);
        this.day = date.get(GregorianCalendar.DAY_OF_MONTH);
        this.month = date.get(GregorianCalendar.MONTH);
        this.year = date.get(GregorianCalendar.YEAR);
    }
    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getMonth() {
        return month + 1;
    }

    public Integer getDay() {
        return day;
    }

    public void setDate(long elapsedTime){
        GregorianCalendar date = new GregorianCalendar(this.year, this.month, this.day);
        long newTimeInMillisecond =  date.get(GregorianCalendar.MILLISECOND) + elapsedTime;
        date.setTimeInMillis(newTimeInMillisecond);
        this.year = date.get(GregorianCalendar.YEAR);
        this.month = date.get(GregorianCalendar.MONTH);
        this.day = date.get(GregorianCalendar.DAY_OF_MONTH);
    }
    public String toString(){
        return this.getDay() + "." + this.getMonth() + "." + this.year;
    }
}
