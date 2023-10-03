import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // String word = "beta";
        char ch = sc.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }
       // System.out.println(ch);
      //  System.out.println(word.charAt(3));
      //  System.out.println(ch);
    }
}
