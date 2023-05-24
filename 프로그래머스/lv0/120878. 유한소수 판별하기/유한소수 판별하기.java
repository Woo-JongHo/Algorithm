import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        int c = 0;

        if (a > b)
            c = a;
        else
            c = b;

        // 인수분해하기 하고 배열에 저장하기
        for (int i = 2; i <= c; i++) {
            if (a % i == 0 && b % i == 0) {
                a = a / i;
                b = b / i;
                i = 1;
            }
        }
        
        // b가 2 또는 5로만 구성되어 있는지 확인
        while (b % 2 == 0)
            b = b / 2;
        while (b % 5 == 0)
            b = b / 5;
        
        if (b == 1)
            answer = 1;
        else
            answer = 2;
        
        return answer;
    }
}