import java.util.Scanner;

public class B3 {
    /**
     * 輸入正整數 n，逐一呼叫 test() 檢查 2~n 的每個數，印出範圍內所有的質數。
     */
    public static void main(String[] args) {
        int n ;
        boolean OK ;
        System.out.println("輸入數字:");
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        while(n < 0 ){
            System.out.print("要大於0 請重新輸入 :\n");
            n = sc.nextInt();
            
        }
        System.out.printf("n=%d\n",n);
        sc.close();
        for(int i=2; i<=n;i++){
                OK = test(i);
                if(OK == true){
                    System.out.printf("%d \t",i);
            }
        }

    }
    /**
     * 判斷 n 是否為質數：從 2 試除到 n/2，只要能整除就不是質數。
     * 回傳 true 表示是質數，false 表示不是。
     */
    public static boolean test(int n){
        boolean OK = true;
        for(int i=2 ; i <= n/2 ; i++){
            if(n % i == 0){
                OK = false;
                break;
            }

        }
        return OK;
    }
}
