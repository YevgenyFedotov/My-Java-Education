package Unsorted;

import java.util.Arrays;

public class main {
    public static void main (String[] args) {
        int[] array = new int[20];
        fullRandom(array, 100);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(findKey(array,25));
        System.out.println(Arrays.binarySearch(array, 25));
        int i = 016;
        System.out.println(i);
        double[] d = new double[]{1,2,3};
    }

    public static int findKey(int[] list, int key){
        int low = 0;
        int high = list.length-1;
        int mid;
        while (high >= low){
            mid = (high+low)/2;
            if(key<list[mid])
                high = mid-1;
            else if(key>list[mid])
                low = mid+1;
            else if(key ==list[mid])
                return mid;
        }
        return -low-1;
    }
    public static void fullRandom(int[] list, int maxValue){
        for(int i=0; i< list.length; i++) {
            list[i] = (int)(Math.random()*maxValue);
        }
    }
}
