package T1;
import java.util.*;

public class Roll {
    public static void main(String[] args) {
        // Option 1
        int roll = (int)Math.floor(Math.random() * 6) + 1;
        // Math.random() return a random double between greater than or equal to 0.0 and less than 1.0
        // time 6, we get value between  greater than or equal to 0.0 and less than 6.0
        // Math.floor returns the largest (closest to positive infinity) double value that is less than or equal to the argument and is equal to a mathematical integer.
        // After floor, the value mathematical integer but the type in Java is still double and Java is a strong type language, we cannot assign a double to an "int".
        // So we need cast that value to "int" type by (int)
        System.out.println(roll);

        // Option 2
        roll = new Random().nextInt(6) + 1;
        System.out.println(roll);
    }
}
