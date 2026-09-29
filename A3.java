import java.util.Scanner;

public class A3 {
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
