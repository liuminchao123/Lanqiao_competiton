public class p19{
	/*
	 * 题目描述
 A 村的元宵节灯会上有一迷题：
        请猜谜 * 请猜谜 = 请边赏灯边猜 
    小明想，一定是每个汉字代表一个数字，不同的汉字代表不同的数字。    
       请你用计算机按小明的思路算一下，然后提交“请猜谜”三个字所代表的整数即可。
    注意：只提交一个3位的整数，不要写其它附加内容，比如：说明性的文字。*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=3;i<=9;i++)
		{
			for(int j=0;j<=9;j++)
			{
				if(i==j)
					continue;
				for(int k=0;k<=9;k++)
				{
					int num = (i*100 + j*10 + k) * (i*100 + j*10 + k);
					if(i==k || j==k || String.valueOf(num).length()!=6)
					{
						continue;
					}
					if(i == String.valueOf(num).charAt(0)-'0' && j==String.valueOf(num).charAt(5)-'0' || String.valueOf(num).charAt(1)==String.valueOf(num).charAt(4)-'0')
					{
						// System.out.println(num +"    "+i+j+k);
						System.out.println(i);
					}
				}
			}
		}
	}

}

