import java.util.Scanner;
import java.util.HashMap;
 
public class p8 {
	@SuppressWarnings("serial")
	static HashMap<Character,Integer> Map = 
		new HashMap<Character,Integer>(){
			{
				put('I',1);
				put('V',5);
				put('X',10);
				put('L',50);
				put('C',100);
				put('D',500);
				put('M',1000);
			}
		};
	public static int format(String s){
		int sum = 0;	// 总和
		int i=0;
		while(i<s.length()){
			int a = Map.get(s.charAt(i));
			int b ;
			if(i+1<s.length()){
				b = Map.get(s.charAt(i+1));
			}else{
				b = 0;
			}
			if(a<b){
				sum += b - a;
				i += 2;
			}else{
				sum += a;
				i++;
			}
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		// System.out.println("输入整数n,表示接下来有n个罗马数字(n<100)");
		int n = scan.nextInt();
		String[] s = new String[n];
		scan.nextLine();
		for(int i=0;i<n;i++){	// 输入数据
			s[i] = scan.nextLine();
		}
		for(int i=0;i<s.length;i++){	// 格式化并输出
			System.out.println(format(s[i]));
		}
	}
}