package Week1;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        if (input % 2 == 1)
            System.out.printf("The number %d is odd.\n", input);
        else
            System.out.printf("The number %d is even.\n", input);
    }
}
