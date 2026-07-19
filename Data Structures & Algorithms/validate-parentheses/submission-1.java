class Solution {
    public boolean isValid(String s) {
        //Could be done with a string, but practice with queues >>
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) return false;

                char v = stack.pop();
                if (c == ')' && v != '(') return false; 
                else if (c == '}' && v != '{') return false;
                else if (c == ']' && v != '[') return false;
            }
        }
        return stack.isEmpty();
        
    }
}
