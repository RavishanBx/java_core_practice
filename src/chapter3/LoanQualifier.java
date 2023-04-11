package chapter3;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String args[]){

        double requiredSalary = 30000;
        double requiredYearsEmployed = 2;

        System.out.println("Please enter your salary: ");

        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Please enter number of employed years: ");
        double years = scanner.nextDouble();


        if(requiredSalary >= 30000){
            if (requiredYearsEmployed >= 2){
                System.out.println("Congrats ! You were granted a loan");
            }
            else{
                System.out.println("Sorry ! Required years are not enough");
            }
        }
        else {
            System.out.println("Sorry ! Required salary didn't meet");
        }
}

}
