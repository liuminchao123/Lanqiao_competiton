
class Main{
	public static void main(String[] args){
		int x, y;
		int father_age = 0;
		int son_age = 0;

		for(x = 2; x <= 9; x ++)
			for(y = 0; y <= 9; y ++){
				father_age = x*10 + y;
				son_age = y*10 + x;
				if(father_age - son_age == 27)
					System.out.println("网友可能的年龄是：" + father_age);
			}
	}
}