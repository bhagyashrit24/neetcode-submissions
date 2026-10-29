class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String t = tokens[i];
            if (t.equals("+")) {
                st.push(st.pop() + st.pop());
            } else if (t.equals("-")) {
                int a = st.pop();
                int b = st.pop();
                st.push(b - a);
            } else if (t.equals("*")) {
                st.push(st.pop() * st.pop());
            } else if (t.equals("/")) {
                int a = st.pop();
                int b = st.pop();
                st.push(b / a);
            }
            else {
                st.push(Integer.parseInt(t));
            }
        }
        return st.peek();
    }
}
