class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = Math.max(max,nums[i]);
                index = i;
            }
        }


        boolean b = false;
        
        for(int i=0;i<nums.length;i++){
            if(2*nums[i] > max && nums[i]!=max){
                return -1;
            }
        }
        return index;
    }
}