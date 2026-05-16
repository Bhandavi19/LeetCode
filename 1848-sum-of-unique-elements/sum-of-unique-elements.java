class Solution {
    public int sumOfUnique(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int c = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    c++;
                }
            }
            if(c == 1){
                l.add(nums[i]);
            }
        }
        int sum=0;
        for(int n : l){
            sum+=n;
        }
        return sum;
    }
}