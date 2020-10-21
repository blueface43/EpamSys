package First;

public class Task15 {
    public static void main(String[] args) {
        long  mul=1;
        for(int i=1;i<=200;i++) {
            mul*=Math.pow(i,2);
        }
        System.out.println(mul);
    }
}
