import java.util.Scanner;

public class p5{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		double Profit = scanner.nextDouble();
		double BonusSum = Profit_To_Bonus(Profit);
		System.out.println(String.format("%.2f", BonusSum));
	}

	static double Profit_To_Bonus(double Profit){
		double Bonus = 0.00;
		if(Profit <= 100000)
			Bonus = Profit*0.1;
		if(Profit > 100000){
			if(Profit <= 200000)
				Bonus = Profit_To_Bonus(100000) + (Profit-100000)*0.075;
			if(Profit <= 400000 && Profit > 200000)
				Bonus = Profit_To_Bonus(200000)+ (Profit-200000)*0.05;
			if(Profit > 400000 && Profit <= 600000)
				Bonus = Profit_To_Bonus(400000) + (Profit-400000)*0.03;
			if(Profit > 600000 && Profit <= 1000000)
				Bonus = Profit_To_Bonus(600000) + (Profit-600000)*0.015;
			if(Profit > 1000000)
				Bonus = Profit_To_Bonus(1000000) + (Profit-1000000)*0.01;
		}
		return Bonus;
	}
}