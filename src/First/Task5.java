package First;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T = scanner.nextInt();
        int hh,mm,ss;
        hh=T/3600;
        mm=T%3600/60;
        ss=T%60;
        System.out.println(hh+" "+mm+" "+ss);
    }
}
