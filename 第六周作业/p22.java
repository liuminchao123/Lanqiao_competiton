import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author 作者 : Cactus
 * @version 创建时间：2018-3-20 下午09:23:20 
 */
public class p22{
    private static int[][] arr_node = new int[100000][2];// 用于记录每个节点，选1或者不选0，其权值和（该节点和其所有子节点）
    private static int[][] arr_route = new int[100000][100];// 用于记录每个节点的孩子节点
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Arrays.fill(arr_node, 0);
        for(int i = 1; i <= n; i++){
            arr_node[i][1] = sc.nextInt();
        }
        //Arrays.fill(arr_route, 0);
        int start,end,j,k;
        for(int i = 0; i < n - 1; i++){
            start = sc.nextInt();
            end = sc.nextInt();
            j = 0;
            k = 0;
            while(arr_route[start][j] != 0){
                j++;
            }
            arr_route[start][j] = end;
            while(arr_route[end][k] != 0){
                k++;
            }
            arr_route[end][k] = start;

        }
        sc.close();
        //以上为存放相关数据
        dfs(1,0); //动态规划+深度搜索，从创建的数的根节点（即第1个顶点，0表示根节点的父母节点）开始进行DFS遍历
        System.out.println(fmax(arr_node[1][0],arr_node[1][1])); //比较第一个节点，选或不选哪个权值和更大，并输出
    }
    private static void dfs(int x, int f){
        int i,k;
        k = 0;
        while((i = arr_route[x][k]) != 0){ 
            k++;
            if(i != f){   //当前节点！=其父节点，防止出现start的孩子成为start的父亲情况
                dfs(i,x); //深搜
                arr_node[x][1] += arr_node[i][0]; //取x,则加上不取其子节点i的权值和
                arr_node[x][0] += fmax(arr_node[i][0],arr_node[i][1]);// 不取x,则选择取或不取其子节点i的权值和大者
                //状态转移方程
            }
        }
    }
    private static int fmax(int a, int b){
        return a > b ? a : b;
    }
}
