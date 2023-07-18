class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() < 2) return true;
        s = (s.replaceAll("[^a-zA-Z0-9]","")).toLowerCase();
        if (s.length() < 2) return true;
        int beg = 0;
        int end = s.length()-1;
        while(beg<end){
            if(s.charAt(beg) != s.charAt(end)) return false;
            beg++; end--;
        }
        return true;
    }
}