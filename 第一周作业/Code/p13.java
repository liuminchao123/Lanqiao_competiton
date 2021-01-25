import java.util.Scanner;

public class p13 {
 
	public static void main(String[] args) {

		double x;
		Scanner scanner = new Scanner(System.in);

		double a = scanner.nextDouble();
		double b = scanner.nextDouble();

		if(a == 0)  return;

		x = -b / a;
		String result = String.format("%.2f", x);
		System.out.println(result);
	}
}
