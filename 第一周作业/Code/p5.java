import java.util.Scanner;

public class p5{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		// 接收输入
		int n = scanner.nextInt();

		int num = 0; // 计数器
		int sum ; // i + (i+1) + (i+2) 的和
		for(int i = 0; i < n; i ++){
			sum = i + (i+1) + (i+2);
			if(take(i,1) + take(i+1,1) + take(i+2,1) == take(sum,1));
			else continue;
			if(take(i,10) + take(i+1,10) + take(i+2,10) == take(sum,10));
			else continue;
			if(take(i,100) + take(i+1,100) + take(i+2,100) == take(sum,100));
			else continue;
			if(take(i,1000) + take(i+1,1000) + take(i+2,1000) == take(sum,1000));
			else continue;

			num++;
		}

		System.out.println(num);
	}

	// 从整数i中取出j位的数 j代表数量级
	static int take(int i, int j){
		int i_j = 0;  // i的j位数
		if(j == 1) i_j = i - i%10;
		if(j == 10) i_j = (i%100 - take(i, 1))/10;
		if(j == 100) i_j = i%1000 - take(i, 10)*10 - take(i, 1);
		if(j == 1000) i_j = i%10000 - take(i, 100)*100 - take(i, 10)*10 - take(i, 1);

		return i_j;  // 返回该位上的数
	}

}