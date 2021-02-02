
public class p12{
	public static void main(String[] args){
		int ber = 0;

		for(;ber < 35;ber ++){
			// System.out.println("ber = " + ber);
			// System.out.println("ber*23 = " + ber);
			// System.out.println("823 - ber*23 = " + (823 - ber*23));
			// System.out.println("(823 - ber*23)%19 = " + (823 - ber*23)%19);
			// System.out.println("---------------");
			if(((823 - ber*23)%19) == 0){
				System.out.println(ber);
				break;
			}
		}
	}
}
