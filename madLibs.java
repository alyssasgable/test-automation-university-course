package chapter2;

import java.util.Scanner;

public class madLibs {

    public static void main(String arg[]) {
        //Mad Lib Algo
//        1. Ask for season of the year
        System.out.println("What season of the year are you in?");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();
//        2. Then a whole number
        System.out.println("How old are you?");
        System.out.println("I won't make you enter your age but...");
        System.out.println("Add the two numbers that make up your age and enter it below:");
        int wholeNumber = scanner.nextInt();
//        3. Then an adjective
        System.out.println("Think of a turtle swimming through the deep blue ocean.");
        System.out.println("What adjective comes to mind?");
        String adjective = scanner.next();
        scanner.close();
//        4. Display Result
        System.out.println("Thanks for playing! Your mad lib sentence is as follows:");
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + wholeNumber + " cups of coffee.");
    }
}
