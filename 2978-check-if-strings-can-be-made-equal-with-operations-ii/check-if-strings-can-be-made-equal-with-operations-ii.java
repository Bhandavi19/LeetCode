class Solution {
    public boolean checkStrings(String s1, String s2) {
        HashMap<Character, Integer> odds_s1 = new HashMap<>();
        HashMap<Character, Integer> evens_s1 = new HashMap<>();
        HashMap<Character, Integer> odds_s2 = new HashMap<>();
        HashMap<Character, Integer> evens_s2 = new HashMap<>();

        for (int i = 1; i < s1.length(); i += 2) {
            odds_s1.put(s1.charAt(i), odds_s1.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s1.length(); i += 2) {
            evens_s1.put(s1.charAt(i), evens_s1.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for (int i = 1; i < s2.length(); i += 2) {
            odds_s2.put(s2.charAt(i), odds_s2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s2.length(); i += 2) {
            evens_s2.put(s2.charAt(i), evens_s2.getOrDefault(s2.charAt(i), 0) + 1);
        }

        return odds_s1.equals(odds_s2) && evens_s1.equals(evens_s2);
    }
}