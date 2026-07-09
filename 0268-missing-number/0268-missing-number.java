class Solution {
    public int missingNumber(int[] nums) {
        int sa =0;
        for(int i =0; i<nums.length; i++){
              sa +=  nums[i];
        }
        int r =nums.length;
       int sn = (r*(r+1))/2;
        return (sn-sa);
    }
}