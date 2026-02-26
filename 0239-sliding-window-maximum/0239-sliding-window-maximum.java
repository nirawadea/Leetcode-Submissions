class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
         int[] output = new int[nums.length - k + 1];
        Deque<Integer> q = new ArrayDeque<>(); // stores indices
        int l = 0, r = 0, idx = 0;

        while (r < nums.length) {
            // Pop smaller values from q
            while (!q.isEmpty() && nums[q.peekLast()] < nums[r]) {
                q.pollLast();
            }
            q.addLast(r);

            // Remove left val if it's outside the window
            if (l > q.peekFirst()) {
                q.pollFirst();
            }

            // Window has reached size k
            if ((r + 1) >= k) {
                output[idx++] = nums[q.peekFirst()];
                l++;
            }

            r++;
        }

        return output;
    }
}