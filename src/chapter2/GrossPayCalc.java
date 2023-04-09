package chapter2;

import java.util.Scanner;

public class GrossPayCalc {

    public static void main(String args[]){

        //Number of hours worked
        System.out.println("Enter the number of Hours: ");
        Scanner scanner = new Scanner(System.in);
        double hours = scanner.nextDouble();

        //Hourly rate
        System.out.print("Enter hourly rate: ");
        double rate = scanner.nextDouble();
        scanner.close();

        double grossPay = hours * rate;
        System.out.println("Gross salary is " + grossPay);



    }
}
