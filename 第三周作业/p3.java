import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p3 {
	static int n; //迷宫的行数
	static int m; //迷宫的列数
	static char[][] grash; 	//迷宫地图
	static char[][] visite;	//表记访问过的位置
	static Queue<Node> q = new LinkedList<Node>();	//用存储广度搜索
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		grash = new char[n][m];
		visite = new char[n][m];
		//读取地图信息
		for(int i=0; i<n; i++){
			String temp = scanner.next();
			grash[i] = temp.toCharArray();
		}
		visite = grash;		
		
		Bfs();
		
	}

	//广度收搜
	private static void Bfs() {
		q.add(new Node(0,0,0,'S',null));  //将人口位置加入队列
		while(!q.isEmpty()){
			Node node = q.poll(); //将对首的节点弹出
			int i = node.x;
			int j = node.y;
			int d = node.depth;
			//判断是否到达终点
			if(i==n-1 && j==m-1){
				System.out.println(d);
				print(node);  //打印路径
				break;
			}
			// 请注意在字典序中D<L<R<U 也就是说：顺序应该是下，左，右，上
			//向下走, 判断是否出界， 是否走过， 是否能走
			if(i+1<grash.length && visite[i+1][j]!='1' && grash[i+1][j]!='1'){
				q.add(new Node(i+1, j, d+1, 'D', node));
				visite[i+1][j] = '1';
			}
			//向左走
			if(j-1>=0 && visite[i][j-1]!='1' && grash[i][j-1]!='1'){
				q.add(new Node(i, j-1, d+1, 'L', node));
				visite[i][j-1] = '1';
			}
			//向右走
			if(j+1<grash[0].length && visite[i][j+1]!='1' && grash[i][j+1]!='1'){
				q.add(new Node(i, j+1, d+1, 'R', node));
				visite[i][j+1] = '1';
			}
			//向上走
			if(i-1>=0 && visite[i-1][j]!='1' && grash[i-1][j]!='1'){
				q.add(new Node(i-1, j, d+1, 'U', node));
				visite[i-1][j] = '1';
			}
		}
	}

	//打印路径
	private static void print(Node node) {
		StringBuilder sb = new StringBuilder();
		sb.append(node.direction);
		Node temp = node.pre;
		while(temp.pre!=null){  //因为开始节点是没有方向记录的，所以不需要打印开始节点的方向
			sb.append(temp.direction);
			temp = temp.pre;
		}
		sb = sb.reverse();  //将字符串翻转，因为存储的时候是反向存储的
		System.out.println(sb.toString());
	}
}

class Node{
	int x;
	int y;
	int depth; //表示走到这个节点需要几步
	char direction;	//用于记录路径，表示上一个节点时从那一个方向走到这个节点的
	Node pre;  //表示上一个节点，即是从那一个节点走到这个节点的
	
	public Node() {
	}
	
	public Node(int x, int y, int depth) {
		super();
		this.x = x;
		this.y = y;
		this.depth = depth;
	}
	
	public Node(int x, int y, int depth, char direction, Node pre) {
		super();
		this.x = x;
		this.y = y;
		this.depth = depth;
		this.direction = direction;
		this.pre = pre;
	}
}
