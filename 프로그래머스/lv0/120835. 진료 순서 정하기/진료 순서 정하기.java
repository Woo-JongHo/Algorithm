import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = {};
        //01  요약
        int l = emergency.length;
        
        //02 배열 선언
        answer = new int[l];
        int [] a = new int[l];
        
        //03 오름차순 배열 생성
        for(int i = 0; i < l ; i++){
            a[i] = emergency[i];
        }
        Arrays.sort(a);
        
        //04 값이 오름차순(a)과 같다면, 그 때 배열번호 출력
        for (int i = 0 ; i < l ; i++){
            for(int j = 0 ; j < l ; j++){
                if(emergency[i] == a[j]){
                answer[i] = l - j ;  // 순서도는 emr이 크면 높으므로 내림차순으로 생각
                }
            }
        }
        return answer;
    }
}