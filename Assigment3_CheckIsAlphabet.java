// Java program to check whether a given character is alphabet or not.

import java.util.Scanner;

public class Assigment3_CheckIsAlphabet {
    public static boolean CheckCharIsAlphabet(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = Sc.next().charAt(0);
        if (CheckCharIsAlphabet(ch)) {
            System.out.println(ch + " is an alphabet");
        } else {
            System.out.println(ch + " is not an alphabet");
        }
        Sc.close();
    }
}
