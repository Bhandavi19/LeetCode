class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l =new ArrayList<>();
        int n=  nums.length;
        int c1 = 0 , c2 = 0;
        int ele1 = 0 , ele2 = 0;
        for(int i=0;i<nums.length;i++){
            if(c1 == 0 && nums[i] != ele2){
                c1=1;
                ele1=nums[i];
            }
            else if (c2 == 0 && nums[i] != ele1){
                c2=1;
                ele2=nums[i];
            }
            else if(nums[i] == ele1){
                c1++;
            }
            else if(nums[i] == ele2){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0;i<nums.length;i++){
            if(ele1 == nums[i]) c1++;
            else if(ele2 == nums[i]) c2++;
        }
        if(c1 > n/3) l.add(ele1);
        if(c2>n/3) l.add(ele2);
        Collections.sort(l);
        return l;
    }
}