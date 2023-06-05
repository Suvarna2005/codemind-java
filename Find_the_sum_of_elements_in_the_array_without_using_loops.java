import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner mr=new Scanner(System.in);
        int n,i,a[],s=0;
        n=mr.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=mr.nextInt();
        }
        for(i=0;i<n;i++)
        {
            s=s+a[i];
        }
        System.out.println(s);
    }
}