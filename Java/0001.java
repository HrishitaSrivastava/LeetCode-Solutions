class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numbers= new HashMap<>();
        int complement;
        for (int i=0;i< nums.length;i++) {
            complement=target-nums[i];
            if(numbers.containsKey(complement)) {
                return new int[] {i,numbers.get(complement)};
            }
            else
                numbers.put(nums[i], i);
        }
    return new int[] {-1,-1};
    }
}
// Solution 2
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int result[] = new int[2];
        for (int i = 0; i<len;i++)
        {
            for (int j = i+1; j<len; j++)
            {
                if (nums[i]+nums[j] == target)
                {
                    result[0] = i;
                    result[1] = j;
                }
            }
            
        }
        return (result);
    }
}
