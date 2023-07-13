class Solution {
    public boolean isPalindrome(int x) {
        int len;
        if (x<0)
            return false;
        else
            len = (int)Math.log10(x);
            for(int i=0; i <= len/2; i++){
                if( ((x % ((int)Math.pow(10,i+1))) / ((int)Math.pow(10,i))
                    != ((x % (int)Math.pow(10,len+1-i))) / ((int)Math.pow(10,len-i))) )
                    return false;
            }
            return true;
    }
}