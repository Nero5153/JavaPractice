public class CelingOfNumber {
    public static void main(String [] args)
    {
        int [] num={2,5,7,9,13,24,26,27,52,60};
           int x=solution(num,0,num.length-1,61);
        System.out.println(x);
    }
    public static int solution(int[] num,int s,int e,int val)
    {
        if(s>e) {
           return -1;
        }

      int mid=s+(e-s)/2;
      if(num[mid]==val||num[mid]>val) {
          if(s!=mid&&num[mid-1]>val)
          {
              return solution(num, s, mid,val);
          }
          return num[mid];
      }
      if(num[mid]<val) {
          return solution(num, mid + 1, e, val);
      }
      return num[e];
      }
    }

