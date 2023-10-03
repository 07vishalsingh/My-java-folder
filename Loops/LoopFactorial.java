package Loops;

import java.util.Scanner;

public class LoopFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int num;
    int fact = 1;
    System.out.println("ENTER THE POSIIVE NUMBER");
    num = scanner.nextInt();

    for (int i = 1; i <= num; i++) {
        fact *= i;
    }
    System.out.println("Factorial: "+ fact);
    }
    
}
