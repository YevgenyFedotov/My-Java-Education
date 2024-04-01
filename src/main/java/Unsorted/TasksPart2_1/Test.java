package Unsorted.TasksPart2_1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Введите номер месяца");
        try {
            int i = input.nextInt();
            System.out.println("Месяц: " + months[i - 1]);
            System.out.println("Количество дней: " + dom[i - 1]);
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Недопустимое число!");
            input.nextLine();
        } catch (InputMismatchException ex){
            System.out.println("Введите число!");
        }
    }
}
