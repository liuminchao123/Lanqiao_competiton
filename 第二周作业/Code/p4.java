import java.util.Scanner;
import java.util.Arrays;

public class p4{
	public static void main(String[] args){
		int[][] array = new int[4][4];
		array[0][0] = 16;
		array[0][3] = 13;
		array[1][2] = 11;
		array[2][0] = 9;
		array[3][1] = 15;
		array[3][3] = 1;
		int[] array1 = {2, 3, 4 ,5 ,6, 7, 8 ,10, 12, 14};
		int sum = 0;

		for(int i = 0; i < 10; i ++){
			for(int j = i+1; j < 11; j ++){
				array[0][1] = array1[0];
				array[0][2] = array1[1];
				array[1][0] = array1[2];
				array[1][1] = array1[3];
				array[1][3] = array1[4];
				array[2][1] = array1[5];
				array[2][2] = array1[6];
				array[2][3] = array1[7];
				array[3][0] = array1[8];
				array[3][2] = array1[9];

				permute(array, array1, 0);

				// 计算每行每列应该满足的和
				// for(int k = 0; k < 4; k ++)
				// 	sum = sum + array[0][k];

				// if(sum_same(array, sum))
				// 	System.out.println(array[2][3]);

				// array1 = swap(array1, i, j-1); // 复原
				// array1 = swap(array1, i, j);
				// sum = 0;  // 归零
			}
		}
	}

	// 	判断数组是否满足条件
	static boolean sum_same(int[][] array, int sum){
		int sum1 = 0;
		// 判断每列是否成立
		for(int i = 0; i < 4; i ++){
			sum1 = array[i][0] + array[i][1] + array[i][2] + array[i][3];
			if(sum1 == sum);
			else return false;
		}

		// 判断每行是否成立
		for(int i = 0; i < 4; i ++){
			sum1 = array[0][i] + array[1][i] + array[2][i] + array[3][i];
			if(sum1 == sum);
			else return false;
		}

		// 判断对角线是否成立
		sum1 = array[0][0] + array[1][1] + array[2][2] + array[3][3];
		if(sum1 == sum);
		else return false;

		sum1 = array[0][3] + array[1][2] + array[2][1] + array[3][0];
		if(sum1 == sum);
		else return false;

		return true;	
	}

	// 全排列
	static void permute(int[][] array, int[] array1, int start){
		int sum = 0;
		
		if(start == array1.length) // 输出
				System.out.println(Arrays.toString(array1));
		else{
			for(int i = start;i < array1.length;++ i){
				swap(array1,start,i);  //  交换元素
				permute(array, array1, start+1);  //交换后，再进行全排列算法

				// 计算每行每列应该满足的和
				for(int k = 0; k < 4; k ++)
					sum = sum + array[0][k];

				if(sum_same(array, sum))
					System.out.println(array[2][3]);

				swap(array1, start, i);  //还原成原来的数组，便于下一次的全排列
				}
		}

	}

	// 交换数组中指定位置的元素
	static int[] swap(int[] array, int a, int b){

		// try{
		// 	int c = array[a];
		// 	array[a] = array[b];
		// 	array[b] = c;
		// }catch (Exception e){
		// 	return array;
		// }
		int c = array[a];
		array[a] = array[b];
		array[b] = c;

		// System.out.println(Arrays.toString(array));
		return array;
		}
}