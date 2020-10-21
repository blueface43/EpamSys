package First;
import java.util.Scanner;
public class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты 3-х точек:");
        int x1= scanner.nextInt();
        int y1= scanner.nextInt();
        int x2= scanner.nextInt();
        int y2= scanner.nextInt();
        int x3= scanner.nextInt();
        int y3= scanner.nextInt();
        if((y3-y1)/(y2-y1)-((x3-x1)/(x2-x1))==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
