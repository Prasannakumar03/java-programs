import java.sql.SQLOutput;
import java.util.Scanner;


class Scratch {
    public static  void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");

        int arm= sc.nextInt();
        int temp=arm,digit=0,sum=0;
        while(temp>0)
        {
            temp=temp/10;
            digit++;
        }
        temp=arm;
        while(temp>0)
        {
           int a=temp%10;
           sum+=Math.pow(a,digit);
           temp=temp/10;
        }
        if(sum==arm)
        {
            System.out.println("it is armstrong");
        }
        else {
            System.out.println("it is not armstrong");
        }

    }
}