import java.util.Scanner;
 
 
public class p6{
	 public static void main(String[] args){  
	        Scanner input=new Scanner(System.in);  
	        int n=input.nextInt(),q=input.nextInt();
	        int []A=new int[n];
	        for(int i=0;i<n;++i)
	        	A[i]=input.nextInt();
	        for(int i=0;i<q;++i){
	        	int left=input.nextInt(),right=input.nextInt(),k=A[left];
	        	for(int j=left+1;j<=right;++j)
	        		k=Math.min(A[j],k);
	        	System.out.println(k);
	        }
	    }  
 
 
}
 