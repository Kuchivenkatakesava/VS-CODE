

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        try (var sc = new Scanner(System.in)) {
        } {
            int n = Sc.nextInt();

            // n % 2 == 0 (even)
            // n % 2 not = 0 (odd)

            if(n % 2 == 0) {
                System.out.println(n + " is Even");
            } else {
                System.out.println(n + " is Odd");
            }
        }
    }
}