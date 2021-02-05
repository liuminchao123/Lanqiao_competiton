
public class p19 {
	// 遍历所有情况
	public static void fun(String s) {
		char[] c = s.toCharArray();
		StringBuffer sb = new StringBuffer();	// 记录 组成的式子
		int len = s.length()-1;	// 字符串长度 - 1	
		int[] sign = new int[len];	// sign用来标记符号, 最多有（s的长度-1）个符号
		// 从后身前添加符号
		while(sign[0]<3){	// 最前面的判定符号的值若 >=3 则结束循环	
			sb.append(c[0]);	// 添加首元素
			for(int i=0;i<len;i++){
				if(sign[i]==1){		// 值为1添加"+"号
					sb.append("+");
				}else if(sign[i]==2){// 值为2添加"-"号
					sb.append("-");
				}
				sb.append(c[i+1]);	// 不管添加不添加+-号，都添加后一个元素
			}
			
			check(sb.toString());	// 验证并输出
			
			sb.setLength(0);	// 清空sb
			sign[len-1]++;	// 每循环一次，最后一个符号值加1
			for(int i=len-1;i>0;i--){	//当值等于3时，实现逢3进位
				if(sign[i]==3){
					sign[i] = 0;	// sign[i] 归零
					sign[i-1]++;	// sign[i-1]进位
				}
			}
		}
	}
	// 验证并输出
	public static void check(String str){
		String[] s = str.split("[\\+]|[-]");	// 得到全部数字
		String sign = str.replaceAll("\\d*", "");	// 得到全部符号（+-）
		int sum = Integer.parseInt(s[0]);	// 把第一个数字给sum
		for(int i=0;i<s.length-1;i++){
			switch(sign.charAt(i)){
				case '+': 
					sum += Integer.parseInt(s[i+1]);
					break;
				case '-': 
					sum -= Integer.parseInt(s[i+1]);
					break;
			}
		}
		if(sum==110){	// 符合条件输出
			System.out.println(str);
		}
	}
	// 主函数
	public static void main(String[] args){
		String s = "123456789";
		fun(s);
	}
}