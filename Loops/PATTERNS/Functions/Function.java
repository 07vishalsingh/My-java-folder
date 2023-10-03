package Loops.PATTERNS.Functions;

import java.util.*;
public class Function {
    public static void printMyName(String nameString) {
        System.out.println(nameString);
        return;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String nameString = scanner.next();
        printMyName(nameString);
    }
}
