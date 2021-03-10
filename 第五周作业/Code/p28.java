import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
public class p28 {
	private static char chs[] = new char[27];
	static {
		for (int i = 1; i < chs.length; i++) {
			chs[i] = (char) (96 + i);
		}
	}
	private static int a, b, c;
	private static String tmp = "";
	public static void main(String[] args) throws IOException {
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new
				InputStreamReader(System.in)));
		st.nextToken();
		a = (int) st.nval;
		st.nextToken();b = (int) st.nval;
		st.nextToken();
		c = (int) st.nval;
		st.nextToken();
		String str = st.sval;
		int len = str.length(), count = 0;
		for (int i = len - 1; i >= 0; i--) {
			if (chs[b] - str.charAt(i) >= (len - i)) {
				tmp = str.substring(0, i);
				int index = str.charAt(i) - 95;
				for (int j = i; j < len; j++) {
					tmp += chs[index++];
				}
				if(count==5)
					break;
				if (count < 5)
					System.out.println(tmp);
				count++;
				str = tmp;
				i = len;
			}
		}
	}
}
 