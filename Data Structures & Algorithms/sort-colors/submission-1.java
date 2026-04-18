class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        
        while(mid < nums.length && mid <= high)
        {
            if(nums[mid] == 0)
            {
                //System.out.println("found 0, mid : " + mid);
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 2)
            {
                //System.out.println("found 2, mid : " + mid);
                swap(nums, mid, high);
                high--;
            }
            else
            {
                //System.out.println("found 1, mid : " + mid);
                mid++;
            }
        }
    }

    public void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

