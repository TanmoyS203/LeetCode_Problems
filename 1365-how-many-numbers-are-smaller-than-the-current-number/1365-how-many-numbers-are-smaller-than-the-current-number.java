import java.util.*;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = Arrays.stream(nums).sorted().toArray();
     HashMap<Integer, Integer> inventory = new HashMap<>();  
     for(int i=0; i<nums.length ; i++){
        if(!inventory.containsKey(temp[i]))
            inventory.put(temp[i],i);
     } 

     int res[] = new int[nums.length];
     for(int i=0; i<nums.length ; i++){
        res[i]= inventory.get(nums[i]);
     }
        return res;
    }
}