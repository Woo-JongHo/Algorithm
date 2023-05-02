import java.util.TreeSet;
import java.util.HashSet;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        //01 HashSet으로 X값들 모으고 Y값들 모은다,
        HashSet<Integer> x = new HashSet<>();
        HashSet<Integer> y = new HashSet<>();
        
        for(int i = 0 ; i < 4 ; i++){
            x.add(dots[i][0]);
            y.add(dots[i][1]);
        }
        
        //02 오름차순 정렬 TreeSet 이용
        TreeSet<Integer> sortX = new TreeSet<>(x);
        TreeSet<Integer> sortY = new TreeSet<>(y);
        
        //3 차를 구한뒤 곱한다.
        int xlength = sortX.first() - sortX.last();
        int ylength = sortY.first() - sortY.last();
        return answer = xlength * ylength;
    }
}