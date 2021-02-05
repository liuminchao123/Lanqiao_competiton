import java.util.Scanner;

class TreeNode{
    int max;
    int sum;
}

public class p18 {

    //创建树，并且赋最小值
    public static void buildTree(int[] arr,TreeNode[] segTree,int node,int begin,int end) {
        if(begin == end) {
            segTree[node].max = arr[begin];//只有一个元素，节点记录该单元素
            segTree[node].sum = arr[begin];
        }else {
            //递归构造左右子树
            buildTree(arr,segTree,2 * node, begin ,(begin + end) / 2);
            buildTree(arr,segTree,2 * node + 1,(begin + end) / 2 + 1,end);
            //回溯时得到当前node结点的线段信(最大值)
            if(segTree[2 * node].max >= segTree[2 * node + 1].max) {
                segTree[node].max = segTree[2 * node].max;
            }else {
                segTree[node].max = segTree[2 * node + 1].max;
            }
            //回溯得到当前node结点的线段信息(和)
            segTree[node].sum = segTree[2 * node].sum + segTree[2 * node + 1].sum;
        }
    }

    //查询区间最大值
    public static int queryMax(TreeNode[] segTree,int node,int begin,int end,int left,int right) {
        int p1,p2;
        //查询区间和要求的区间有没有交集
        if(left > end || right < begin) {
            return -1;
        }
        if(begin >= left && end <= right)
            return segTree[node].max;

        p1 = queryMax(segTree,2 * node,begin,(begin + end) / 2,left,right);
        p2 = queryMax(segTree,2 * node + 1,(begin + end) / 2 + 1,end,left,right);
//      System.out.println(p1+"  "+p2);
        if(p1 == -1)
            return p2;
        if(p2 == -1)  
            return p1;
        if(p1 >= p2)
            return p1;
        return p2;
    }   

    //查询区间最大值
    public static int querySum(TreeNode[] segTree,int node,int begin,int end,int left,int right) {
        int p1,p2;
        //查询区间和要求的区间有没有交集
        if(left > end || right < begin) {
            return -1;
        }
        if(begin >= left && end <= right)
            return segTree[node].sum;
        p1 = querySum(segTree,2 * node,begin,(begin + end) / 2,left,right);
        p2 = querySum(segTree,2 * node + 1,(begin + end) / 2 + 1,end,left,right);
        if(p1 == -1)
            return p2;
        if(p2 == -1)  
            return p1;
        if(p1 != -1 && p2 != -1)
            return p1 + p2;
        return p2;
    }

    public static void choice1(int[] arr,TreeNode[] segTree,int i,int newNum) {
        arr[i] = newNum;
        buildTree(arr,segTree,1,0,arr.length - 1);   
    }

    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int m = sc.nextInt();
          int[] arr = new int[n];
          TreeNode[] segTree = new TreeNode[n * 4 + 10];
          for(int i = 0;i < segTree.length;i++) {
              segTree[i] = new TreeNode();
          }
          for(int i = 0;i < n;i ++) {
              arr[i] = sc.nextInt();
          }
          buildTree(arr,segTree,1,0,n - 1);   
          while(m > 0) {
              int choice = sc.nextInt();
              if(choice == 1) {
                    int i = sc.nextInt();
                    int newNum = sc.nextInt();
                    choice1(arr,segTree,i - 1,newNum);
              }else if(choice == 2) {
                    int left = sc.nextInt();
                    int right = sc.nextInt();
                    System.out.println(querySum(segTree,1,0,n - 1,left - 1,right -1)); 
              }else if(choice == 3) {
                    int left = sc.nextInt();
                    int right = sc.nextInt();
                    System.out.println(queryMax(segTree,1,0,n - 1,left - 1,right - 1)); 
              }  
              m --;
          }
    }
}