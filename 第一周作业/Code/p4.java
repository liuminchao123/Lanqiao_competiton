
public class p4 {
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		fun(arr,0,11);
	}

	public static void fun(int a[],int s,int n){
		if(s == n){
			if(a[0] == 1&&a[1] == 8&&a[11] == 3){
				if(a[0]+a[2]+a[5]+a[7] ==26&&a[0]+a[3]+a[6]+a[10] ==26&&a[1]+a[5]+a[8]+a[11] ==26&&a[1]+a[2]+a[3]+a[4] ==26&&a[4]+a[6]+a[9]+a[11] ==26&&a[7]+a[8]+a[9]+a[10] ==26){
					System.out.println(a[5]);
				}
			}
		}else{
			for(int i = s;i<=n;i++){   
				int t = a[s];
				a[s] = a[i];
				a[i] = t;
				fun(a,s+1,n);
				t = a[s];
				a[s] = a[i];
				a[i] = t;
			}	
		}
		
	}
 
}