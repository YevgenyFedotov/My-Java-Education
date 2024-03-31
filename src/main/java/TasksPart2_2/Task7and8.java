package TasksPart2_2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Task7and8 {
    public static void main(String[] args) {
        Number[] intArray = new Number[]{54, 45,5,6, 4.614, 50, 37.645151, 37.549166};
        ArrayList<Number> list = new ArrayList<>(Arrays.asList(intArray));
        System.out.println(list.toString());
        sort(list);
        System.out.println(list.toString());
        shuffle(list);
        System.out.println(list.toString());
        sort(list);
        System.out.println(list.toString());
    }

    public static void sort(ArrayList<Number> list){
        for ( int i = 0 ; i < list.size() ; i ++){
            Number currentMin = list.get(i);
            int currentMinIndex = i;
            for ( int j = i+1 ; j < list.size() ; j++){
                if ( new BigDecimal(currentMin + "").compareTo(new BigDecimal(list.get(j) + "")) > 0){
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }
            list.set(currentMinIndex, list.get(i));
            list.set(i, currentMin);
        }
    }

    public static void shuffle(ArrayList<Number> list){
        for ( int i = 0 ; i < list.size() ; i++){
            Number temp = list.get(i);
            int newIndex = (int)(Math.random() * list.size());
            list.set(i , list.get(newIndex));
            list.set( newIndex, temp);
        }
    }
}
