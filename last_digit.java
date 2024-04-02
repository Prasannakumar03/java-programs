public class last_digit {
    public static void main(String [] args)
    {
        int a = 1234;
        int last=a%10;
        int first=0;
        while(a!=0)
        {
            first=Math.abs(a%10);
            a/=10;
        }
        System.out.println("the value of last digit:" + last);
        System.out.println("the value of first digit:" + first);
    }
}
