package chapter4;

import java.util.Scanner;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime
 */
public class GrossPayInputValidation {

    public static void main(String[] args) {

        //Initialize know variables
        int rate = 15;
        int maxHours = 40;

        //Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Valicate input
        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry. Yours hours must be between 1 and 40. Try again ");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        //calculate gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }

}
