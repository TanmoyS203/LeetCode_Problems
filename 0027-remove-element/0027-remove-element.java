import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        int x = nums.length;
        int[] nums2 = new int[x];
        int q =0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]== val){
                x--;

            }
            else{
                nums2[q++]=nums[i];
            }
        }


        for(int i =0; i<x; i++){
            nums[i]=nums2[i];
        }
        return x;
    }
}