package Array_Implementation;
import java.util.Arrays;

public class arrayRunningSum_leetcode_1480 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int sum = 0;
        int[] nums = new int[array.length];


        for(int i=0;i<array.length;i++){
            sum= sum+array[i];
            nums[i]= sum;

        }
        System.out.println(Arrays.toString(nums));

    }

}
