package Unsorted.TasksPart11;

import java.util.ArrayList;
import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer value;
        ArrayList<Integer> list = new ArrayList<>();
        do {
            value = input.nextInt();
            if ( value != 0){
                list.add(value);
            }

        } while (value != 0);
        int maxValue = maxValueOf(list);
        System.out.println(maxValue);
    }

    public static Integer maxValueOf(ArrayList<Integer> list){
        if ( list ==null || list.size() == 0 ){
            return null;
        }
        Integer maxValue = list.get(0);
        for ( Integer value : list){
            if (value > maxValue){
                maxValue = value;
            }
        }
        return maxValue;
    }
}
