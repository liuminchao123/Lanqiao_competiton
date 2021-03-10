import java.util.*;

public class p4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();
		char[] strArray = str.toCharArray();
		int k = 0;
		for(char i : strArray)
			if((int)i >= 48 && (int)i <= 57)
				k++;

		System.out.println(k);
	}

}