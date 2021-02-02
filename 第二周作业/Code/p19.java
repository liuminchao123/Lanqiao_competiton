
public class p19 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10000; i <= 99999; i++) {
            if (passFour2(i))
                count++;
        }
        System.out.println(count);
    }
 
    // /**
    //  * 自己想的方案（非回溯）
    //  *
    //  * @param num
    //  * @return
    //  */
    // public static boolean passFour1(int num) {
    //     if (num % 10 != 4)
    //         if ((num / 10) % 10 != 4)
    //             if ((num / 100) % 10 != 4)
    //                 if ((num / 1000) % 10 != 4)
    //                     if ((num / 10000) % 10 != 4) {
    //                         System.out.println(num);
    //                         return true;
    //                     }
    //     return false;
 
    // }
 
    /**
     * 回溯法
     * @param num
     * @return
     */
    public static boolean passFour2(int num) {
        while (num > 0) {
            if (num % 10 == 4) return false;
            num/=10;
        }
        return true;
 
    }
 
    // /**
    //  * 利用字符串的截取
    //  * @param num
    //  * @return
    //  */
    // public static boolean passFour3(int num) {
    //     String strNum = String.valueOf(num);
    //     char[] charNum = strNum.toCharArray();
    //     for (int i = 0; i < charNum.length; i++) {
    //         int numItem = charNum[i]-'0';//每一位的数字
    //         if(numItem==4)
    //             return false;
    //     }
    //     return true;
 
    // }
 
 
 
 
}