package Loops;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(i*n);
        }
    }
}
