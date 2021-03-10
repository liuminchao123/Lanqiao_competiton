import java.util.*;

public class p6{
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		int temp;
		int k = 0; // 计数 
		for (int i = 1499; i <= 9941; i++) {
			String str = String.valueOf(i);
			char[] c = str.toCharArray();
			Arrays.sort(c);
			str = String.valueOf(c);
			if (str.equals("1499")) {
				set.add(i);
			}
		}
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			temp = iter.next();
			if (GetNum(temp)) {
				k++;
			}
		}
		System.out.println(k);
	}
 
	public static boolean GetNum(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
	// public static void main(String[] args){
	// 	Scanner scanner = new Scanner(System.in);
		
	// 	String number = scanner.nextLine();
	// 	char[] num_char = number.toCharArray();
	// 	int num = fullarray(num_char);
	// 	System.out.println(num);	
	// }

	// // 进行数字的全排列
	// static int fullarray(char[] number){
	// 	int k = 0;
	// 	if()
	// 	for(int x=0; x < number.length; x++)
	// 		for(int y=x; y < number.length; y++)
	// 			for(int z=y+1; z < number.length; z++){
					
	// 			}
	// }

	// // 判断是否为素数
	// static boolean prime(int number){
	// 	if(number%2 == 0 || number%3 == 0 || number%5 == 0 || number%7 == 0)
	// 		return false;
	// 	return true;
	// }

	// // 交换元素位置
	// static char[] swap(char[] array, int i, int j){
	// 	char mid = array[i];
	// 	array[i] = array[j];
	// 	array[j] = mid;
	// 	return array;
	// }
// }