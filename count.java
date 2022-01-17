public class count {
    public static void main(String[] args)
    {
        System.out.println(num(100000000,0));
    }
    public static int num(int n,int count)
    {
        int rev=n%10;
        if(n/10==0)
        {
            return count;
        }
        if(rev==0)
        {
            return num(n/2,++count);
        }
        return num(n/2, count);
    }
}
