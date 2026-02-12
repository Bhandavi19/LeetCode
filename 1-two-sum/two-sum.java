class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> hs = new HashMap<>();
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int temp = target - nums[i];

            if(hs.containsKey(temp)){
                arr[0] = hs.get(temp);
                arr[1] = i;
            }
            hs.put(nums[i],i);//store them with their indices
        }
        return arr;
    }
}