import java.util.Scanner;

public class p8{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		IsPrime(num);
	}

	// 
	static void IsPrime(int num){
		if(num <= 2)
			return;
		for(int i = 2; i < num; i ++){
			if(num%i == 0){
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
	}
}