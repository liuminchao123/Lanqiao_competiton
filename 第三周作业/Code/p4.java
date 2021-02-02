import java.util.Scanner;

public class p4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		String Str_N = split(N);
		// String StrN = Integer.toString(N);

		System.out.println(Str_N);
	}

	// 拆分整数
	static String split(int Number){
		String StrN = Integer.toString(N);
		return split(StrN);
	}

	static String split(String Str){
		int Number = Integer.parseInt(Str);
		if(Number == 1)
			return Str + "+2(0)";
	}

	
}