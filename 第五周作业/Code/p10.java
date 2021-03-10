import java.util.Scanner;

public class p10{
	static int[] cards = new int[13];
	static int cardNum = 0;
	static int num = 0;

	public static void main(String[] args){
		num = procession();
		System.out.println(num);
	}

	// 计算组合
	static int procession(){
		for(int a = 0; a < 5; a ++){
			cards[0] = a;
			for(int b = 0; b < 5; b ++){
				cards[1] = b;
				for(int c = 0; c < 5; c ++){
					cards[2] = c;
					for(int d = 0; d < 5; d ++){
						cards[3] = d;
						if(judgement(cards)){
							num ++;
							break;
						}
						for(int e = 0; e < 5; e ++){
							cards[4] = e;
							if(judgement(cards)){
								num ++;
								break;
							}
							for(int f = 0; f < 5; f ++){
								cards[5] = f;
								if(judgement(cards)){
									num ++;
									break;
								}
								for(int g = 0; g < 5; g ++){
									cards[6] = g;
									if(judgement(cards)){
										num ++;
										break;
									}
									for(int h = 0; h < 5; h ++){
										cards[7] = h;
										if(judgement(cards)){
											num ++;
											break;
										}
										for(int i = 0; i < 5; i ++){
											cards[8] = i;
											if(judgement(cards)){
												num ++;
												break;
											}
											for(int j = 0; j < 5; j ++){
												cards[9] = j;
												if(judgement(cards)){
													num ++;
													break;
												}
												for(int k = 0; k < 5; k ++){
													cards[10] = k;
													if(judgement(cards)){
														num ++;
														break;
													}
													for(int l = 0; l < 5; l ++){
														cards[11] = l;
														if(judgement(cards)){
															num ++;
															break;
														}
														for(int m = 0; m < 5; m ++){
															cards[12] = m;
															if(judgement(cards))
																num ++;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return num;													
	}

	// 判断是否满足题意
	static boolean judgement(int[] array){
		for(int n = 0; n < array.length; n ++)
			cardNum += array[n];
		if(cardNum == 13){
			cardNum = 0;
			return true;
		}
		cardNum = 0;
		return false;
	}
}