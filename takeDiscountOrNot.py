import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] a = new int[n]; 

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt(); 
            }
            // Your code goes here
            int totSum=0;
            int discountedSum=0;
            int temp1=0;
            int temp2=0;
            for(int i=0;i<n;i++){
                if(y>a[i]){
                    temp1+=0;
                }
                else{
                    temp2=a[i]-y;
                    temp1+=temp2;
                }
                totSum+=a[i];
            }
            discountedSum=x+temp1;
            if(totSum>discountedSum){
                System.out.println("COUPON");
            }
            else
            System.out.println("NO COUPON");
        }
    }
}
