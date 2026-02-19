class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>(); // stores indices

        for (int j = 0; j < n; j++) {
            // Remove indices outside the window
            if (!dq.isEmpty() && dq.peekFirst() < j - k + 1) {
                dq.pollFirst();
            }

            // Remove smaller elements from the back (they'll never be max)
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[j]) {
                dq.pollLast();
            }

            dq.addLast(j);

            // Start recording results once first window is complete
            if (j >= k - 1) {
                result[j - k + 1] = nums[dq.peekFirst()];
            }
        }

        return result;

    }
}