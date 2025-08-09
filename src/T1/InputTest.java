package T1;

import java.util.Scanner;

class InputTest{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int number = scan.nextInt();
        System.out.println(line + " " + number);
    }
}
