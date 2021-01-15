
class Main{
	public static void main(String[] args){
		int x = 1;
		int y = 0;
		int sum = 0;

		for(; x <= 100; x ++){
			y = x * x / 2 + x / 2;
			sum = sum + y;
		}
		System.out.println("100层有煤球 " + sum + "个");
	}
}