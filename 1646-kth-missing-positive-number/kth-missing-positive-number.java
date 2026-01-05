class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        
        for(int j : arr){
            hs.add(j);
        }
        int i=1;
        int m=k;
        while(m>0){
            if(!hs.contains(i)){

            l.add(i);
            m--;
            }
            i++;
        }
        return l.get(k-1); 
    }
}