import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = -1;

        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); // 스택의 맨 위 문자와 현재 문자가 같으면 스택에서 제거
            } else {
                stack.push(c); // 스택에 현재 문자 추가
            }
        }

        if (stack.isEmpty()) {
            answer = 1; // 스택이 비어있으면 모든 문자가 제거됨
        } else {
            answer = 0; 
        }

        return answer;
    }
}