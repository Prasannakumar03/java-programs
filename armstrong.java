import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class armstrong {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int num=sc.nextInt();
        int temp=num,digit=0,sum=0;
        while(temp>0)
        {
            temp=temp/10;
            digit++;
        }temp=num;
        while(temp>0)
        {
            int a=temp%10;
            sum+=Math.pow(a,digit);
            temp=temp/10;
        }
        if(sum==num)
        {
            System.out.println("it is armstrong");
        }
        else {
            System.out.println("it is not armstrong");
        }
    }
}
