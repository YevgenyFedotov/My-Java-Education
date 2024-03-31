package TasksPart11;

import java.util.Scanner;
import java.util.ArrayList;

public class Task26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrixLength = input.nextInt();
        Integer[][] matrix = new Integer[matrixLength][matrixLength];
        for ( int i = 0 ; i < matrixLength ; i++){
            for ( int j = 0 ; j < matrixLength ; j++){
                matrix[i][j] = (int)(Math.random()*2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        ArrayList<Integer> listOfRow = new ArrayList<>();
        ArrayList<Integer> listOfColumn = new ArrayList<>();
        int maxSumOfRow = 0;
        for ( int i = 0 ; i < matrixLength ; i++){
            if ( sumOfRow(matrix , i) > maxSumOfRow){
                maxSumOfRow = sumOfRow(matrix,i);
                listOfRow = new ArrayList<>();
                listOfRow.add(new Integer(i));
                continue;
            }
            if (sumOfRow(matrix , i) == maxSumOfRow){
                listOfRow.add(new Integer(i));
            }
        }
        int maxSumOfColumn = 0;
        for ( int i = 0 ; i < matrixLength ; i++){
            if ( sumOfColumn(matrix , i) > maxSumOfColumn){
                maxSumOfColumn = sumOfColumn(matrix,i);
                listOfColumn = new ArrayList<>();
                listOfColumn.add(new Integer(i));
                continue;
            }
            if (sumOfColumn(matrix , i) == maxSumOfColumn){
                listOfColumn.add(new Integer(i));
            }
        }
        System.out.println(listOfRow.toString());
        System.out.println(listOfColumn.toString());
    }
    public static int sumOfRow(Integer[][] matrix, int row){
        int sumOfRow = 0;
        for ( int i = 0 ; i < matrix.length ; i++){
            sumOfRow += matrix[row][i];
        }
        return sumOfRow;
    }
    public static int sumOfColumn(Integer[][] matrix, int column){
        int sumOfColumn = 0;
        for ( int i = 0 ; i < matrix.length ; i++){
            sumOfColumn += matrix[i][column];
        }
        return sumOfColumn;
    }
}
