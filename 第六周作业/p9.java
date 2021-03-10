

public class p9{
	public static void main(String[] args){
		printer();
	}

	// 打印输出
	static void printer(){
		for(int i = 1; i < 10; i ++){
			for(int j = 1; j <= i; j ++){
				System.out.print(i + "*" + j + "=" + i*j + " ");
			}
			System.out.println();
		}
	}
}