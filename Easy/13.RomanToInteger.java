class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> conv  = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int tot = 0;
        int tmp;
        int prec = 0;
        for(int i = s.length()-1; i >= 0; i--){
            tmp = conv.get(s.charAt(i));
            if(tmp < prec){
                tot = tot - tmp;
            }
            else
                tot = tot + tmp;
            prec = tmp;
        }
        return tot;
    }
}