class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> n = new HashMap<>();
        int[] sol = {0,0};
        Integer id = null;
        for(int i = 0; i<nums.length; i++){
            id = n.get(target-nums[i]);
            n.put(nums[i],i);
            if(id != null && id != i)
                return new int[] {i,id};
        }
        return null;
    }
}