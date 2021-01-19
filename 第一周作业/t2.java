
public class t2{
	public static void main(String[] args){
		int candles = 0;
		int age_now = 4;  
		int age_start = 2;

		for(;age_now < 100; age_now ++, age_start = 2){
			for(;age_start < age_now; age_start ++){
				candles = (age_now + age_start)*(age_now - age_start + 1) / 2;
				if(candles == 236)
					break;
			}
			if(candles == 236)
				break;
		}


		System.out.println("开始举办Party的生日年龄: " + age_start);
		System.out.println("今年已经: " + age_now + "岁了");
	}
}