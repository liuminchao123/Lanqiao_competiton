
public class p1{

	public static void main(String[] args){

		int[] thief = {0, 0, 0, 0};  // 先假定都不为小偷  1为小偷

		for(int i = 0; i < 4; i ++){
			thief[i] = 1; // 假设小偷
			if (i > 0) thief[i-1] = 0;  // 复原

			// 判断甲的话
			if( (thief[1] == 0 && thief[3] == 1) || (thief[1] != 0 && thief[3] != 1) );
			else continue;

			// 判断乙的话
			if( (thief[1] == 0 && thief[2] == 1) || (thief[1] != 0 && thief[2] != 1) );
			else continue;

			// 判断丁的话
			if( (thief[0] == 0 && thief[1] == 1) || (thief[0] != 0 && thief[1] != 1) );
			else continue;

			// 丁成立条件单一, 无需判断

			System.out.print((char)(65 + i)); // 打印小偷名字
			break; // 保证只有一个小偷
		}
	}
}