package First;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,e,sum=0,n=1;
        System.out.println("Введите e");
        e= scanner.nextDouble();
        if((1/Math.pow(2,n))+(1/Math.pow(3,n))>=e)
        for(n=1;Math.abs((1/Math.pow(2,n))+(1/Math.pow(3,n)))>=e;n++) {
            a=(1/Math.pow(2,n))+(1/Math.pow(3,n));
            sum+=a;
            System.out.println(sum);
            if(a<e) {
                break;
            }
        }

    }
}
