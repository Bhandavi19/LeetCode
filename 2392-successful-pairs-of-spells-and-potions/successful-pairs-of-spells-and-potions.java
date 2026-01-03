class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=potions.length;
        int res[] = new int[spells.length];
        for(int i=0;i<spells.length;i++){
            long spell = spells[i];
            long req = (success+spell-1)/spell;
            int index = bs(potions,req);
            res[i] = n-index;
        }
        return res;
    }
    public int bs(int arr[],long tar){
        int ans=arr.length;
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int m = (l+h)/2;
            if(arr[m]>=tar){
                ans = m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
}