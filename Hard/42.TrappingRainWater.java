class Solution {
    public int trap(int[] height) {
        int i, tot = 0;
        int len = height.length;
        int maxHeight;

        for(i = 0; i<len && height[i]==0; i++);
        maxHeight = i;
        i++;

        for(; i < len; i++){
                if(height[i] >= height[maxHeight]){
                    maxHeight = i;
                }
                tot += height[maxHeight]-height[i];
        }

        int maxTmp = len-1;
        for(i = len-1; i > maxHeight; i--){
            if(height[i] >= height[maxTmp]){
                    maxTmp = i;
            }
            tot -= height[maxHeight]-height[maxTmp];
        }

        return tot;
    }
}