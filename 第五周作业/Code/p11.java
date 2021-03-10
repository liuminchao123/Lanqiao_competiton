import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;;

public class p11 {
	static String[] g;
	static int num = 0;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);			//Scanner输入
		String str = reader.nextLine();		
		char[] r = str.toCharArray();						//将输入的数转换成数组
		int s = 1;
		for (int i = 1; i <= r.length; i++) {
			s *= i;											//阶乘计算数组所需的大小
		}
		g = new String[s];
		Arrays.sort(r);										//对输入的数字进行排序
		
		Count(new String(r), str.length() - 1, "");			//调用Count方法，运用递归
		
		List<String> list = new ArrayList<String>();		//这一个代码段表示运用List去除数组中重复的数值，
		for (String b : g) {
			if (!list.contains(b))
				list.add(b);
		}
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		reader.close();
	}

	static void Count(String str, int k, String str2) {			
		if (k == -1) {										//如果k==-1，则将排列好的数，存入数组g中，并返回
			g[num++] = str2;
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			Count(str.substring(0, i) + str.substring(i + 1), k - 1, str2 + str.charAt(i));   	//递归调用Count方法，枚举所有可能的数
		}
	}
}








// import java.util.Scanner;

// public class p10{
// 	public static void main(String[] args){
// 		Scanner scanner = new Scanner(System.in);

// 		String number = scanner.nextLine();
// 		char[] num = number.toCharArray();
// 		recursion(num, 0, num.length-1);
// 	}

// 	// 递归实现全排列
// 	static void recursion(char[] num, int i, int j){
// 		if(num.length == 1){
// 			System.out.println(num[0]);
// 			return;
// 		}


// 	}

// 	// 交换元素位置
// 	static char[] swap(char[] array,int i,int j){
// 		char mid = array[i];
// 		array[i] = array[j];
// 		array[j] = mid;
// 		return array;
// 	}

// 	// 打印数字
// 	static void printer(char[] array){
// 		for(int i  = 0; i < array.length; i ++)
// 			System.out.print(array[i]);
// 	}
// }