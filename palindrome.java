import java.util.Scanner;

public class palindrome {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int temp=num,sum=0;
        while(num!=0)
        {
            int a=num%10;
            sum=sum*10+a;
            num/=10;
        }
        if(sum==temp)
        {
            System.out.println("it is palindrome");

        }
        else{
            System.out.println("it is not palindrome");
        }
    }
}
