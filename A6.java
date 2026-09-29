import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        int n ;
        n = input();
        rank(n); // 參數傳遞rank(n)
    }

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

    public static void rank(int n){
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
