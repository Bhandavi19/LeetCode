import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Count frequency
        for (int x : nums) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        // Copy nums into temp array
        Integer[] temp = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }

        Arrays.sort(temp, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (!hm.get(a).equals(hm.get(b))) {
                    return hm.get(a) - hm.get(b);  
                } else {
                    return b - a;                  
                }
            }
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }

        return nums;
    }
}