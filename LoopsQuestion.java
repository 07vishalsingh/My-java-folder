import java.util.Scanner;

public class LoopsQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Q: find the largest of the three numbers
        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;

            System.out.println(max);
        }
    }
}
