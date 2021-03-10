import java.util.Scanner;


public class p13{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int arr[]=new int[m];
		for (int i = 0; i <m; i++) {			
				arr[i]=sc.nextInt();
		}
		for (int i = 0; i <m; i++) {
			int a = arr[i];
			if(a>=0&&a<86400){  //判断条件，判断是否超出了可以表示的时间格式
			int b=0,c=0;   //定义两个变量，并且每次循环回到这里b、c的值都归零
			    b = a; //把a赋值给b
			    b = b%60;  //取模，也就是时间格式中的 “秒数” 位
			    a=a/60;  //时间格式中的 “分数” 位
			    if(a>=60){  //如果“分数”位大于等于60则需要进位
			    	c = a;  //把a赋值给c
			    	a=a%60;   //取模，也就是时间格式中的 “分数” 位，因为前面那个“分数”位大于等于60，不符合格式，需要重新定
			    	c=c/60;  //“小时”位
			    	
			    }   
			    //下面这些都是条件，分8种情况，大于10小于10目的是保证格式的完整性
			    	 if (a>=10&&b<10&&c<10) {  
			    		System.out.println("0"+c+":"+a+":0"+b);
					}
			    	else if (a>=10&&b<10&&c>=10) {       
			    		System.out.println(c+":"+a+":0"+b);
					}
			    	else if (a>=10&&b>=10&&c<10) {
			    		System.out.println("0"+c+":"+a+":"+b);
					}
			    	else if (a>=10&&b>=10&&c>=10) {
			    		System.out.println(c+":"+a+":"+b);
					}
			    	else if (a<10&&b>=10&&c>=10) {
			    		System.out.println(c+":0"+a+":"+b);
					}
			    	else if (a<10&&b>=10&&c<10) {
			    		System.out.println("0"+c+":0"+a+":"+b);
					}
			    	else if (a<10&&b<10&&c>=10) {
			    		System.out.println(c+":0"+a+":0"+b);
					}
			    	else if (a<10&&b<10&&c<10) {
			    		System.out.println("0"+c+":0"+a+":0"+b);
					}
			}
		}	
	}

}

