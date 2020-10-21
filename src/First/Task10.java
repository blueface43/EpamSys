package First;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размер отверстия A,B");
        float A,B;
        A= scanner.nextFloat();
        B= scanner.nextFloat();
        System.out.println("Введите парамтры кирпича x,y,z");
        float x,z;
        x= scanner.nextFloat();
        z=scanner.nextFloat();
        if((A>x && B>z)||(A>z && B>x))
            System.out.println("Пройдёт");
        else
            System.out.println("Не пройдёт");

    }
}
