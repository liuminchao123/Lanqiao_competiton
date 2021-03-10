import java.util.Scanner;
 
 
public class p14{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int m = in.nextInt();
        in.close();
        System.out.println(a * a % m);
    }
}
 