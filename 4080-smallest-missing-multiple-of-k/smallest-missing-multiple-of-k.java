class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] present = new boolean[102];

        for (int num : nums) {
            if (num % k == 0) {
                int multiple = num / k;
                if (multiple <= 101) {
                    present[multiple] = true;
                }
            }
        }

        for (int i = 1; i <= 101; i++) {
            if (!present[i]) {
                return i * k;
            }
        }

        return -1;
    }
}