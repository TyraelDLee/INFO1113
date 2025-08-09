package T1;

public class Sort3Integers {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        if(x >= y && x >= z){
            if(y > z)
                System.out.println(x + "\n" + y + "\n" + z);
            else
                System.out.println(x + "\n" + z + "\n" + y);
        }

        else if(y >= x && y >= z){
            if(x > z)
                System.out.println(y + "\n" + x + "\n" + z);
            else
                System.out.println(y + "\n" + z + "\n" + x);
        }

        if(z >= y && z >= x){
            if(y > x)
                System.out.println(z + "\n" + y + "\n" + x);
            else
                System.out.println(z + "\n" + x + "\n" + y);
        }
    }
}
