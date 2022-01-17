public class fact {
    public static void main(String[] args)
    {
        int c=factNum(5);
        System.out.println(c);
    }
    static int factNum(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        return n*=factNum(n-1);

    }
}
