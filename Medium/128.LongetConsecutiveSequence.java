class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1) return 0;
        Arrays.sort(nums);
        int counter = 1;
        int max = 0;
        for(int i = 0; i<nums.length-1; i++){
            int tmp = nums[i]+1;
            if(nums[i+1] == tmp) {
                counter ++;
            }
            else if(nums[i+1] == nums[i]);
            else{
                max = (max < counter) ? counter : max;
                counter = 1;
            }
        }
        max = (max < counter) ? counter : max;
        return max;
    }
}