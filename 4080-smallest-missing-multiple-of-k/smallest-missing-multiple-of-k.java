class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] present = new boolean[101];

        for (int num : nums) {
            // if (num % k == 0) {
            //     int multiple = num / k;
            //     if (multiple <= 101) {
            //         present[multiple] = true;
            //     }
            // }
            present[num] = true;
        }

        int count = 1;
        while(count * k < 101){
            if(!present[count*k]) break;
            count++;
        }

        return count*k;
    }
}