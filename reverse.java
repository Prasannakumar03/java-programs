public class reverse {
    public static void main(String [] args)
    {
        int a=123;
        int reverse;
        int re=0;
        while(a!=0)
        {
            reverse=a%10;
            re=re*10+reverse;
            a/=10;
        }
        System.out.println(re);
    }

}
