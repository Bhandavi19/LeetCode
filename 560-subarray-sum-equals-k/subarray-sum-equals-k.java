class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans=0;
        int cnt=0;
        hm.put(0,1);
        for(int i=0;i<n;i++){
            ans+=nums[i];
            if(hm.containsKey(ans-k)){
                cnt+=hm.get(ans-k);
            }
            hm.put(ans,hm.getOrDefault(ans,0)+1);
        }
        return cnt;
    }
}