class Solution {

    Stack<Integer> stc = new Stack<>();

    public int evalRPN(String[] tokens) {
        
        List<String> operators = Arrays.asList("+","-","*","/");
        
        for(String s : tokens){
            if(operators.contains(s)){
                compute(s);
            }
            else
                stc.push(Integer.valueOf(s));
        }
        return stc.pop();
    }

    public void compute(String op){
        Integer tmp = stc.pop();
        switch(op){
            case "+":
                stc.push(stc.pop() + tmp);
                break;
            case "-":
                stc.push(stc.pop() - tmp);
                break;
            case "*":
                stc.push(stc.pop() * tmp);
                break;
            case "/":
                stc.push(stc.pop() / tmp);
                break;
        }
    }
}