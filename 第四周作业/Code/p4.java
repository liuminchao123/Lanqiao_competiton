import java.util.Scanner;

public class p4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		char[] Char1 = str.toCharArray();	
		if(aba(Char1, 0, Char1.length-1)) 
			System.out.println("yes!");
		else 
			System.out.println("no!");	
	}

	// 判断是否是回文数
	static boolean aba(char[] CharArray, int i, int j){
		if(i == j ) return true;
		if(i > j) return false;
		if(i < j)
			if(CharArray[i] != CharArray[j]) 
				return false;
			aba(CharArray, ++i, --j);
			return true;
		
	}
}