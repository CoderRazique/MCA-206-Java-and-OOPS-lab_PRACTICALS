// 2. Write a Java program to calculate the factorial of a given numbers.

import java.util.Scanner;

public class Assigment2_CalcFact {
    public static long Fact(int n) {
        if (n < 1) {
            return 1;
        }
        return (long) (n * Fact(n - 1));
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.err.print("Enter a number : ");
        int n = Sc.nextInt();
        System.out.println("Factorial of " + n + " = " + Fact(n));
    }
}
