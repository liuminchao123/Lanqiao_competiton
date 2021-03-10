import java.util.Scanner;

public class p17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		String str4 = sc.next();
		String str5 = sc.next();

		int lengths = str1.length();
		String longest = "";
		if(str2.length() > lengths){
			longest = str2;
			lengths = str2.length();
		}
		if(str3.length() > lengths){
			longest = str3;
			lengths = str3.length();	
		}
		if(str4.length() > lengths){
			longest = str4;
			lengths = str4.length();
		}
		if(str5.length() > lengths){
			longest = str5;
			lengths = str5.length();
		}
		System.out.println(longest);
	}
}
