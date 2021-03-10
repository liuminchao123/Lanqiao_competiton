import java.util.*;

public class p5{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		double grade = scanner.nextDouble();
		judgement(grade);
	}

	// 输出
	static void judgement(double grade){
		if(grade >= 90 && grade <= 100)
			System.out.println("A");
		if(grade >= 80 && grade < 90)
			System.out.println("B");
		if(grade >= 70 && grade < 80)
			System.out.println("C");
		if(grade >= 60 && grade < 70)
			System.out.println("D");
		if(grade < 60)
			System.out.println("E");
	}

}