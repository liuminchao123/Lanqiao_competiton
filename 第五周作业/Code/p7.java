import java.util.Scanner;

public class p7{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String str = scanner.next();
		char[] str1 = str.toCharArray();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		char[] userInput = str.toCharArray();

		process(str1, x, y);
	}

	// 
	static void process(char[] array, int x, int y){
		int result = 0;
		switch(array[0]){
			case '+':
				result = x + y;
				System.out.println(result);
				break;
			case '-':
				result = x - y ;
				System.out.println(result);
				break;
			case '*':
				result = x * y;
				System.out.println(result);
				break;
			case '/':
				result = x / y;
				System.out.println(result);
				break;
		}
	}
}