class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int maxVol = 0;
        int small, tmp;
        for(int i=0; i<len; i++)
            for(int k=len-1; k>i; k--)
                if((height[i]*(k-i))>maxVol){
                    small = (height[i]<height[k])?height[i]:height[k];
                    tmp = (small*(k-i));
                    maxVol = (maxVol<tmp)?tmp:maxVol;
                }else break;
        return maxVol;
    }
}