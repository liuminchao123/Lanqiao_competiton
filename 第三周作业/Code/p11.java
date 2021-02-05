import java.util.*;
public class p11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Integer> a=new TreeSet<Integer>();
        for (int i = 0; i < 10; i++) {
            a.add(sc.nextInt());
        }
        for (int x:a
             ) {
            System.out.println(x);
        }
    }
}
