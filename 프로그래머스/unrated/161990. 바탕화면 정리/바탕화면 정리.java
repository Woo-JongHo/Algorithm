class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {51,51,-1,-1};
        
        for(int i = 0 ; i < wallpaper.length; i++){
            char arr [] = wallpaper[i].toCharArray();
            for(int j = 0 ; j < wallpaper[i].length(); j++){
                if(arr[j] == '#'){
                    answer[0] = Math.min(answer[0], i);
                    answer[1] = Math.min(answer[1], j);
                    answer[2] = Math.max(answer[2], i);
                    answer[3] = Math.max(answer[3], j);
                }       
            }
        }
        answer[2] = answer[2] + 1;
        answer[3] = answer[3] + 1;
        return answer;
    }
} 