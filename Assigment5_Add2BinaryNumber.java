// 5. Write a Java program to add two binary numbers.

import java.util.Scanner;

public class Assigment5_Add2BinaryNumber {
    public static boolean checkBinary(String input) {
        return input.matches("[01]+");
    }

    public static String getBinaryInput(Scanner Sc, String message) {
        String input;
        while (true) {
            System.out.print(message);
            input = Sc.nextLine();
            if (checkBinary(input)) {
                return input;
            } else {
                System.out.println("Invalid input! Please enter only binary numbers (0 and 1).");
            }

        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        // Get valid binary inputs
        String bn1 = getBinaryInput(Sc, "Enter first binary no. : ");
        String bn2 = getBinaryInput(Sc, "Enter second binary no. : ");
        // Convert binary strings to integers
        int num1 = Integer.parseInt(bn1, 2);
        int num2 = Integer.parseInt(bn2, 2);
        // Add and convert back to binary
        int sum = num1 + num2;
        String binarySum = Integer.toBinaryString(sum);
        System.out.println("Sum of the binary numbers: " + binarySum);

    }
}
