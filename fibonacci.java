public class fibonacci{
    public static void main(String[] args)
    {
        int fst=0,sec=1;
        int third;
        int count=10;
        for(int i=2;i<count;i++)
        {
            third=fst+sec;
            System.out.println("the value of ;"+ third);
            fst=sec;
            sec=third;
        }
    }
}
