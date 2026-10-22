class Solution {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }

        int n = nums.length;
      
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        
        if (min == max) {
            return 0;
        }

        int bucketSize = Math.max(1, (max - min) / (n - 1));
        int bucketCount = (max - min) / bucketSize + 1;

        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];
        boolean[] bucketHasElement = new boolean[bucketCount];

        for (int i = 0; i < n; i++) {
            int idx = (nums[i] - min) / bucketSize;
            if (!bucketHasElement[idx]) {
                bucketMin[idx] = nums[i];
                bucketMax[idx] = nums[i];
                bucketHasElement[idx] = true;
            } else {
                bucketMin[idx] = Math.min(bucketMin[idx], nums[i]);
                bucketMax[idx] = Math.max(bucketMax[idx], nums[i]);
            }
        }

        
        int maxGap = 0;
        int previousMax = min;
        
        for (int i = 0; i < bucketCount; i++) {
            if (!bucketHasElement[i]) {
                continue;
            }
            maxGap = Math.max(maxGap, bucketMin[i] - previousMax);
            previousMax = bucketMax[i];
        }

        return maxGap;
    }
}