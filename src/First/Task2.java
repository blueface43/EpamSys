package First;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a,b,c,z;
        System.out.println("Enter a,b,c: ");
        a= scanner.nextDouble();
        b= scanner.nextDouble();
        c= scanner.nextDouble();
        z=((b+Math.sqrt(Math.pow(b,2)+4*a*c))/2)-(Math.pow(a,3)*c)+Math.pow(b,-2);
        System.out.println("Value z="+z);
    }
}
