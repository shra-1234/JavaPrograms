import java.util.Scanner;

public class prime {
    boolean isPrime(int n){
        if (n <= 1) return false;
        for(int i=2;i<n/2;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter the which you want to check on :");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        prime obj= new prime();
        if (obj.isPrime(n)){
            System.out.println("The number is prime.");
        }
        else{
            System.out.println("The number is not prime.");
        }
    }
}
