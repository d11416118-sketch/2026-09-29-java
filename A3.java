import java.util.Scanner;

public class A3 {
    /**
     * 用 do-while 讀入 0~100 的整數：至少先讀一次，
     * 第二次以後代表上一次輸入錯誤，會先印「輸入錯誤」再重新輸入，最後印出結果。
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n , count = 0;
        do {
            if(count > 0)System.out.println("輸入錯誤");

                System.out.print("輸入整數 0~100 :\n");
                n = sc.nextInt();
                count++;

       }while(!((n >= 0 ) && (n <= 100)));     
       
       System.out.printf("n=%d",n);


    }
}
