import java.util.Scanner;
public class sumArray
{
    public static void main(String []args)
    {
        int A[]=new int[4];
        Scanner sc=new Scanner(System.in);
        int x;
        int sum=0;
        for(x=0;x<4;x++)
        {
            System.out.println("enter array:");
            A[x]=sc.nextInt();
        }
        for(x=0;x<4;x++)
        {
            sum=sum+A[x];
            
        }
        System.out.print(sum);
    }
}