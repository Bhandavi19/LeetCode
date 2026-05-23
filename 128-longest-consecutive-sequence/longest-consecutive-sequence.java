class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int res = 0;
        for(int i : nums){
            hs.add(i);
        }
        for(int i : hs){
            if(!hs.contains(i-1)){
                int num = i;
                int cnt = 1;
                while(hs.contains(i+1)){
                    i++;
                    cnt++;
                }
                res = Math.max(res,cnt);
            }
        }
        return res;
    }
}