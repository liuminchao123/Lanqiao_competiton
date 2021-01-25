import java.util.Scanner;

public class p10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		char []arr=new char[26];
		String str="";

		for(int i=0;i<26;i++)
			arr[i]=(char)(65+i);			

		for(int j=0;j<n;j++)
			str=str+arr[j]+str;
	
		System.out.println(str);
	}
}
