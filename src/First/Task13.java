package First;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b,h,x,y=0;
        System.out.println("a=");
        a= scanner.nextFloat();
        System.out.println("b=");
        b= scanner.nextFloat();
        System.out.println("h=");
        h= scanner.nextFloat();
        System.out.println("x=");
        x= scanner.nextFloat();
        while (y>=a && y<=b)
        {
            if(x>2) {
                y=x;
                if(y>=a && y<=b)
            System.out.println("x="+x+"; y="+ y+";");
            }
            else if(x<=2) {
                y=-x;
                if(y>=a && y<=b)
            System.out.println("x="+x+"; y="+ y+";");
            }

            x+=h;
        }

}}
