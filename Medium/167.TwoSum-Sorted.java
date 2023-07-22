class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int compl = 0;
        int len = numbers.length;
        for(int i = 0; i<len; i++){
            if((compl = Arrays.binarySearch(numbers, i+1, len, target-numbers[i])) > 0) return new int[] {i+1, compl+1};
        }
        return new int[] {0,0};
    }
}