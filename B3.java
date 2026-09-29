import java.util.Scanner;

public class B3 {
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
