package First;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int x= scanner.nextInt();
        int sum=0,i;
        if(x<1)
        {
            System.out.println("Недопустимое значение");
            return;
        }else if(x%2==0)
        {
            for(i=0;i<x/2;i++)
                sum=sum+(x+1);}
        else{
            for(i=0;i<x/2;i++)
                sum=sum+(x+1);
            sum=sum+((x+1)/2);
        }
        System.out.println(sum);
    }
}
