package First;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите x");
        double F, x= scanner.nextDouble();
        if(x<=3)
            F=Math.pow(x,2)-3*x+9;
        else
            F=1/(Math.pow(x,3)+6);
        System.out.println("F="+F);
    }
}
