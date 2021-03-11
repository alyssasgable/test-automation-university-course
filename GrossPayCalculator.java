package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]) {
//        Gross Pay Algo
//        1. Get the number of hours worked
            System.out.println("How many hours did your employee work?");
            Scanner scanner = new Scanner(System.in);
            int hours = scanner.nextInt();
//        2. Get the hourly pay rate
            System.out.println("Excellent. Now enter the employee's hourly pay rate.");
            double payRate = scanner.nextDouble();
            scanner.close();
//        3. Multiply hours and pay rate
            double grossPay = (hours * payRate);
//        4. Display result
            System.out.println("Thanks so much for the information! This employee's gross pay is $" +grossPay);

    }
}
