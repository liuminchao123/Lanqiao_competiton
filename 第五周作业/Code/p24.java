import java.util.Scanner;

public class p24{
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			int sum = a * b * c;
			for (int i = 1; i < sum; i++) {
				if (i % a == 0 && i % b == 0 && i % c == 0) {
					sum = i;
					break;
				}
			}
			System.out.println(sum);
		}
}

