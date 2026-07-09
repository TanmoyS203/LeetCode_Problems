class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        
        Set<Integer> narr = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int ret[] = new int[n];
        for(int i =0 ; i<n; i++){
        narr.add(arr[i]);
        }
        for(int i =1 ; i<=n; i++){
            if(narr.contains(i)){continue;}
            else{
               list.add(i);
            }
        }
        return list;


    }
}