import java.util.Scanner;

public class B2 {
    /**
     * 輸入一個非負整數 n，呼叫 test() 判斷並印出 n 是不是質數。
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
        System.out.printf("n=%d",n);
        sc.close();
        OK = test(n);
       if(OK == true){
            System.out.println("是質數");
        }
        else{
            System.out.println("不是質數");
        }

    }
    /**
     * 判斷 n 是否為質數：從 2 試除到 n/2，只要能整除就不是質數。
     * 回傳 true 表示是質數，false 表示不是。
     * ※ 注意：方法宣告成 void 卻 return 布林值，無法編譯，要改成 public static boolean test(int n)。
     */
    public static void test(int n){
        boolean OK = true;
        for(int i  =  2 ; i <= n/2 ; i++){
            if(n % i == 0){
                OK = false;
                break;
            }

        }
        return OK;
    }
}
