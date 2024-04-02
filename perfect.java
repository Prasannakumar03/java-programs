import java.util.Scanner;

public class perfect {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n/2)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }i++;
        }
        if(n==sum)
        {
            System.out.println("it is perfect");
        }
        else {
            System.out.println("it is not perfect");
        }
    }
}
