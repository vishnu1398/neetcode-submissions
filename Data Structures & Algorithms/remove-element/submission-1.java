class Solution {
    public int removeElement(int[] nums, int val) {
        int pos = -1, index = 0;
        while(index < nums.length)
        {
            if(nums[index] != val)
            {
                pos++;
                nums[pos] = nums[index];
            }
            index++;
        }
        return pos != -1 ? pos + 1 : 0;
    }
}