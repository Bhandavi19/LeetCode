class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> hs = new LinkedHashSet<>();
        for(int i : nums){
            hs.add(i);
        }
        int i = 0;
        for(int n : hs){
            nums[i] = n;
            i++;
        }
        return hs.size();
    }
}