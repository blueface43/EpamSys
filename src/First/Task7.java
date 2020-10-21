package First;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double x= scanner.nextDouble();
        double y= scanner.nextDouble();
        if(180-x-y>0){
            System.out.println("Yes");
            if (x == 90 || y == 90 || x+y==90)
                System.out.println("Yes");
            else System.out.println("No");
        }else
            System.out.println("No");

    }
}
