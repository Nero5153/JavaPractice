import java.util.ArrayList;

public class LinearSearch {
    public static void main(String [] args)
    {
        int [] arr={11,2,5,3,2,3,3,1,2,3,4};
        boolean x=search(arr,3,0);
      System.out.println(x);
      System.out.println(indexSearch(arr,3,0));
      ArrayList list=listReturn(arr, 3, 0, new ArrayList());
       System.out.println(list);
    }
    public static boolean search(int[]arr,int val,int i)
    {
        if(i>arr.length)
        {
            return false;
        }
     return arr[i]==val || search(arr, 3, ++i);
    }
    public static int indexSearch(int[]arr,int val,int i)
    {
        if(i>arr.length)
        {
            return 0;
        }
        if(arr[i]==val)
        {
            return i;
        }
        else
        {
            return indexSearch(arr, 3, ++i);
        }

    }

    public static ArrayList listReturn(int[] arr,int val,int i,ArrayList list)
    {

       if(i>arr.length-1)
       {
           return list;
       }
       if(arr[i]==val){
           list.add(i);

       }

           return listReturn(arr,val,++i,list);

    }
}
