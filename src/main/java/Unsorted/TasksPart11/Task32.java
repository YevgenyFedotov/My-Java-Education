package Unsorted.TasksPart11;

import java.util.ArrayList;
import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer numberOfItems = input.nextInt();
        ArrayList<Integer> items = new ArrayList<>();
        for ( int i = 0 ; i < numberOfItems ; i++){
            Integer item = input.nextInt();
            items.add(item);
        }
        System.out.println(items.toString());
        int boxMaxValue = 10;
        ArrayList<ArrayList> boxes = new ArrayList<>();
        boxes.add(new ArrayList<Integer>());
        int currentNumberOfItems;
        for ( int i = 0 ; i < items.size() ; i ++){
            currentNumberOfItems = items.size();
            for ( int j = 0 ; j < boxes.size() ; j ++){
                if ( sumOfBox(boxes.get(j)) + items.get(i) < boxMaxValue){
                    boxes.get(j).add(items.get(i));
                    items.remove(i);
                    i--;
                    break;
                }
            }
            if (currentNumberOfItems == items.size()){
                boxes.add(new ArrayList<Integer>());
                boxes.get(boxes.size()-1).add(items.get(i));
                numberOfItems--;
                currentNumberOfItems--;
            }
        }
        for ( int i = 0 ; i < boxes.size() ; i++ ){
            System.out.println(boxes.get(i).toString());
        }
    }

    public static int sumOfBox(ArrayList<Integer> box){
        int sumOfBox = 0;
        for (int i = 0 ; i < box.size() ; i++ ){
            sumOfBox += box.get(i);
        }
        return sumOfBox;
    }
}
