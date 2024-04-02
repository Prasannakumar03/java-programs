import java.util.Scanner;

public class prime {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if(isprime(num))
        {
            System.out.println("it is prime");
        }
        else {
            System.out.println("it is not prime");
        }
    }
    public static boolean isprime(int n)
    {
        if(n<=0)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }return true;
    }
}
