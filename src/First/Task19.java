package First;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a,b,x;
        System.out.println("Введите a:");
        a= scanner.nextInt();
        System.out.println("Введите b:");
        b= scanner.nextInt();
        scanner.close();
        do {
            x=b;
            do{
                if(a%10==x%10){
                    System.out.println("Повторяющеяся цифра:"+a%10);
                    break;
                }
                x/=10;
            }while(x!=0);
            a/=10;
        }while (a!=0);
    }
}
