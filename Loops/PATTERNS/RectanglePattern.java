package Loops.PATTERNS;

import java.util.*;
public class RectanglePattern {
    public static void main(String[] args) {
        int n = 5;
        int m = 4;

        // outer loop
        for (int i=0; i<n; i++) {
            // inner loop
            for (int j=0; j<m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
