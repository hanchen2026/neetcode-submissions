class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String s: operations) {
            if (s.equals("C")) {
                stack.pop();
            }
            else if (s.equals("D")) {
                stack.push((stack.peek() * 2));
            }
            else if (s.equals("+")) {
                int temp = stack.pop();
                int other = stack.peek() + temp;
                stack.push(temp);
                stack.push(other);
            }
            else {
                stack.push((Integer.parseInt(s)));
            }
        }

        int runningSum = 0;

        while(!stack.isEmpty()) {
            runningSum += stack.pop();
        }

        return runningSum;
    }
}