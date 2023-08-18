import java.util.Vector;

class MinStack {

    List<Integer> stk = new ArrayList<>();
    List<Integer> mins = new ArrayList<>();
    int min;

    public MinStack() {
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        stk.add(val);
        if(val <= min){
            min = val;
            mins.add(val);
        }
    }
    
    public void pop() {
        int tmp = mins.size()-1;
        if(min == stk.remove(stk.size()-1)) {
            mins.remove(tmp);
            min = (tmp==0)? Integer.MAX_VALUE : mins.get(tmp-1);
        }
    }
    
    public int top() {
        return stk.get(stk.size()-1);
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */