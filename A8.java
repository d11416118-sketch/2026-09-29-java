import java.util.Scanner;

public class A8 {
    static int n ; //這類別的屬性, 裡面的所有函數都可以看到他
     /**
      * 主程式：先呼叫 input() 把分數存進類別變數 n，再呼叫 rank() 判斷等第（不用參數傳遞）。
      */
     public static void main(String[] args) {
        input();
        rank(); 
    }

    /**
     * 讀入一個 0~100 的整數（超出範圍就重新輸入），存到類別的靜態變數 n，不回傳。
     */
    public static void input(){
         Scanner sc = new Scanner(System.in);
        int  count = 0;
        do {
            if(count > 0)System.out.println("輸入錯誤");

                System.out.print("輸入整數 0~100 :\n");
                n = sc.nextInt();
                count++;

       }while(!((n >= 0 ) && (n <= 100)));     
       
       System.out.printf("n=%d\n",n);
      
    }

    /**
     * 直接讀取類別變數 n，印出成績等第（80 以上 A、70~79 B、60~69 C、其餘 D）。
     */
    public static void rank(){
        // 參數傳遞rank(int n)
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
}
