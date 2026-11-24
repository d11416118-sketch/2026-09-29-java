import java.util.Scanner;

public class A5 {
    /**
     * 主程式：呼叫 input() 取得分數，再依分數判斷並印出成績等第。
     */
    public static void main(String[] args) {
        int n ;
        n = input();
        // 函數
        

       if(n>=80 && n<=100){
            System.out.println("A,你簡直天才");
        }
        else if(n>=70 && n<80){
            System.out.println("B,至少努力");
        }
        else if(n>=60 && n<70){
            System.out.println("C,運氣不錯");
        }
        
        else{
            System.out.println("D,明年見");
        }

       
    }

    /**
     * 讀入一個 0~100 的整數；超出範圍會顯示「輸入錯誤」並要求重新輸入。
     * 印出輸入的數字後，回傳該數值。
     */
    public static int input(){
         Scanner sc = new Scanner(System.in);
        int n , count = 0;
        do {
            if(count > 0)System.out.println("輸入錯誤");

                System.out.print("輸入整數 0~100 :\n");
                n = sc.nextInt();
                count++;

       }while(!((n >= 0 ) && (n <= 100)));     
       
       System.out.printf("n=%d\n",n);
       return n;
    }

    


}
