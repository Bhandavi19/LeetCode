class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for(int i=0;i<n;i++){
            int arr[] = new int[26];
            for(int j=i;j<n;j++){
                char ch = s.charAt(j);
                arr[ch - 'a']++;
                if(arr[ch - 'a'] > 2) {
                    break;
                }
                ans = Math.max(ans,j-i+1);
            }            
        }
        return ans;
    }
}