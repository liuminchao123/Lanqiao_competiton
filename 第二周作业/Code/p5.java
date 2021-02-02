import java.util.Scanner;
 
public class p5 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		int data[] = new int[n];
		for (int i = 0; i < data.length; i++)
			data[i] = sc.nextInt();
		sc.close();
 
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			int max = data[i];
			int min = data[i];
			for (int j = i; j < data.length; j++) {
				if (min > data[j])
					min = data[j];
				if (data[j] > max)
					max = data[j];
				if (max - min == j - i)
					count++;
			}
		}
		System.out.println(count);
	}
}