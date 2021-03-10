
 
public class p15 {
 
	public static void main(String[] args) {
		int a=0;
		double i=1.0,j=1.0;
		double sum=0;
		while(sum<15.0){
			sum=sum+i/j;
			j++;
			a++;
		}
		System.out.println(a);
	}
}