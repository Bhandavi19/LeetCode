class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int arr[] = new int[s.length()];
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c){
                l.add(i);
            }
        }
        for(int i=0;i<s.length();i++){
            int po = Integer.MAX_VALUE;
            for(int j : l){
                po = Math.min(po , Math.abs(i-j));
            }
            arr[i] = po;
        }
        return arr;
    }
}