import java.util.Scanner;

public class p8{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();

		double k; // 斜率
		if(x1 - x2 == 0){
			System.out.println("INF");
			return;
		}
		k = (y1 - y2)/(x1 - x2);
		System.out.println((int)k);

	}
}