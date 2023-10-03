package conditionals;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter 3rd number: ");
        int num3 = scanner.nextInt();

        if (num1 > num2)
         if(num1 > num3)
            System.out.println("The greatest number: " + num1);
        if (num2 > num1)
         if(num2 > num3)
            System.out.println("The greatest number: " + num2);
        if (num3 > num1)
         if(num3 > num2)
            System.out.println("The greatest number: " + num3);
        
        
    }
}
