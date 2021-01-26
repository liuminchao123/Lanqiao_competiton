import java.util.Scanner;

public class p2{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String result = "";

		for(int i = a; i <=b; i ++){
			if(prime_(i))
				System.out.println(i + "=" + i);
			else{
				result = str_result(i, result);
				System.out.println(i + "=" + result);
			}
			result = "";
		}
	}

	// 判断是否为素数
	static boolean prime_(int number){
		for(int h = 2; h < number; h ++)
			if(number%h == 0) 
				return false;
		return true;
	}

	// 返回整数的一个最小因子（大于1）
	static int factor(int number){
		for(int k = 2; k < number; k ++)
			if(number%k == 0)
				return k;
		return 1;
	}

	// 结果字符串
	static String str_result(int number, String result){
		// 判断较大的因数是否为素数
		if(prime_(number / factor(number)))
			result = result + factor(number) + "*" + number/factor(number);
		else // 若不是 递归
			result = result + factor(number) + "*" + str_result(number / factor(number), result);
		
		return result;
	}
}