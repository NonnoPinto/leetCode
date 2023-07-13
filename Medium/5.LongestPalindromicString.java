class Solution {
    public String longestPalindrome(String s) {
        int[] sol = {0,0};
        int maxlen = 0;
        int len = 0;
        if(s.length()<2) return s;
        for(int k = 0; k < s.length() - 1; k++){
            for(int i=s.length()-1; i>k; i--){
                int left = k;
                int right = i;
                len = i-k+1;
                if(len>maxlen){
                    /* System.out.println("---" + len + " " + k + " " + i + "---"); */
                    for(int j=0; j<(len/2); j++){
                        /* System.out.println(s.charAt(left) + " " + s.charAt(right)); */
                        if(s.charAt(left) != s.charAt(right)){
                            len = 0;
                            break;
                        }
                        left++;
                        right--;
                    }
                    if(maxlen<len){
                        maxlen=len;
                        sol[0] = k;
                        sol[1] = i;
                        /* System.out.println(s.substring(k,i+1)); */
                    }
                }
            }
        }
        String sub = s.substring(sol[0], sol[1]+1);
        return (sub.length()>0) ? sub : s.substring(0,1);
    }
}