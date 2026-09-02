class MinStack {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> min = new ArrayList<>();
        int idx =0;
    public MinStack() {
    }
    
    public void push(int value) {
        list.add(value);
        int temp=Integer.MAX_VALUE;
        if(min.size() != 0)
        temp = list.get(min.get(min.size()-1));

        if (idx == 0)
        min.add(idx);

        else if (temp>=value){
            min.add(idx);
        }
        idx++;
    }
    
    public void pop() {
        if (idx-1 == min.get(min.size()-1))
        min.remove(min.size()-1);
        list.remove(list.size()-1);
        idx--;
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        return list.get(min.get(min.size()-1));
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */