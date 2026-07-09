import java.util.*;
class Solution {
    public int minimumCost(int[] cost) {
        
       Arrays.sort(cost);
       int n = cost.length;
       int sum =0;
            for(int i =n-1; i>=0; i--){
                if((n-i)%3==0){continue;}
                else{sum += cost[i];}
            }
        return sum;
    }
}