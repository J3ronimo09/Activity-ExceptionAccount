import entities.Account;
import exception.BusinessException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.next();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print(" withdraw limit:");
        double withdrawLimit = sc.nextDouble();
        System.out.println();


        Account account = new Account(number,holder,balance,withdrawLimit);
        System.out.print("Enter  amount for withdraw:");
        double amount = sc.nextDouble();

        // Good solution


        try {
            account.withdraw(amount);
            System.out.printf("New balance: " + String.format("%.2f%n", account.getBalance()));
        }
        catch (BusinessException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}