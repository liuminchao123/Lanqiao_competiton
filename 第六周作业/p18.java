import java.math.BigInteger;
import java.util.Scanner;

public class p18{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger n = new BigInteger(scanner.next());
		BigInteger m = new BigInteger(scanner.next());
		System.out.println(n.multiply(m));
	}
}

