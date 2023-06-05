import java.util.*;
public class Sample
{
    public static boolean isprime(int n)
    {
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner mr=new Scanner(System.in);
        int m,c=0;
        m=mr.nextInt();
        for(int i=2;i<=(int)Math.sqrt(m);i++)
        {
            if(isprime(i))
            c++;
        }
        System.out.println(c);
        mr.close();
    }
}