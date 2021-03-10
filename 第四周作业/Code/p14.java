import java.util.Scanner;
 
public class p14{
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        for(int i = 10000;i<=99999;i++){
        	if(HuiWen(i)){
        		if(Fadd(i)==a){
        			count++;
        			System.out.println(i);
        		}
        	}
        }
        for(int i = 100000;i<=999999;i++){
        	if(HuiWen(i)){
        		if(Sadd(i)==a){
        			count++;
        			System.out.println(i);
        		}
        	}
        }
        if(count==0){
        	System.out.println(-1);
        }
        
	}
	
	//判断回文
   public static boolean HuiWen(int a){
	   boolean flag = true;
	   String str = String.valueOf(a);
	   for(int i=0;i<=str.length()/2;i++){
		   if(str.charAt(i)!=str.charAt(str.length()-1-i)){
			   flag = false;
		   }
	   }
	   return flag;
   }
   //对五位的数字进行相加操作
   public static int Fadd(int n){
	   int sum =0;
	   int b1 = n%100000/10000;
	   int b2 = n%10000/1000;
	   int b3 = n%1000/100;
	   int b4 = n%100/10;
	   int b5 = n%10;
	   sum = b1+b2+b3+b4+b5;
	   return sum;
   }
   
   //对六位的数字进行相加操作
   public static int Sadd(int n){
	   int sum =0;
	   int b0 = n%1000000/100000;
	   int b1 = n%100000/10000;
	   int b2 = n%10000/1000;
	   int b3 = n%1000/100;
	   int b4 = n%100/10;
	   int b5 = n%10;
	   sum = b0+b1+b2+b3+b4+b5;
	   return sum;
   }
}