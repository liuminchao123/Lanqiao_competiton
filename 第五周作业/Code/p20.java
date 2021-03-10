import java.util.Scanner;

public class p20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        System.out.print(helper2(n));
    }
	//An
    public static String helper1(int n) {
        StringBuilder s = new StringBuilder();
        s.append("sin(1");
        for (int i = 2; i <= n; i++) {
            s.append(i % 2 == 1 ? "+sin(" + i : "-sin(" + i);
        }
        //蓝桥杯调试repeat方法不通过，可替用for实现
        s.append(")".repeat(Math.max(0, n)));
        return s.toString();
    }
	//Sn
    public static String helper2(int n) {
        if (n == 1)
            return "sin(1)+1";
        StringBuilder s = new StringBuilder();
        s.append("(".repeat(Math.max(0, n - 1)));
        s.append("A1+").append(n).append(")");
        for (int i = 1; i < n - 1; i++) {
            s.append("A").append(i + 1).append("+").append(n - i).append(")");
        }
        s.append("A").append(n).append("+1");
        String result = s.toString();
        for (int i = 1; i <= n; i++) {
            result = result.replace(("A" + i), helper1(i));
        }
        return result;
    }
}

