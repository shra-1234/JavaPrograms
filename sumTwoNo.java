import java.util.Scanner;
public class sumTwoNo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a=sc.nextInt();
        
        System.out.println("Enter the second number : ");
        int b=sc.nextInt();

        int res=a+b;

        System.out.println("The sum of the "+a+" and "+b+" = "+res);
    }
}
