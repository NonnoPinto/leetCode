class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 2) return strs[0];
        String pref = "";
        try{
            for(int i = 0; i<200; i++){
                for(int k=0; k<strs.length-1; k++){
                    if(strs[k].charAt(i)!=strs[k+1].charAt(i)) return pref;
                }
                pref += strs[0].charAt(i);
            }
        }catch(Exception e){
            return pref;
        }
        return pref;
    }
}