import java.util.Scanner;

public class p8{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String letters = scanner.next();
		char[] letter = letters.toCharArray();
		if(juice(letter[0]))
			System.out.println("upper");
		else
			System.out.println("lower");
	}

	// 判断
	static boolean juice(char letter){
		if(letter >= 'A' && letter <= 'Z')
			return true;
		return false;
	}
}