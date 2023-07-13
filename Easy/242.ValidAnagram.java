class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        while(s.length()>0){
            t = t.replace(s.substring(0,1), "");
            s = s.replace(s.substring(0,1), "");
            //System.out.println(s.substring(0,1) + " " + tmp1 + " " + tmp2);
            if(s.length() != t.length())
                return false;
        }
        return true;
    }
}