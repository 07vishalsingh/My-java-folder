package conditionals;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int button = scanner.nextInt();

        switch (button) {
            case 1:System.out.println("Jai shree Ram");
                
                break;
             case 2:System.out.println("Jai shree Krishna");
                
                 break;
                case 3:System.out.println("HAR HAR MAHADEV");
                
                break;
            default:System.out.println("jai sanatan ");
                break;
        }
    }
}
