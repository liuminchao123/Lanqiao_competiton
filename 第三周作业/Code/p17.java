import java.util.*;

public class p17 {
    static int area, local_x, local_y,ans = 0;  //area-棋盘大小; local_x、y-国王坐标
    static int[][] palace;  //棋盘
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        area = sc.nextInt();
        local_x = sc.nextInt();
        local_y = sc.nextInt();
        init();
        doit(1);
        System.out.println(ans);
    }

    public static void init(){
        palace = new int[20][20];
        for(int i=local_x-1;i<=local_x+1;i++)
            for(int j=local_y-1;j<=local_y+1;j++)
                palace[i][j] = 666666;
    }

    public static int judge(int h,int l){
        int i,j;
        for(i = h-1,j = l-1;i>=1 && j>=1;i--,j--){
            if(palace[i][j]==1)
                return 0;
        }
        for(i = h-1,j = l+1;i>=1 && j<=area;j++,i--){
            if(palace[i][j]==1)
                return 0;
        }
        for(i = h-1,j = l;i>=1;i--)
            if(palace[i][j]==1)
                return 0;
        return 1;
    }

    public static void doit(int h){
        if(h>area){
            ans++;
            return;
        }
        for(int i =1;i<=area;i++){
            if(palace[h][i]==666666)
                continue;
            if(judge(h,i)==1){
                palace[h][i] = 1;
                doit(h+1);
                palace[h][i] = 0;
            }
        }
    }
}
