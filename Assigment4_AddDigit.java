// 4. Java program to find sum of all digits.

import java.util.Scanner;

public class Assigment4_AddDigit {
    public static int SumOfDigit(int n) {
        int res = 0;
        while (n != 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter any digit number : ");
        int n = Sc.nextInt();
        System.out.println("Sum of all digits = " + SumOfDigit(n));
        Sc.close();
    }
}