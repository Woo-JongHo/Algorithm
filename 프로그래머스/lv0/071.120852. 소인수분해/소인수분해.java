import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        //01 리스트 크기 만들어주기
        int len = 0;
        
        int j = n;
        if (j == 2){ // 2 예외처리
            int[] answer = new int[1];
            answer[0] = 2;
            return answer;
        }
        //02 소인수분해 하기
        for(int i = 2 ; i <= j; i++){
            if(j % i == 0){
                len = len + 1;
                j = j / i;
                i = 1;
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        if ( len == 0){ // 예외처리
            list.add(n);
        }
        //03 리스트에 소인수 모두 출력
        for(int i = 2; i <= n ; i++ ){
            if(n % i == 0){
                list.add(i);
                n = n / i;
                i = 1;
            }
        }

        //04 Hash 이용해서 중복제거
        HashSet<Integer> set = new HashSet<Integer>();
        set.addAll(list);

        list.clear();
        list.addAll(set);

        //05 answer에다가 배열 넣기
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;        
    }
}
