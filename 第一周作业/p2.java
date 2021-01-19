
import java.util.Scanner;

public class p2{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		int[] array = new int[11];

        for(int i = 0; i < 11; i ++)
        	array[i] = scanner.nextInt();  //接受一个整数

		pick(array);

	}

	// 选中最大最小值并打印
	static void pick(int[] array){

		int max = array[0];
		int min = array[0];
		for(int j = 0; j < array.length; j ++){
			if(array[j] > max)
				max = array[j];
			if(array[j] < min)
				min = array[j];
		}

    	System.out.println(max + " " + min);
	}

}