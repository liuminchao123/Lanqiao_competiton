import java.util.Scanner;

public class p9{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNext("0")){
            int n = sc.nextInt();
            int count = 0;
            while(n / 3 > 0){
                count += n / 3;
                n = n / 3 + n % 3;
                if(n == 2){
                    n = n + 1;
                }
            }
            System.out.println(count);
        }
    }

	// public static void main(String[] args){
	// 	Scanner scanner = new Scanner(System.in);

	// 	int[] battles = new int[3];
	// 	for(int i = 0; i < 3; i ++)
	// 		battles[i] = scanner.nextInt();
	// 	int freebattles = 0;
	// 	battles_magic(battles[0], freebattles);
	// 	battles_magic(battles[1], freebattles);
	// 	battles_magic(battles[2], freebattles);
	// }

	// // num 代表满汽水或者是空瓶子   free 代表白嫖的汽水
	// static void battles_magic(int num, int free){
	// 	if(num <= 1){
	// 		System.out.println(free);
	// 		return;
	// 	}
	// 	free = free + num/3; // 喝空后换的
	// 	num = num%3 + num/3; // 换完后剩的

	// 	if(num == 2){
	// 		num = 0;
	// 		free ++;
	// 	}

	// 	battles_magic(num, free);
	// }
}