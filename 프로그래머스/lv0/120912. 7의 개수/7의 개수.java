class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            String str = String.valueOf(array[i]);
            char[] arr = str.toCharArray();

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == '7') {
                    answer++;
                }
            }
        }

        return answer;
    }
}