// 7. Write a Java program to print perfect numbers

import java.util.Scanner;

public class assPrntPerfectNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int n = sc.nextInt();
        int r = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                r += i;
            }
        }
        if (n == r) {
            System.out.println(n + " is a perfect number");
        } else {
            System.out.println(n + " is not a perfect number");
        }
        sc.close();
    }
}