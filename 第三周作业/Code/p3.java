import java.util.Scanner;

public class p3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		// 读取长和宽
		int n = scanner.nextInt();
		int m = scanner.nextInt();	
		// System.out.println("n=" + n + "," + "m=" + m);
		// 读取迷宫图案 抽象成二维数组
		int[][] Maze = new int[n][m];
		String[] MazeN = new String[n];

		for(int i = 0;i < n; i ++){
			MazeN[i] = scanner.nextLine();
			char[] CharMazeN = MazeN[i].toCharArray();
			// for(int j = 0; j < m; j ++){
			// 	Maze[i][j] = CharMazeN[j] - '0';
				// System.out.print(Maze[i][j] + ",");
			}
			// System.out.println();
		// }
		// for(int k = 1; k < 3; k ++){
		// 	for(int h =1; h < 3; h ++)
		// 		System.out.print(Maze[k][h] + ",");
		// 	System.out.println();
		// }

		// // 走迷宫
		// int Steps = 0;
		// String StepsRiddle = "";
		// go_maze(Maze, 0, 0, StepsRiddle, Steps);
	}

	// 走迷宫   x,y 为起始点
	static void go_maze(int[][] Arrays, int x, int y, String StepsRiddle, int Steps){
		// 递归终止条件 走到终点
		if(x+1 == Arrays.length && y+1 == Arrays[0].length){
			System.out.println(Steps);
			System.out.println(StepsRiddle);
		}

		// 左右先判断右  上下先判断下
		// 判断右
		if(Arrays[x+1][y] == 0){
			Arrays[x][y] = 1;
			StepsRiddle = StepsRiddle + "R";
			System.out.println(Steps);
			System.out.println(StepsRiddle);
			go_maze(Arrays, x+1, y, StepsRiddle, ++Steps);
		}
		// 判断下
		if(Arrays[x][y+1] == 0){
			Arrays[x][y] = 1;
			StepsRiddle = StepsRiddle + "D";
			System.out.println(Steps);
			System.out.println(StepsRiddle);			
			go_maze(Arrays, x, y+1, StepsRiddle, ++Steps);
		}
		// 判断左
		// 判断上
	}
}