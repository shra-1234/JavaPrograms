import java.util.*;
public class fibonacciSeries {
    int fibb(int x){
        if(x==0){
            return x;
        }
        if(x<=3){
            return 1;
        }
        else{
            return fibb(x-1)+fibb(x-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of terms you want in Fibonacci series:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        fibonacciSeries fs =new fibonacciSeries();
        System.out.println("The Fibonacci series is :");
        for (int i = 0; i <n ; i++) {
            System.out.print(fs.fibb(i)+" ");
        }
    }
}
