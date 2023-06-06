class Solution {
    public int solution(int[][] lines) {

        // 1. arr 배열 및 변수 초기화
        int[] arr = new int[200];
        int answer = 0;
        
        // 2. lines 정보를 arr 배열에 적용
        for(int i = 0; i < lines.length; i++)
            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) // j < lines가 핵심
                arr[j]++;
        
        // 3. arr 배열에서 겹친 부분 세기
        for(int i = 0; i < 200; i++)
            if(arr[i] > 1)
                answer++;
        
        return answer;
    }
  }        
        
        
        /* 겹치지 않고 걸치는 부분을 잘 몰랐다        
        int answer = 0;
        int size = 0;
        
        for (int i = 0; i < lines.length; i++)
            size += lines[i][1] - lines[i][0];
        
        int[] arr = new int[size];
        int k = 0;
        
        for (int i = 0; i < lines.length; i++) {
            for (int j = lines[i][0]; j < lines[i][1]; j++) {
                arr[k] = j;
                k++;
            }
        }
        
        
        for(int i = 0 ; i < size; i++){
            if(arr[i] > 1)
        }
        return answer;
    } */