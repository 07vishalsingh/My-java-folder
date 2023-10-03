import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // print number from 1 to 50

       // /* syntax of for loops:
       // for (initialization; condition; increment/decrement){
        // body
      //  }
      //   */

      //  for (int num=1; num <=5; num+=2){
       //     System.out.println(num);
      //  }

        // print numbers from 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //for (int num = 0; num < n; num++) {
          //  System.out.println(num + "");

       // }

        // while loops


 //       int num = 1;
 //       while (num <= 5) {
//            System.out.println(num);
 //           num += 1;
//        }

        // do while
//        /*
 //       do {
 //       } while (condition);
  //       */
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num <= 5);
    }
}
