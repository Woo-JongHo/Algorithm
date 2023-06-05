class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                if (Character.isLowerCase(arr[i])) {
                    arr[i] = (char) ((arr[i] - 'a' + n) % 26 + 'a');
                } else {
                    arr[i] = (char) ((arr[i] - 'A' + n) % 26 + 'A');
                }
            }
        }
        
        String answer = new String(arr);
        return answer;
    }
}