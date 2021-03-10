// 六角幻方
 // 每一行的和应该是38 (1到19的和是190，190/5=38)
import java.util.*;
public class p12 {

    public static boolean[] vis = new boolean[20];
    public static int[] a = new int[20];

    public static void dfs(int x) {
        // 剪枝
        if (x == 8) {
            if (a[4] + a[5] + a[6] + a[7] != 38)
                return;
        }
        if (x == 9) {
            if (15 + a[4] + a[8] != 38)
                return;
        }
        if (x == 13) {
            if (a[8] + a[9] + a[10] + a[11] + a[12] != 38)
               return;
            if (a[3] + a[7] + a[12] != 38)
                return;
        }
        if (x == 14) {
            if (38 != 13 + a[5] + a[9] + a[13])
                return;
        }
        if (x == 17) {
            if (13 + a[6] + a[11] + a[16] != 38 || a[13] + a[14] + a[15] + a[16] != 38)
                return;
        }
        if (x == 18) {
            if (a[3] + a[6] + a[10] + a[14] + a[17] != 38 || a[8] + a[13] + a[17] != 38)
                return;
        }
        if (x == 19) {
            if (a[7] + a[11] + a[15] + a[18] != 38 || a[4] + a[9] + a[14] + a[18] != 38)
                return;
        }
        if (x == 20) {
            // 最后出口
            if (a[17] + a[18] + a[19] == 38) {
                System.out.println(a[8] + " " + a[9] + " " + a[10] + " " + a[11] + " " + a[12]);
                // answer: 9 6 5 2 16
                return;
            }
        }
        for (int i = 1; i < 20; i++) {
            if (!vis[i]) {
                vis[i] = true;
                a[x] = i;
                dfs(x + 1);
                vis[i] = false;
            }
        }
    }

    public static void main(String[] args) {

        a[1] = 15;
        a[2] = 13;
        a[3] = 10;
        vis[15] = vis[13] = vis[10] = true;
        dfs(4);

    }

}