// Write a Java program to determine maximum from given 100 numbers.

import maxutil.Pack_MaxFinder;
import java.util.Scanner;

public class Assigment1_FindMax {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int[] numbers = new int[100];
        System.out.println("Enter 100 Numbers...");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + " : ");
            numbers[i] = Sc.nextInt();
        }
        Pack_MaxFinder Max_finder = new Pack_MaxFinder();
        int max = Max_finder.FindMax(numbers);
        System.out.println("Max number : " + max);
        Sc.close();
    }
}
