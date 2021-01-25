 
public class p12 {
 
	public static void main(String[] args) {

		int a, b, c, d;
		for (int i = 999; i <= 9999; i++) {
			a = i / 1000;
			b = i % 1000 / 100;
			c = i % 100 / 10;
			d = i % 10;
 
			if (a == b || a == c || a == d || b == c || b == d || c == d) {
				continue;
			}else {
				for (int e = 0; e < 10; e++) {
					if (e != a && e != b && e != c && e != d) {
						int num1 = e * 100 + a * 10 + b;
						int num2 = c * 10 + e;
						if (num1 * num2 == i) {
							System.out.println(num1 + " * " + num2 + " = " + i);
						}
					}
				}
			}
		}
	}
 
}


