import java.util.*;
public class PrimeCounter{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int count = countPrimes(m,n);
        System.out.println(count);
    }
    private static int countPrimes(int m,int n)
    {
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes,true);
        primes[0] = false;
        primes[1] = false;
        for(int i = 2;i*i <= n;i++)
        {
            if(primes[i]){
                for(int j=i*i;j  <= n;j +=i)
                {
                  primes[j]=false;  
                }
            }
        }
        int count = 0;
        for(int i= m; i<=n;i++)
        {
            if(primes[i])
            {
                count++;
            }
        }
        return count;
    }
}