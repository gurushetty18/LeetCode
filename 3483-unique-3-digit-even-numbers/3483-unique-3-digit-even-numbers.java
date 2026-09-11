import java.util.HashMap;
import java.util.Map;

class Solution {
    public int totalNumbers(int[] digits) {
        // Count frequency of each digit provided in input
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        int count = 0;

        // Check every 3-digit even number from 100 to 998
        for (int num = 100; num < 1000; num += 2) {
            int d1 = num / 100;        // Hundreds place
            int d2 = (num / 10) % 10;  // Tens place
            int d3 = num % 10;         // Units place

            // Count frequency needed for the current number
            int[] needed = new int[10];
            needed[d1]++;
            needed[d2]++;
            needed[d3]++;

            // Check if available digits satisfy the required frequencies
            boolean possible = true;
            for (int i = 0; i < 10; i++) {
                if (needed[i] > freq[i]) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                count++;
            }
        }

        return count;
    }
}