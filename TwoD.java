import java.util.Scanner;
public class TwoD
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int A[][]=new int[3][3];
    int x,y;
    for(x=0;x<3;x++)
    {
        for(y=0;y<3;y++)
        {
            System.out.print("enter values:");
            A[x][y]=sc.nextInt();
        }
    }
    for(x=0;x<3;x++)
    {
        for(y=0;y<3;y++)
        {
            System.out.print(A[x][y]+"\t");
        }
        System.out.println();
    }
  }  
}