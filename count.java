public class count {
    public static void main(String[] args)
    {
        int a=1235;
        int count=0;
        while(a!=0)
        {
            a/=10;
            count++;
        }
        System.out.println(count);
    }
}
