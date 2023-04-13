package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String args[]){

        int rate = 15;
        int maxHours = 40;

        System.out.println("How many hours you worked?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHours){
            System.out.println("You have exceeded the limit. Please try again: ");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        double grossPay = rate * hoursWorked;
        System.out.println("Your gorss pay is: " + grossPay);
    }
}
