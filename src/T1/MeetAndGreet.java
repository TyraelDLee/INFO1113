package T1;
import java.util.Scanner;

public class MeetAndGreet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hi, What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
