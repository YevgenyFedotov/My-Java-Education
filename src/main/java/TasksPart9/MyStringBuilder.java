package TasksPart9;

import TasksPart8.MyString;

public class MyStringBuilder {
    private String stringBuilder;

    public MyStringBuilder(String s){
        stringBuilder = s;
    }
    public MyStringBuilder append(MyStringBuilder s){
        this.stringBuilder += s.stringBuilder;
        return this;
    }
    public MyStringBuilder append(int i){
        this.stringBuilder += i;
        return this;
    }
    public int length(){
        return this.stringBuilder.length();
    }
    public char charAt(int index){
        return this.stringBuilder.charAt(index);
    }
    public MyStringBuilder toLowerCase(){
        this.stringBuilder.toLowerCase();
        return this;
    }
    public MyStringBuilder substring(int begin, int end){
        MyStringBuilder newMyStringBuilder = new MyStringBuilder(this.stringBuilder.substring(begin, end));
        return newMyStringBuilder;
    }
    public String toString(){
        return this.stringBuilder;
    }
}
