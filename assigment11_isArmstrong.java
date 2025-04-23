// 11. Write a Java program to check whether number is Armstrong or not.

import java.util.Scanner;

public class assigment11_isArmstrong {
    public static int counter(int n) {
        return (int) Math.log10(n) + 1;
    }

    public static boolean isArmstrong(int n) {
        int temp = n;
        int arm = 0;
        while (n != 0) {
            int rem = n % 10;
            arm += (int) Math.pow(rem, counter(temp));
            n /= 10;
        }
        return arm == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int n = sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println("yes " + n + " is an armstrong number!");
        } else {
            System.out.println("No " + n + " is not an armstrong number!");
        }
        sc.close();
    }
}
