
public class p17{
	static int a=2;
    static int count = 0;
    
    public static void fun(int m,int n,int a,int i)
    {
        if(n<0 ||m<0)
            return;
        if(i == 14)
        {
            if(a == 1)
                count++;
            return;
        }
        
        for(int ii=0;ii<=1;ii++)
        {
            if(ii==0)
            {
                fun(m, n-1, a-1, i+1);
            }
            else {
                fun(m-1, n, a*2, i+1);
            }
        }
        
    }
    public static void main(String[] args)
    {
        fun(5, 9, 2,0);
        System.out.print(count);

    }

}
