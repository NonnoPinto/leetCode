class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        Set<String> sols = new HashSet<>();

        Arrays.sort(nums);
        int j,k;
        String s;
        
        for(int i = 0; i<nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            j = i+1; k= nums.length-1;
            while(j<k){
                    if(nums[j] + nums[k] == -nums[i]){
                        s = Math.min(Math.min(nums[j],nums[i]),nums[k]) + "" + Math.max(Math.max(nums[j],nums[i]),nums[k]);
                        if(sols.add(s)){
                            Integer[] tmp = {nums[i], nums[j], nums[k]};
                            sol.add(Arrays.asList(tmp));
                        }
                        j++;
                    }
                    else if(nums[j] + nums[k] > -nums[i])  k--;
                    else j++;
            }
        }
        return sol;
    }
}