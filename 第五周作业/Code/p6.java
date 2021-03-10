import java.lang.Math;

public class p6{
	public static void main(String[] args){
		double AB = 52.1;
		double BC = 57.2;
		double CD = 43.5;
		double DE = 51.9;
		double EA = 33.4;
		double EB = 68.2;
		double EC = 71.9;

		// 三角形 ABE
		double S = area(AB, EA, EB) + area(BC, EC, EB) + area(EC, DE, CD);
		System.out.println(String.format("%.2f", S));
	}

	// 计算三角形面积
	static double area(double a, double b, double c){
		double p = (a + b + c)/2;
		double mid = p*(p-a)*(p-b)*(p-c);
		double S = Math.sqrt(mid);

		return S;
	}
}