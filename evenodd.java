

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner Sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n % 2 == 0 (even)
        // n % 2 not = 0 (odd)

        if(n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }
}