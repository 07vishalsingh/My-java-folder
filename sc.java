import java.util.Scanner;

public class sc {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        }
        int num;
        System.out.println("Enter  positive integer: ");
        num = sc.nextInt();
       System.out.println("Multiplication Table of " + 9);
       for(int i=1; i<=10; i++){
        System.out.println(num +" x " + i + "=" + (num*i));
       }
    }

    static int nextInt() {
        return 0;
    }

}
