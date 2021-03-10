import java.util.*;

public class p2{
	static int CitiesNum; // 城市的数量
	static int t; // 飞机单位里程的价格
	static int A; // A城市序号
	static int B; // B城市序号
	static double xA; // A城市中心x坐标
	static double yA; // A城市中心y坐标
	static double xB; // B城市中心x坐标
	static double yB; // B城市中心y坐标
	static double LowestPay = 0.0; // 最少花费

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		CitiesNum = scanner.nextInt();
		t = scanner.nextInt();
		A = scanner.nextInt();
		B = scanner.nextInt();

		int[][] infs = new int[CitiesNum][7];
		for(int i = 0; i < CitiesNum; i ++){
			for(int j = 0; j < 7; j ++){
				infs[i][j] = scanner.nextInt();
			}
		}

		judgement(infs);
	}

	// 获取二维数组  城市信息
	static void judgement(int[][] array){
		// 若在同一城市
		if(A == B){
			System.out.println(0);
			return;
		}

		// 创建A城市信息
		int[] CityA = new int[7]; 
		for(int k = 0; k < CityA.length; k ++)
			CityA[k] = array[A-1][k];
		xA = getX(CityA);
		yA = getY(CityA);

		// 创建B城市信息
		int[] CityB = new int[7]; 
		for(int k = 0; k < CityB.length; k ++)
			CityA[k] = array[B-1][k];
		xB = getX(CityB);
		yB = getY(CityB);

		judgeBest(CityA, CityB);
	}

	// 获取城市中心点坐标x
	static double getX(int[] array){
		double x0 = (array[0] + array[2] + array[4]) / 3;
		return x0;
	}

	// 获取城市中心点坐标y
	static double getY(int[] array){
		double y0 = (array[1] + array[3] + array[5]) / 3;
		return y0;
	}

	// 找到最佳方案
	static void judgeBest(int[] CityA, int[] CityB){
		double Pay;
		double mid;
		LowestPay = 9999;
		for(int n = 0; n < 3; n ++){
			for(int m = 0; m < 3; m ++){
				// (x1 - x2)^2 + (y1 - y2)^2
				mid = (CityA[n*2] - CityB[m*2])*(CityA[n*2] - CityB[m*2]) + (CityA[n*2+1] - CityB[m*2+1])*(CityA[n*2+1] - CityB[m*2+1]);

				Pay = Math.sqrt(mid) * t; // AB城市之间的花费
				// System.out.println("Pay1: " + Pay);

				for(int r = 0; r < 3; r ++){
					mid = (CityA[r*2] - xA)*(CityA[r*2] - xA) + (CityA[r*2+1] - yA)*(CityA[r*2+1] - yA);
					Pay += Math.sqrt(mid) * CityA[6]; // A城市到机场的花费
					// System.out.println("Pay2: " + Pay);

					for(int q = 0; q < 3; q ++){
						mid = (CityB[q*2] - xB)*(CityB[q*2] - xB) + (CityB[q*2+1] - yB)*(CityB[q*2+1] - yB);
						Pay += Math.sqrt(mid) * CityB[6]; // B城市到机场的花费
						// System.out.println("Pay3: " + Pay);

						if(Pay <= LowestPay){
							LowestPay = Pay;
							// System.out.println(Pay);
						}
						Pay -= Math.sqrt(mid) * CityB[6];
					}
					Pay -= Math.sqrt(mid) * CityA[6];
				}
			}
		}
		System.out.println(String.format("%.2f", LowestPay));
	}	
}