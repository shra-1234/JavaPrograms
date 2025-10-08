import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int[] arrN=new int[n];
		for(int i=0;i<n;i++){
		    arrN[i]=sc.nextInt();
		}
		String ans="No";
        for(int i=0;i<n;i++){
            if(arrN[i]==x){
                ans="Yes";
            }
        }
        System.out.println(ans);
	}
}
