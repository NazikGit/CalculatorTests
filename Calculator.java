import jdk.nashorn.internal.objects.annotations.Function;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b, result, selection;

        System.out.println("Please enter any two digits");
        a = scanner.nextInt();
        b = scanner.nextInt();


        System.out.println("Choose Math action to be performed");
        System.out.println("1.addition");
        System.out.println("2.substruction");
        System.out.println("3.division");
        System.out.println("4.multiplication");

        selection = scanner.nextInt();
        while (selection > 4) {
            System.out.println("Please enter a valid selection");
            selection = scanner.nextInt();
        }
        while (selection < 1) {
            System.out.println("Please enter a valid selection");
            selection = scanner.nextInt();
        }

        MathMethods action = new MathMethods();
        if (selection == 1) {
            result = action.add(a, b);
            System.out.println("Your answer is " + result);
        } else if (selection == 2) {
            result = action.sub(a, b);
            System.out.println("Your answer is " + result);
        } else if (selection == 3) {
         //   result = action.div(a, b);
         //   System.out.println("Your answer is " + result);
            action.div(a, b);
        } else if (selection == 4) {
            result = action.multi(a, b);
            System.out.println("Your answer is " + result);
        }

    }


}

