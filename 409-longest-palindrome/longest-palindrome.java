class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128]; // ASCII for uppercase + lowercase letters
        
        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }
        
        int length = 0;
        boolean hasOdd = false;
        
        for (int count : freq) {
            // Add largest even part
            length += (count / 2) * 2;
            
            // Check if any odd frequency exists
            if (count % 2 == 1) {
                hasOdd = true;
            }
        }
        
        // One odd character can be placed in center
        if (hasOdd) {
            length += 1;
        }
        
        return length;
    }
}