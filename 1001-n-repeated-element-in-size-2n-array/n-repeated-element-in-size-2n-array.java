class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i],0)+1);
        }
        for(int i : hm.keySet()){
            if(hm.get(i) > 1){
                return i;
            }
        }
        return -1;
    }
}