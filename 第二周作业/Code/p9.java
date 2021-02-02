import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
public class p9{

	static Set set=new HashSet<>();
	static void fun(char a[],int k){
		if(k==a.length){
			test(a);
			return;
		}
		for(int i=k;i<a.length;i++){
			{char c=a[k];
			a[k]=a[i];
			a[i]=c;}
			
			fun(a,k+1);
			
			{char c=a[k];
			a[k]=a[i];
			a[i]=c;}
			
		}
	}
	private static void test(char[] a) {
		String s=new String(a);
		//此处是我没有想到的，lastindexof和indexof我本以为没有用啊，现在发现好有用哈哈哈哈哈
		if(s.lastIndexOf('A')-s.indexOf('A')!=2){
			return;
		}
		if(s.lastIndexOf('2')-s.indexOf('2')!=3){
			return;
		}
		if(s.lastIndexOf('3')-s.indexOf('3')!=4){
			return;
		}
		if(s.lastIndexOf('4')-s.indexOf('4')!=5){
			return;
		}
		set.add(s);
	}
	public static void main(String[] args) {
		char arr[]="AA223344".toCharArray();
		fun(arr,0);
		System.out.println(set);
	}
 
}