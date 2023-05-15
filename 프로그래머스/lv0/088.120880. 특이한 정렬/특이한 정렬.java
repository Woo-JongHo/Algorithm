import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int [] answer = new int[numlist.length];
        for (int i = 0; i < numlist.length; i++)
            answer[i] = Math.abs(n - numlist[i]);

        // 거리에 따라 numlist를 정렬
        for (int i = 0; i < numlist.length-1; i++){
            for (int j = i+1; j < numlist.length; j++){
                if (answer[i] > answer[j]){
                    int temp1 = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp1;

                    int temp2 = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp2;
                }
                // 거리가 같다면 더 큰 수를 앞으로
                else if (answer[i] == answer[j] && numlist[i] < numlist[j]){
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }

            }
            return numlist;
        }
}
