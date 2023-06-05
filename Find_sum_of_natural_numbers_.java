import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        Scanner mr=new Scanner(System.in);
        int n,r;
        n=mr.nextInt();
        r=n*(n+1)/2;
        System.out.println(r);
    }
}