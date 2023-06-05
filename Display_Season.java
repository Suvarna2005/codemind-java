import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        i=sc.nextInt();
        if(i==4||i==5||i==6)
        {
            System.out.println("Summer");
        }
        else if(i==7||i==8||i==9||i==10)
        {
            System.out.println("Rainy");
        }
        else if(i==11||i==12||i==1)
        {
            System.out.println("Winter");
        }
        else if(i==2||i==3)
        {
            System.out.println("Spring");
        }
        else
        {
            System.out.println("-1");
        }
    }
}