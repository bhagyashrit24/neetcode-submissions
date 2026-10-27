class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            char ch = arr[i];
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else {
                if(ch == ')'){
                    if(!st.isEmpty() && st.peek() == '('){
                        st.pop();
                    }else{
                        return false;
                    }
                } if(ch == '}'){
                    if(!st.isEmpty() && st.peek() == '{'){
                        st.pop();
                    }else{
                        return false;
                    }
                }if(ch == ']'){
                    if(!st.isEmpty() && st.peek() == '['){
                        st.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}
