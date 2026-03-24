class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int[] result = new int[2];
        int sum = 0;
        int j = 1;

            while (j <= nums.length - 1 || i <= nums.length - 2) {

                sum = nums[i] + nums[j];
                if (sum == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
                if(j == nums.length - 1){
                    i++;
                    j= i+1;
                }else {
                    j++;
                }
            }
            return result;
        }
    }
