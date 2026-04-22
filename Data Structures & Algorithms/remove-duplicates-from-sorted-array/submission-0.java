class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return n;
        int left = 0, right = 1;
        while(right < n)
        {
            while(right < n && nums[right] == nums[left])
            {
                right++;
            }
            if(right < n)
            {
                left++;
                nums[left] = nums[right];
                right++;
            }
        }
        return left + 1;
    }
}