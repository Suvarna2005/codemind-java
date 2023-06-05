import java.util.Scanner;
public class sample
{
    public static void main(String args[])
    {
        int n,i,op;
        op=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            op=op+i;
        }
        System.out.println(op);
    }
}