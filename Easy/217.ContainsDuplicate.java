class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> test = new HashSet<>();
        for(int i = 0; i<nums.length; i++)
            if(!(test.add(nums[i])))
                return true;
        return false;
    }
}