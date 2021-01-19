
public class p4{
	public static void main(String[] args){



	}

	// 找到数组中两个数之和为 sum 的数字组合，若无，返回空数组
	static int[] pick(int[] array, int sum){
		int[][] plus_sum = new int[0][];

		for(int i = 0; i < array.length-1; i ++){
			for(int j = 1; j < array.length; j ++)
				if(sum == array[i] + array[j])
					plus_sum.add(array[i],array[j]);
		}

	}

}