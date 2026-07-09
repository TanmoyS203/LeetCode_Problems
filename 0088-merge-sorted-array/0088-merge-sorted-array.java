import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[m+n];
        int p =0;
        
        for(int i=0; i<m; i++){
            arr[p] = nums1[i];
            p++;
        }
        for(int i=0; i<n; i++){
            arr[p] = nums2[i];
            p++;
        }
        
        Arrays.sort(arr);
        for(int i=0; i<m+n; i++){
            nums1[i]=arr[i];
           
        }
        
        
    }
}