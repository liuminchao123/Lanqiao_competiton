import java.util.*;

// A-65  Z-90  a-97  z-122
public class p11{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String Secret_Code = scanner.nextLine();
		char[] Secret_Code_Array = Secret_Code.toCharArray();
		// System.out.println("Secret_Code: " + Secret_Code);
		// System.out.println("Secret_Code_Array: " + Arrays.toString(Secret_Code_Array));

		for(int i = 0; i < Secret_Code_Array.length; i ++){
			if((int)Secret_Code_Array[i] == 32)
				continue;
			// 将大写字母转换
			if((int)Secret_Code_Array[i] > 64 && (int)Secret_Code_Array[i] < 91){
				if((int)Secret_Code_Array[i] - 5 < 65){
					Secret_Code_Array[i] = (char)((int)Secret_Code_Array[i] + 21);
					continue;
				}
				Secret_Code_Array[i] = (char)((int)Secret_Code_Array[i] - 5);
			}
			// 将小写字母转换
			if((int)Secret_Code_Array[i] > 96 && (int)Secret_Code_Array[i] < 123){
				if((int)Secret_Code_Array[i] - 5 < 97){
					Secret_Code_Array[i] = (char)((int)Secret_Code_Array[i] + 21);
					continue;
				}
				Secret_Code_Array[i] = (char)((int)Secret_Code_Array[i] - 5);
			}
		}

		System.out.println(String.valueOf(Secret_Code_Array));
	}
}