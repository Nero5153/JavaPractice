public class FindingSum {
    public static void main(String[] args)
    {
        int c=numberSum(1456);
        System.out.println(c);
    }
    static int numberSum(int n)
    {
        int ans;
         if(n==0)
        {return 0 ;}
            ans = n % 10;
            n = n / 10;

            int i=ans+numberSum(n);
            return i;
    }
}
