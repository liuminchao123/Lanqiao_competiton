import java.util.Scanner;

public class p1{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		// 读取两个整数
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		a = inverted(a);
		b = inverted(b);
		int sum = a + b;

		System.out.println(inverted(sum)); // 输出结果
	}

	// 输入一个整数，求出她的反置数
	static int inverted(int number){
		int new_number = 0;
		String Str_Num = Integer.toString(number); // 将整数转换为字符串
		char[] Char_Num = Str_Num.toCharArray(); // 将字符串转换为字符数组
		char[] New_Char_Num = new char[Char_Num.length];
		int i = Char_Num.length-1;
		for(int j = 0; i >= 0; i --, j ++)
			New_Char_Num[j] = Char_Num[i];

		String New_Str_Num = String.valueOf(New_Char_Num); // 将字符数组转换为字符串
		new_number = Integer.parseInt(New_Str_Num); // 将字符串转换为整数

		return new_number;
	}
}