package First;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a,b,z;
        System.out.println("Enter a,b,c: ");
        a= scanner.nextDouble();
        b= scanner.nextDouble();
        z=(Math.sin(a)+Math.cos(b))/(Math.cos(a)-Math.sin(b))*Math.tan(a*b);
        System.out.println("Value z="+z);
    }
}
