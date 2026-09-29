import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        int n  ;
        boolean OK = true;
        System.out.println("輸入數字:");
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        while(n < 0 ){
            System.out.print("要大於0 請重新輸入 :\n");
            n = sc.nextInt();
            
        }
        System.out.printf("n=%d",n);
        sc.close();
        for(int i  =  2 ; i <= n/2 ; i++){
            if(n % i == 0){
                OK = false;
                break;
            }


        }
       if(OK == true){
            System.out.println("是質數");
        }
        else{
            System.out.println("不是質數");
        }

    }
}
