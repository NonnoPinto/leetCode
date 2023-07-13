/* This solution beats more than 90% of submissions! */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> sub = new HashMap<>();
        int maxlen = 0;
        int k = -1;
        Integer lastFound; // null if first time with that char or N if already found
        int off = 0; //substr offset
        int len = s.length();
        char c;
        for (int i=0; i < len; i++){
            c = s.charAt(i);
            lastFound = sub.put(c, i);
            k++;
            if (lastFound == null || lastFound < off){
                if(maxlen <= k) maxlen = k + 1;
                //System.out.print("OK " + k + " " + lastFound + " " + off + " " + maxlen);
            }
            else{
                k = k - (lastFound - off) - 1;
                if(maxlen < k) maxlen = k;
                //System.out.print("NOT " + k + " " + lastFound + " " + off + " " + maxlen);
                off = lastFound + 1;
            }
            //System.out.println();
        }
        return maxlen;
    }
}