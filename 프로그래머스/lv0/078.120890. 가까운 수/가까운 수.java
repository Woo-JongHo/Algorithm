

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int min = Math.abs(array[0] - n); 
        // 01.배열의 첫번째 요소와 n과의 차이를 최소값으로 초기화

        // 배열의 모든 요소를 순회하면서 차이를 계산하고, 갱신
        for (int i = 1; i < array.length; i++) {
            int a = Math.abs(array[i] - n);
          if (a < min || (a == min && array[i] < answer)) {
                min = a;
                answer = array[i];
            }
        }

        return answer;
    }
}
