
import java.util.Scanner;

public class p16{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	  int count=0;
	  int n=input.nextInt();
	  boolean[] arr=new boolean[n+1];
	  for(int i=1;i<arr.length;i++){
	   arr[i]=true;
	  }
	  arr[0]=false;
	  arr[1]=false;
	  for(int i=2;i<arr.length;i++){
	   for(int j=2;i*j<arr.length;j++){
	    arr[i*j]=false;
	   }
	  }
	  for(int i=2;i<arr.length;i++){
	   if(arr[i]==true&&arr[i-2]==true){
	   count++;
	   }
	  }
	  System.out.println(count);
	 }

	}
