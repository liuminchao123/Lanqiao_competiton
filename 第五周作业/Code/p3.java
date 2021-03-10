import java.util.*;

public class p3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int[] numbers = new int[num];
		for(int i = 0; i < num; i ++)
			numbers[i] = scanner.nextInt();
		printer(numbers);
	}

	// 输出
	static void printer(int[] numbers){
		int max = numbers[0];
		int min = numbers[0];
		int sum = numbers[0];
		for(int i = 1; i < numbers.length; i ++){
			if(numbers[i] > max)
				max = numbers[i];
			if(numbers[i] < min)
				min = numbers[i];
			sum = sum + numbers[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}

}