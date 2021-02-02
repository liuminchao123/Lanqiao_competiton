import java.util.Scanner;

import static java.lang.Math.log10;

public class p7{
    /**
     * 55 麦森数
     */
    private static int[] a = new int[110];
    private static int max = 100000;

    public static void main(String[] args) {

        int p, r, i, j, temp, pos, left;
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        System.out.println((int) (p * (log10(2)) + 1));
        pos = 1;
        a[0] = 1;
        left = p % 10;
        p /= 10;
        for (i = 1; i <= p; i++) {
            //遍历p次  2的10次方
            r = 0;
            for (j = 0; j < pos; j++) {
                temp = a[j] * 1024 + r;
                a[j] = temp % max;
                r = temp / max;
            }
            while (r > 0) {
                //只需要遍历500位的，这里一个索引位置是5位，所以是100
                if (j == 100)
                    break;
                a[j++] = r % max;
                r /= max;
            }
            pos = j;
        }
        for (i = 1; i <= left; i++) {
            //p不是10的整数倍数，将剩余的依次遍历
            r = 0;
            for (j = 0; j < pos; j++) {
                temp = a[j] * 2 + r;
                a[j] = temp % max;
                r = temp / max;
            }
            while (r > 0) {
                if (j == 100)
                    break;
                a[j++] = r % max;
                r /= max;
            }
            pos = j;
        }
        a[0] -= 1;//最后的-1操作
        for (i = 99; i >= 0; i--) {
            System.out.printf("%05d", a[i]);
            if ((100 - i) % 10 == 0)
                System.out.println();
        }
    }
}





