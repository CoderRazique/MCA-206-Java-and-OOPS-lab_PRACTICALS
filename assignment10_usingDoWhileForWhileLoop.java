// 10. Write a Java program using while loop, do while loop, for loop.

public class assignment10_usingDoWhileForWhileLoop {
    public static void usingForLoop(int n) {
        System.out.println("Print 1 to 'n' using for loop :");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void usingWhileLoop(int n) {
        System.out.println("Print 1 to 'n' using while loop : ");
        int i = 1;
        while (n + 1 != i) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    public static void usingDoWhileLoop(int n) {

        System.out.println("Print 1 to 'n' using do while loop :");
        int i = 1;
        do {
            System.out.print(i + " ");
        } while (n != i++);

    }

    public static void main(String[] args) {
        usingForLoop(10);
        usingWhileLoop(10);
        usingDoWhileLoop(10);
    }
}
