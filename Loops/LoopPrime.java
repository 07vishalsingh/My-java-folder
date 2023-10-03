package Loops;

import java.util.Scanner;

public class LoopPrime {
    public static void main(String[] args) {
        int num, i, count = 0;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if(count==0)
            System.out.println("IT IS PRIME NUMBER.");
            else
            System.out.println("IT IS NOT A PRIME NUMBER.");
    }
}
