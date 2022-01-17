public class ReverseNumber {
    public static void main(String [] args)
    {
        System.out.println(reverse(1234));
    }
    static int reverse(int n)
    {
        int digits=(int)(Math.log10(n))+1;
        return orev(n,digits);
    }
    static int orev(int n,int digits)
    {
        if(n%10==n)
        {
            return n;
        }
        int rev=n%10;
        return rev * (int) (Math.pow(10, digits-1))+orev(n/10,digits-1);
    }
}
