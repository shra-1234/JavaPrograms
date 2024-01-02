import java.util.Scanner;

public class factorial {
    int fact(int n){
        if (n==1){
            return 1;
        }
        else 
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        factorial f1=new factorial();
        int res=f1.fact(n);
        System.out.println("The factorial is "+res);
    }
}
