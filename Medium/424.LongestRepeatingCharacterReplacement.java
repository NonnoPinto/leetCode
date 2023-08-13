class Solution {
    public int characterReplacement(String s, int k) {
        int max = 1;
        int len = s.length();
        char[] str = s.toCharArray();
        char prec = '.';
        for(int i = 0; i < len && len-i+k > max; i++){
            int exc = 0;
            int tmp = 1;
            if(prec != str[i]){
                for(int j = i+1; j < len; j++){
                    if(str[i] != str[j])
                        if(++exc > k) {
                            exc--;
                            break;
                        }
                    tmp++;
                }
            }
            tmp = (i > k-exc)? tmp + k - exc : tmp + i;
            max = (tmp>max)? tmp : max;
            prec = str[i];
        }
        return max;
    }
}