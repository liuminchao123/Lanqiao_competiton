import java.util.Scanner;

public class p3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();
		char[] Char1 = str.toCharArray();
		if(Char1[0] >= '0' && Char1[0] <= '9')
			System.out.println("yes");
		else{
			System.out.println("no");
		}
		
	}
}