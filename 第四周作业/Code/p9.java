import java.util.Scanner;

public class p9 {
    public static void tpow(int n){

        if(n==1){
            System.out.print("2(0)");
            return;
        }
        if(n==2){
            System.out.print("2");
            return;
        }
        int temp=1;//2的幂次计算结果
        int c=0;//2的幂次
        while(temp<n){
            temp*=2;
            c++;
        }
        c-=1;
        if(n==temp/2){
            System.out.print("2(");
            tpow(c);
            System.out.print(")");
        }
        else 
        {
            if(temp/2==2){
                System.out.print("2");
                System.out.print("+");
                tpow(n-temp/2);

            }
            else {
                System.out.print("2(");
                tpow(c);
                System.out.print(")+");
                tpow(n-temp/2);
            }
        }

    }

    public static void main(String[] args) {
        // System.out.println("请输入您想要转化的数值：（正整数哦）");
        Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();
        // System.out.println("转化结果为：");
        tpow(input);

    }
}
