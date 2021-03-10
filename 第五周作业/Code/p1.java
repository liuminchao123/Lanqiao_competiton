import java.util.*;

public class p1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		prime_factor(number);
	}

	// 输出
	static void prime_factor(int number){
		for(int i = 2; i < number; i ++){
			if(number%i == 0 && prime(i))
				System.out.print(i + " ");
		}
	}

	// 判断是否为质数
	static boolean prime(int number){
		for(int i = 2; i < number; i ++)
			if(number%i == 0)
				return false;
		return true;	
	}

}