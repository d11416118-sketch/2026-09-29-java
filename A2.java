import java.util.Scanner;

public class A2 {
    /**
     * 輸入 0~100 的整數，用 while 迴圈檢查範圍，不在範圍內就要求重新輸入。
     * ※ 注意：條件 !(n >= 0) && (n <= 100) 只擋得住負數，輸入大於 100 的數會直接通過。
     */
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