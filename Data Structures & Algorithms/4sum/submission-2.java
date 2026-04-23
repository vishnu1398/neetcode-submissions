class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        if(n < 4)
            return result;
        Arrays.sort(nums);
        for(int i=0; i<n-3; i++)
        {
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            for(int j=i+1; j<n-2; j++)
            {
                if(j > i+1 && nums[j] == nums[j-1])
                {
                    continue;
                }
                long currSum = (long)nums[i] + nums[j];
                long diff = (long) target - currSum;
                int left = j+1, right = n-1;
                while(left < right)
                {
                    long sum = (long) nums[left] + nums[right];
                    if(sum == diff)
                    {
                        List<Integer> list= new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        result.add(list);
                        left++;
                        right--;
                        while(left < right && nums[left] == nums[left-1])
                            left++;
                        while(right > left && nums[right] == nums[right+1])
                            right--;
                    }
                    else if(sum < diff)
                        left++;
                    else
                        right--;
                }
            }
        }

        return result;
    }
}




