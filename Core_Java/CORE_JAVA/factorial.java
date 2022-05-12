 package CORE_JAVA;

public class factorial {
    public static void main(String[] args) {
        int n = 10;
        // 10! = 10 * 4 * 3 * 2 * 1
        int result = 1;
        // n - 1
        for (int i = n; i > 0; i--) {
            result *= i;
        }

        System.out.println("Factorial of " + n + " is = " + result);
    }
    } 
    
