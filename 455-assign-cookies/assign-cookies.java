class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Sort greed factors and cookie sizes
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // pointer for children
        int j = 0; // pointer for cookies

        // Try to satisfy children starting from least greedy
        while (i < g.length && j < s.length) {
            // If current cookie can satisfy current child
            if (s[j] >= g[i]) {
                i++; // child is content
            }
            j++; // move to next cookie
        }

        // Number of content children
        return i;
    }
}