import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("輸入整數 0~100 :\n");
        n = sc.nextInt();
        System.out.printf("n=%d",n);

        /* 
        while(n<0 || n>100){
            System.out.print("這不是整數 0~100 重新輸入 :\n");
            n = sc.nextInt();
            System.out.printf("n=%d",n);
        }
        */

        while(!(n >= 0) && (n <= 100)){
            System.out.print("這不是整數 0~100 重新輸入 :\n");
            n = sc.nextInt();
            
        }
        System.out.printf("n=%d",n);


    }
}