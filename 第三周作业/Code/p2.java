import java.util.Scanner;

public class p2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String s1 = scanner.next();
		String s2 = scanner.next();

		char[] s1_CharArray = s1.toCharArray();
		char[] s2_CharArray = s2.toCharArray();

		for(int i = 0; i < s1_CharArray.length && i < s2_CharArray.length; i ++)
			if(equals(s1_CharArray[i], s2_CharArray[i]) != 0){
				int diff = (int)(s1_CharArray[i] - s2_CharArray[i]);
				System.out.println(diff);
				break;
			}
	}

	// 判断输入的两个字符的大小
	static int equals(char char1, char char2){

		int diff = (int)char1 - (int)char2;
		if(diff > 0)
			return 1;
		if(diff < 0)
			return -1;
		return 0;
	}
}