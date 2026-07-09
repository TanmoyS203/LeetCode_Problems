import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] twosum = {-1,-1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int e =nums[i];
            int m = target - e;
            if(map.containsKey(m)){
                twosum[0]=map.get(m) ;
                twosum[1]=i;
            }
            else{
                map.put(nums[i],i);
            }
        }


        return twosum;
    }
}