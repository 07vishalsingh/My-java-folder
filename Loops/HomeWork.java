package Loops;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int input;

    do{
        int marks = scanner.nextInt();
        if(marks >= 90 && marks <= 100){
            System.out.println("AWESOME!");
        }else if(marks >= 70 && marks <= 89) {
            System.out.println("GREAT!");
            
        }else if(marks >= 0 && marks <= 69){
            System.out.println("GOOD AS USUAL!");
        }else{
            System.out.println("Please enter valid number");
        }
        System.out.println("WANNA CONTINUE? (YES(1)) OR NO(0)");
        input = scanner.nextInt();
    }while(input==1);
}

    }

    