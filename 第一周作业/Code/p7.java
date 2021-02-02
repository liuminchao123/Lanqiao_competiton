public class p7{
	public static void main(String[] args) {
		Fight(0);
		double d = count / 16.0;

		System.out.println(d);
	}

	public static double a=1000.0;
	public static double b=2000.0;
	public static int count=0;

	public static void Fight(int i) {
		double m,n;

		if(i>=4) {
			if(Math.abs(a-b) < 1000) {
				count++;//计数器
				return;
			}

		}
		else {
			m=a;
			n=b;//存数据

			a=a+b/4;
			b=b*3/4;//甲赢
			Fight(i+1);//下一回合
			a=m;
			b=n;
			b=b+a/4;
			a=a*3/4;//乙赢
			Fight(i+1);//下一回合
		}
	}

}

