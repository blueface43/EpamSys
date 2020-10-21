package First;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        int i,j,x,k,m,n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите m");
        m=scanner.nextInt();
        System.out.println("Введите n");
        n=scanner.nextInt();
        scanner.close();
        for(i=m;i<=n;i++) {
            System.out.print("Делители числа"+i+": ");
            for(j=2;j<=i/2;j++) {
                if(i%j==0)
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        }
    }
