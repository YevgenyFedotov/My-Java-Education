package Unsorted.Account;

import java.util.Scanner;

public class ATM_Machine {
    private Account[] accounts = new Account[10];

    public static void main(ATM_Machine atm_machine) {
        Scanner input = new Scanner(System.in);
        Account account;
        while (true){
            account = atm_machine.findAccount(initialisationMenu());
            if ( account.getId() != -1){
                break;
            }
        }
        while (true){
            printMenu();
            System.out.println("Введите пункт меню: ");
            int menuInput = input.nextInt();
            if ( menuInput < 0 || menuInput > 6){
                System.out.println("Некоректный ввод");
                continue;
            }
            if ( menuInput == 1 ){
                System.out.println( "Баланс равен " + checkBalance(account) + '\n');
            }
            if ( menuInput == 2 ){
                System.out.println("Введите сумму для снятия со счета: ");
                account.withdraw(input.nextDouble());
            }
            if ( menuInput == 3 ){
                System.out.println("Введите сумму для пополнения счета:");
                account.deposit(input.nextDouble());
            }
            if ( menuInput == 4){
                System.out.println(account.toString());
            }
            /*if ( menuInput == 5){
                account.checkTransaction();
            }*/
            if ( menuInput == 6){
                break;
            }
        }
    }

    public ATM_Machine(){
        for (int i = 1 ; i < accounts.length ; i++){
            accounts[0] = new Account(1122, 1000, "Герман");
            accounts[i] = new Account(i, 10_000);
            Account.setAnnualInterestRate(5.5);
        }
    }

    public Account findAccount(int id){
        for ( int i = 0 ; i < accounts.length ; i++){
            if ( accounts[i].getId() == id){
                return accounts[i];
            }
        }
        System.out.println("Пользователь не найден");
        return new Account(-1,-1);
    }

    public static double checkBalance(Account account){
        return account.getBalance();
    }

    public static int initialisationMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите Id");
        return input.nextInt();
    }

    private static void printMenu(){
        System.out.println("Основное меню");
        System.out.println("1: проверить баланс");
        System.out.println("2: снять со счета");
        System.out.println("3: положить на счет");
        System.out.println("4: информация по счету");
        //System.out.println("5: информация о транзакциях");
        System.out.println("6: выйти");
    }
}
