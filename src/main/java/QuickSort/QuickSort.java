package QuickSort;

public class QuickSort {
    public static int[] quickSort(int[] array){
        //Обрабатываем простой случай с одним эллементом массива
        if (array.length == 1){
            return array;
        }
        //Обрабатываем простой случай с двумя эллементом массива
        if(array.length == 2){
            if (array[0] > array[1]){
                int temp = array[0];
                array[0] = array[1];
                array[1] = temp;
            }
            return array;
        }
        //Обрабатываем простой случай с одинаковыми эллементи массива
        if(QuickSort.isOneValue(array)){
            return array;
        }
        //делим массив на два массива поменьше
        int maxValueInArray = array[0];
        int minValueInArray = array[0];
        for ( int i = 1 ; i < array.length ; i++){
            if (array[i] > maxValueInArray){
                maxValueInArray = array[i];
            }
            if (array[i] < minValueInArray){
                minValueInArray = array[i];
            }
        }
        int[] subArray1 = new int[0];
        int[] subArray2 = new int[0];
        //все что меньше среднего значения идет в первый массив
        //остальное во второй массив
        for (int i = 0 ; i < array.length ; i++){
            if (array[i] < (maxValueInArray + minValueInArray)/2){
                int[] tempArray = new int[subArray1.length + 1];
                for (int j = 0 ; j < subArray1.length ; j++){
                    tempArray[j] = subArray1[j];
                }
                tempArray[tempArray.length - 1] = array[i];
                subArray1 = tempArray;
            } else {
                int[] tempArray = new int[subArray2.length + 1];
                for ( int j = 0 ; j < subArray2.length ; j ++){
                    tempArray[j] = subArray2[j];
                }
                tempArray[tempArray.length - 1] = array[i];
                subArray2 = tempArray;
            }
        }
        //Обрабатываем случай когда первый массив получился пустой
        if(subArray1.length == 0){
            int minValue = subArray2[0];
            int minValueIndex = 0;
            int count = 0;
            for (int i = 0 ; i < subArray2.length ; i++){
                if (subArray2[i] < minValue){
                    minValue = subArray2[i];
                    minValueIndex = i;
                    count = 1;
                }
                else if (subArray2[i] == minValue){
                    count++;
                }
            }
            subArray1 = new int[count];
            for (int i = 0 ; i < subArray1.length ; i++){
                subArray1[i] = minValue;
            }
            int[] newSubArray2 = new int[subArray2.length - count];
            int maxValue = subArray2[0];
            for (int i=0 ; i<subArray2.length ; i++){
                if (maxValue < subArray2[i]){
                    maxValue = subArray2[i];
                }
            }
            for (int i = 0 ; i < newSubArray2.length ; i++){
                newSubArray2[i] = maxValue;
            }
            subArray2 = newSubArray2;
        }
        //уходим в рекурсию
        subArray1 = quickSort(subArray1);
        subArray2 = quickSort(subArray2);
        //объединяем отсортированные массывы
        int[] newArray = new int[array.length];
        for ( int i = 0 ; i < subArray1.length ; i++){
            newArray[i] = subArray1[i];
        }
        for ( int j = subArray1.length ; j < newArray.length ; j++){
            newArray[j] = subArray2[ j  - subArray1.length];
        }
        //возвращаем готовый массив
        return newArray;
    }
    //проверка массива на одинаковые элементы
    private static boolean isOneValue(int[] array){
        int value = array[0];
        for (int i = 1 ; i < array.length ; i ++){
            if(array[i] != value){
                return false;
            }
        }
        return true;
    }
}
