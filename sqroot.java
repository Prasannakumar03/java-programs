public class sqroot {
    public static void main(String args[])
    {
        int n=16;
        System.out.println("The square root of "+n+"is:"+squareRoot(n));
    }
    public static double squareRoot(int n)
    {

        double t;
        double sqrtroot=n/2;
        do {
            t=sqrtroot;
            sqrtroot=(t+(n/t))/2;
        }while((t-sqrtroot)!=0);
        return sqrtroot;
    }
}
