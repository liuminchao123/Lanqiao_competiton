import java.util.Scanner;

public class p15{
	public static void bianli(String s1,String s2) {
		if (s1.length() == 0 && s2.length() == 0) {
			return;
		} else {
			int length = s2.length();
			String ls = s2.substring(s2.length() - 1);
			s3 += ls;
			int size = s1.indexOf(ls);

			if (size > 0) {
				bianli(s1.substring(0, size), s2.substring(0, size));
			}
			if (length > 1) {
			bianli(s1.substring(size + 1, length), s2.substring(size, length - 1));
			}
		}
	}

	public static String s3="";

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		bianli(s1,s2);
		System.out.println(s3);
	}
}