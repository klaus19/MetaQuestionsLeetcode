import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedSquares {

    public int[] getSquares(int[]nums){
        int[]res = new int[nums.length];
        int n= nums.length;
        int low=0,hi=nums.length-1;

        for (int i=n-1;i>=0;i--){
            if (Math.abs(nums[low])>=Math.abs(nums[hi])){
                res[i] =nums[low]*nums[low];
                low++;
            }else {
                res[i] = nums[hi]*nums[hi];
                hi--;
            }

        }
        return res;

    }


    public static void main(String[] args) {
        SortedSquares st = new SortedSquares();
        int[]a = new int[]{-4,-1,0,3,10};
        System.out.println(Arrays.toString(st.getSquares(a))); //IMP

    }
}
