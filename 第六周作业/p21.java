
import java.util.*;
public class p21{
    final static int len=200;
    final static int K=40;
    static int p,k,n;
    static String s;
    static HashSet set=new HashSet();
    static int a[][]=new int[len+10][K+10];//将一个字符串分成多分，其中相匹配的单词数量
    static int b[]=new int[len+10];//字符串匹配，最小的数组位置
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        p=sc.nextInt();
        k=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        sb.append(" ");
        for (int i = 1; i <= p; i++) {
            String temp=sc.next();
            sb.append(temp);
        }
        s=sb.toString();
        n=s.length()-1;
        p=sc.nextInt();
        for (int i = 1; i <= p; i++) {
            String temp=sc.next();
            set.add(temp);
        }
        for (int i = 1; i <= n; i++) {
            sb=new StringBuilder();
            b[i]=10000000;
            for (int j = i; j <= n; j++) {
                sb.append(s.charAt(j));
                if(set.contains(sb.toString())){
                    b[i]=j;
                    break;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i-1; j++) {//i前
                int cost=get(j+1,i);
                for (int l = 0; l <=Math.min(j,k) ; l++) {
                    a[i][l+1]=Math.max(a[i][l+1],a[j][l]+cost);
                }
            }
        }
        System.out.println(a[n][k]);
    }
    public static int get(int x,int y){//返回[x,y]中字典中的字符串的数量
        int ans=0;
        for (int i = x; i <=y ; i++) {
            if(b[i]<=y) ans++;//如果有，则数量加一
        }
        return ans;
    }
}
