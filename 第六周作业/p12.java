package org.bluebridge.topics;
 
/*参赛约束
 A、B、C、D、E、F、G、H、I、J 共10名学生有可能参加本次计算机竞赛，也可能不参加。
 因为某种原因，他们是否参赛受到下列条件的约束：
 1. 如果A参加，B也参加；
 2. 如果C不参加，D也不参加；
 3. A和C中只能有一个人参加；
 4. B和D中有且仅有一个人参加；
 5. D、E、F、G、H 中至少有2人参加；
 6. C和G或者都参加，或者都不参加；
 7. C、E、G、I中至多只能2人参加   
 8. 如果E参加，那么F和G也都参加。
 9. 如果F参加，G、H就不能参加
 10. 如果I、J都不参加，H必须参加
 请编程根据这些条件判断这10名同学中参赛者名单。如果有多种可能，则输出所有的可能情况。
 每种情况占一行。参赛同学按字母升序排列，用空格分隔。
 比如：
 C D G J*/
 
public class p12 {
 
	public static void main(String[] args) {
 
		// 0:不参加，1:参加
		for (int A = 0; A < 2; A++) {// A
			for (int B = 0; B < 2; B++) {// B
				if (A == 1 && B != 1)// 1. 如果A参加，B也参加；
					continue;
				for (int C = 0; C < 2; C++) {// C
					if (A + C == 2)// 3. A和C中只能有一个人参加；(可以都不参加)
						continue;
					for (int D = 0; D < 2; D++) {// D
						if (C == 0 && D != 0)// 2. 如果C不参加，D也不参加；
							continue;
						if (B + D != 1)// 4. B和D中有且仅有一个人参加；
							continue;
						for (int E = 0; E < 2; E++) {// E
							for (int F = 0; F < 2; F++) {// F
								for (int G = 0; G < 2; G++) {// G
									if(C+G==1)//6. C和G或者都参加，或者都不参加；
										continue;
									if(E ==1 )//8. 如果E参加，那么F和G也都参加。
										if(F + G != 2)
											continue;
									for (int H = 0; H < 2; H++) {// H
										//5. D、E、F、G、H 中至少有2人参加；
										if (D + E + F + G + H < 2)
											continue;
										//9. 如果F参加，G、H就不能参加
										if(F == 1)
											if(G + H != 0)
												continue;
										for (int I = 0; I < 2; I++) {// I
											//7. C、E、G、I中至多只能2人参加
											if(C + E + G + I > 2)
												continue;
											for (int J = 0; J < 2; J++) {// J
												//10. 如果I、J都不参加，H必须参加
												if(I==0 && J==0 && H!=1)
													continue;
												
												int[] result = {A,B,C,D,E,F,G,H,I,J}; 
												for (int k = 0; k < result.length; k++) {
													if(result[k]==1)
														System.out.print((char)(65 + k)+" ");
												}
												System.out.println();
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