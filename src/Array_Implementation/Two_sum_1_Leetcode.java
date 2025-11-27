package Array_Implementation;

//Questions
//Given an array of integers nums and an integer target, return indices of the
// two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution,
// and you may not use the same element twice.
//
//You can return the answer in any order.


import java.util.ArrayList;

public class Two_sum_1_Leetcode {
    public static void main(String[] args) {
        // The initial target value we are using to implement two sum.
        int target = 7;

        //using ArrayList Collection Framework for storing the list of the indices which will be produced in the answer.
        ArrayList<Integer> ans_list = new ArrayList<Integer>();

        //initializing the sample array
        int [] nums = {0,1,2,3,4,5,6,7,8,9};
        //looping and conditionals
        for (int i=0,j=1;j<nums.length;i++,j++){
            if (nums[i]+nums[j] == target){

                ans_list.add(i);
                ans_list.add(j);

                break;
            }
        }

        System.out.println(ans_list);




    }

}
