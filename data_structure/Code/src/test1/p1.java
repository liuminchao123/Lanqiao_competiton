import java.util.*;


public class p1{
	static Node []A = null;
	public static void main(String args[]) 
	{
		Scanner in = new Scanner(System.in);
		// 一个比较类   待补充
		Comparator<Node> cmp = new Comparator<Node>() {
			public int compare(Node a, Node b) { //这里是小根堆
				if (a.key == b.key) return a.sec - b.sec; //第二键值做参考 第二优先值
				return a.key - b.key; //第一键值做参考 第一优先值
			}
		};
		Queue<Node> pq = new PriorityQueue<>(cmp);
		int n = in.nextInt();
		A = new Node [n];
		for (int i = 0; i < n; i++) {
			A[i] = new Node();
			A[i].key = in.nextInt();
			A[i].sec = in.nextInt();
			pq.add(A[i]);
		}
		while (!pq.isEmpty()) {
			System.out.println(pq.element().key + " " + pq.element().sec);
			pq.poll();
		}
	}
}

class Node 
{
	public int key;
	public int sec;
}