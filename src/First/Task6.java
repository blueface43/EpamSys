package First;
import java.util.Scanner;

public class Task6{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double x= scanner.nextDouble();
        double y= scanner.nextDouble();
        if(x>=-4 && x<=5 && y>=-3 && y<=0)
            System.out.println("true");
        else if (x>=-2 && x<=2 && y>=0 && y<=4)
            System.out.println("true");
        else System.out.println("false");
    }
}
