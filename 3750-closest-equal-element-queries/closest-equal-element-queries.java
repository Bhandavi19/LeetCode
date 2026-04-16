import java.util.*;

class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;

        // Map value -> sorted list of indices
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        List<Integer> res = new ArrayList<>();

        for (int q : queries) {
            List<Integer> list = map.get(nums[q]);

            // Only one occurrence
            if (list.size() == 1) {
                res.add(-1);
                continue;
            }

            int idx = Collections.binarySearch(list, q);

            int left = (idx - 1 + list.size()) % list.size();
            int right = (idx + 1) % list.size();

            int leftIndex = list.get(left);
            int rightIndex = list.get(right);

            int distLeft = Math.abs(q - leftIndex);
            int distRight = Math.abs(q - rightIndex);

            // circular distance
            distLeft = Math.min(distLeft, n - distLeft);
            distRight = Math.min(distRight, n - distRight);

            res.add(Math.min(distLeft, distRight));
        }

        return res;
    }
}