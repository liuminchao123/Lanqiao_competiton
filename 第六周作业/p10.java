import java.util.*;
    public class p10{
    	static int base;
    	static char[] lis = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    	static void xx(int num) {
    		if(num == 0)
    			return;
    		int yu = num%base;
    		int s = num/base;
    		if(yu < 0) {
    		yu -=base;
    		s++;
    		}
    		xx(s);
    		// System.out.print(lis[yu]);
    
    	}
    	public static void main(String args[]) {
    		
    		Scanner input = new Scanner(System.in);
    		int num = input.nextInt();
    		base = input.nextInt();
    		System.out.print(num+"=");
    		xx(num);
    		System.out.print((str)s + "(base"+base+")");
    	}
    }
