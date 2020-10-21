package First;

public class Task17 {
    public static void main(String[] args) {
        System.setProperty("console.encoding","Cp866");
        for(short i=1;i<=127;i++){
        short code=i;
        char symbol=(char)code;
        System.out.println(code+" "+symbol);
        }
    }
}
