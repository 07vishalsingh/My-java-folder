package conditionals;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input > 0) {
            System.out.println("Given Number is positive");
        } else if (input < 0) {
            System.out.println("Given Number is negative");
        } else {
            System.out.println("Given Number is zero");
        }
    }
}
