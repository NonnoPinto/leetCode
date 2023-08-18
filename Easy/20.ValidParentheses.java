class Solution {
    public boolean isValid(String s) {
        Stack stk = new Stack();

        for(char c : s.toCharArray()){
            switch(c){
                case '(' : stk.push(')'); break;
                case '[' : stk.push(']'); break;
                case '{' : stk.push('}'); break;
                default: try{
                    if(c != (char)stk.pop()) return false;
                    break;
                }
                catch(Exception E){
                    return false;
                }
            }
        }

        return stk.empty();
    }
}