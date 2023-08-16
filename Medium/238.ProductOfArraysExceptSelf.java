class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] ans1 = new int[len];
        Arrays.fill(ans1, 1);
        int[] ans2 = new int[len];
        Arrays.fill(ans2, 1);

        for(int i = 0; i < len-1; i++)
            ans1[i+1] = nums[i] * ans1[i];

        for(int i = len-1; i > 0; i--){
            ans2[i-1] = nums[i] * ans2[i];
            ans2[i] *= ans1[i];
        }
        ans2[0] *= ans1[0];

        return ans2;
    }
}