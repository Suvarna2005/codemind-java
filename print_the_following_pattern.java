import java.util.*;
public class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>0;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}