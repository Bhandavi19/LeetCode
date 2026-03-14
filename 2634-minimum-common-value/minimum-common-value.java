class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs.add(nums1[i]);
        }

        for(int i:nums2){
            if(hs.contains(i)){
                return i;
            }
        }
        return -1;
    }
}