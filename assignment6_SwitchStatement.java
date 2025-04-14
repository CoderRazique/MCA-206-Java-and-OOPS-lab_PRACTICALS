// 6. Write a Java program for switch statement.

import java.util.Scanner;

public class assignment6_SwitchStatement {
    public static int[] inputTwoNumber(Scanner sc) {
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();
        return new int[] { a, b };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("===== MENU =====");
            System.out.println("Press + to add of two numbers");
            System.out.println("Press - to subtruct of two numbers");
            System.out.println("Press * to multiply of two numbers");
            System.out.println("Press / to divid of number");
            System.out.println("Press % to remainder of number");
            System.out.println("Press 0 to EXIT");

            System.out.print("Your choice (Like +, -, *, /, %) : ");
            char ch = sc.next().charAt(0);
            switch (ch) {
                case '+':
                    int addNum[] = inputTwoNumber(sc);
                    System.out.println("Sum of both number : " + (addNum[0] + addNum[1]));
                    break;
                case '-':
                    int subNum[] = inputTwoNumber(sc);
                    System.out.println("Subtruct of both number : " + (subNum[0] - subNum[1]));
                    break;
                case '*':
                    int mulNum[] = inputTwoNumber(sc);
                    System.out.println("Multiply of both number : " + (mulNum[0] * mulNum[1]));
                    break;
                case '/':
                    int divNum[] = inputTwoNumber(sc);
                    try {
                        if (divNum[1] == 0) {
                            System.out.println("ERROR: Division not possible because denominator is zero.");
                        } else {
                            System.out.println("Division of both numbers: " + ((float) divNum[0] / (float) divNum[1]));
                        }
                    } catch (Exception e) {
                        System.out.println("Something went wrong: " + e);
                    }
                    break;
                case '%':
                    int remNum[] = inputTwoNumber(sc);
                    System.out.println("remainder of both number : " + (remNum[0] % remNum[1]));
                    break;
                case '0':
                    return;

                default:
                    System.out.println("Invalid Input...");
                    System.out.println("Please valid input according to menu...");
                    break;
            }
            System.out.print("Press Enter to continue...");
            try {
                System.in.read(); // waits for Enter
                System.in.read(); // extra read to clear buffer
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
