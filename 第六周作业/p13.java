import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

/*
 */
public class p13{
	
	static int res = -1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		String start = read.nextLine();
		String end = read.nextLine();
		bfs(start,end);
		System.out.println(res);
		read.close();
	}
	public static void bfs(String start,String end)
	{
		Map<String,Integer> map =new HashMap<String,Integer>();//用于保存每一步的结果（主要是在什么状态下最低的步数）
		Queue<String> queue = new LinkedList<String>(); //bfs时用到的队列
		map.put(start, 0);//保存初始的状态
		queue.offer(start);
		
		String str = "";
		int index = 0;
		int[] next = {-3,3,-1,1};//上下左右的结果
		int nextIndex = 0;
		while(res == -1)//这应该都有解的吧
		{
			str = queue.poll();//得到队首的元素
			if(str==null)//无解
			{
				res = -1;
				break;
			}
			index = str.indexOf(".");//找到.的位置
			for(int i=0;i<4;i++)//这里参考了别人的代码，或者直接四个if来判断也是可以的
			{
				nextIndex = index + next[i];//走一步以后.的位置
				//这里是防止出bug,例如index=3(第二行第一个)往左走-1瞬移到第一行第三个
				//后面括号里面的是没有影响的，左右换行（错误）才会影响
				if(!(nextIndex<0||nextIndex>8||(nextIndex%3!=index%3 && nextIndex/3!=index/3)))
				{
					char temp = str.charAt(nextIndex);
					String newStr = str.replace('.', '*');
					newStr = newStr.replace(temp, '.');
					newStr = newStr.replace('*', temp);
					
					if(newStr.equals(end))
					{
						res = map.get(str) +1;//之前不是保存了状态吗？？还有最小步数,加1即可
						//break;
					}
					if(!map.containsKey(newStr)){//这种状态如果没记录，那就记录
						map.put(newStr, map.get(str)+1); 
						queue.add(newStr);
					}
				}
			}
		}
	}

}

