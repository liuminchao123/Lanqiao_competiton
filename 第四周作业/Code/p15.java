import java.util.*;

public class p15 {
	public static void main(String[] args) {
		int[] res = {0,0,0,0,0};
		for (int i = 0; i < res.length; i++) {
			res[i] = 1;
			if(boolToInt(res[0] == 0 && res[4] == 0) + boolToInt(res[2] == 1 || res[4] == 1)
			+ boolToInt(res[2] == 1 || res[3] == 1) + boolToInt(res[2] == 0 && res[3] == 0)
			+ boolToInt(res[4] == 0) == 2) {
				System.out.print((char)('A' + i) + " ");
			}
		}
	}
	private static int boolToInt(boolean b){
		if(b)
			return 1;
		else
			return 0;
	}
}

