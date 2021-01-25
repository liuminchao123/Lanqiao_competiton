
public class t1{
	public static void main(String[] args){
		float x = 1;
		float y = 0;
		float sum = 0;

		for(; x <= 100; x ++){
			y = x * x / 2 + x / 2;
			sum = sum + y;
		}
		System.out.println("100层有煤球 " + sum + "个");
	}
}