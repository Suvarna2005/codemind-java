import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int nextPrimePalindrome=findNextPrimePalindrome(n);
        System.out.println(nextPrimePalindrome);
 }
 static int findNextPrimePalindrome(int n)
 {
     int next = n+1;
     while(true){
         if(isPalindrome(next)&&isPrime(next))
         {
             return next;
         }
         next++;
     }
 }
 static boolean isPalindrome(int n)
 {
     String s = Integer.toString(n);
     int i = 0,j = s.length()  -1;
     while(i < j){
         if(s.charAt(i)!=s.charAt(j)){
             return false;
         }
           i++;
    j--;
}
return true;
}
static boolean isPrime(int n){
    if(n<2){
        return false;
    }
    for(int i=2;i<=Math.sqrt(n);i++)
    {
        if(n%i==0){
            return false;
        }
    }
    return true;
}
}