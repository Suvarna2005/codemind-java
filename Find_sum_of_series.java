import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner mr=new Scanner(System.in);
        int n;
        double i,s=0.0;
        n=mr.nextInt();
        for(i=1;i<=n;i++)
        {
            s=s+1/i;
        }
        System.out.format("%.2f",s);
    }
}