class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length < 2) return nums;
        int[] sol = new int[k];
        Map<Integer, Integer> counter = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++)
            counter.merge(nums[i], 1, (oldVal, newVal) -> oldVal + newVal);
                
        Map<Integer,Integer> topFreq =
        counter.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .limit(k)
            .collect(Collectors.toMap(
                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        Integer[] tmp = topFreq.keySet().toArray(new Integer[0]);

        sol = Arrays.stream(tmp).mapToInt(Integer::intValue).toArray();

        return sol;
    }
}