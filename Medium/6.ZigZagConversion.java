class Solution {
    public String convert(String s, int numRows) {
        /* ROW 3 -- 0 4 8 12 || 1 3 5 7 9 11 13 || 2 6 10 14 */
        /* ROW 4 -- 0 6 12 || 1 5 7 11 13 2 4 8 10 14 || 3 9 15 */

        /* Every row has distance from one char to another
            ** First half rows --> c {2[(n-1)-row]} c [2row] c **
            ** Second half rows --> c [2(n-row)] c [2row] **
        */
        int len = s.length();
        if(len == 1 || numRows == 1)
            return s;
        String out = "";
        int n = numRows-1;
        // make string with num char multiple of numrows
        int id;
        boolean exp;
        for(int i = 0; i<numRows; i++){
            exp = true; // true if first expr, false otherwise
            id = i;
            while(id<len){
                out += s.charAt(id);
                    // exp is a switch for two different expr
                    // if i is first or last line, use only one expr
                    if((exp || i == 0) && i != n){
                        id = id + 2*(n-i);
                        exp = false;
                    }
                    else{
                        id = id + 2*i;
                        exp = true;
                    }
            }
        }
        /* System.out.println(out); */
        return out;
    }
}