import java.util.Arrays;

public class FirstandLast {
    public static void main(String [] args)
    {
        int[] arr={5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,8)));
    }
        public static int[] searchRange(int[] nums, int target) {
            int s=0;
            int i=1;
            int e=nums.length-1;
            int [] arr={-1,-1};
            while(s<=e)
            {
                int mid=s+(e-s)/2;
                if(nums[mid]==target)
                {

                    arr[i--]=mid;

                }
                if(nums[mid]<target)
                {
                    s=mid+1;
                }
                else
                {
                    e=mid-1;
                }
            }
            return arr;
        }
}

