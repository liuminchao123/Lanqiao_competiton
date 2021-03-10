
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
 
public class p17 {
 
	private static int targ, Va, Vb, Vc;
	private static ArrayList<String> proce = new ArrayList<String>();
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
 
		String data[] = sc.nextLine().split("\\,");
		sc.close();
 
		Va = Integer.parseInt(data[0]);
		Vb = Integer.parseInt(data[1]);
		Vc = Integer.parseInt(data[2]);
		int Wone = Integer.parseInt(data[3]);
		int Wtwo = Integer.parseInt(data[4]);
		int Wthree = Integer.parseInt(data[5]);
		targ = Integer.parseInt(data[6]);
 
		if (Wone + Wtwo + Wthree < targ)
			System.out.println("不可能");
		else
			search(Wone, Wtwo, Wthree);
	}
 
	private static void search(int a, int b, int c) {
 
		String p = a + "," + b + "," + c;
 
		// 判断集合里是有过p这个过程，如果有那就说明会一直循环下去
		if (proce.contains(p)){
			System.out.println("不可能");
			return;
		}
 
		proce.add(p);// 将过程都存到集合里头
 
		// 分到了targ这个目标值了就输出
		if (check(a, b, c)) {
			for (int i = 0; i < proce.size(); i++)
				System.out.println(proce.get(i));
			return;
		}
 
		if (a != 0 && b == 0)// 优先填补0
			search(a > Vb ? a - Vb + b : 0, a > Vb ? Vb : a, c);
		else {
			if (b != 0 && c == 0)
				search(a, b > Vc ? b - Vc + c : 0, b > Vc ? Vc : b);
			else if (c == Vc)
				search(a + c > Va ? Va : a + c, b, c + a > Va ? c + a - Va : 0);
			else if (b == Vb)
				search(a, b + c > Vc ? b + c - Vc : 0, c + b > Vc ? Vc : c + b);
			else if (a == Va)
				search(a + b > Vb ? a + b - Vb : 0, b + a > Vb ? Vb : b + a, c);
		}
	}
 
	private static boolean check(int a, int b, int c) {
		if (a == targ || b == targ || c == targ)
			return true;
		return false;
	}
}