package QuickSort;

import java.util.Arrays;

public class QuickSortMain {
    public static void main(String[] args) {
        int[] array = new int[100000];
        //int[] array = {1,1,1}; //нужно было для отладки
        //рандомим весь массив
        array[0] = (int)(Math.random()*100);
        System.out.print(array[0] + " ");
        for (int i = 1 ; i < array.length ; i++){
            array[i] = (int)(Math.random()*100) + array[i-1];
            System.out.print(array[i] + " ");
        }
        //Копируем массив
        int[] randomArray = new int[array.length];
        for (int i = 0 ; i < randomArray.length ; i++){
            randomArray[i] = array[i];
        }
        //Перемешиваем массив
        for (int i = 0 ; i < 10000 ; i ++){
            int temp = randomArray[0];
            int tempIndex = (int)(Math.random()*randomArray.length);
            randomArray[0] = randomArray[tempIndex];
            randomArray[tempIndex] = temp;

        }
        System.out.println();
        for (int value : randomArray){
            System.out.print(value + " ");
        }
        System.out.println();
        StopWatch timer = new StopWatch();
        //стартуем таймер
        timer.start();
        //сортируем нашим методом
        int[] sortedArray = QuickSort.quickSort(randomArray);
        //Arrays.sort(randomArray); //для сравнения со встроенной сортировкой

        /*int[] sortedArray = new int[randomArray.length];
        for (int i = 0 ; i < sortedArray.length ; i++){
            sortedArray[i] = randomArray[i];
        }*/
        //останавливаем таймер
        timer.stop();
        for (int value : sortedArray){
            System.out.print(value + " ");
        }
        System.out.println();
//129255 нужно было для отладки
        boolean isEquals = true;
        for (int i = 0 ; i < array.length ; i++){
            if ( array[i] != sortedArray[i]){
                isEquals = false;
                System.out.println(array[i]);
                break;
            }
        }
        System.out.println(isEquals);
        System.out.println(timer.getElapsedTime());
    }
}
