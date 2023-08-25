import java.util.HashSet;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        //01 끝말잇기를 정확히 했는가?
        for(int i = 0 ; i < words.length - 1; i++){
            char[] arr_a = words[i].toCharArray();
            char[] arr_b = words[i+1].toCharArray();
            
            if(arr_a[arr_a.length - 1] != arr_b[0]){
                answer[0] = (i + 1) % n + 1; 
                answer[1] = (i + 1) / n + 1; 
                break;
            }
        }        
        
        //02 전에 말했던 단어를 반복했는가?
       HashSet<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            if (set.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            set.add(words[i]);
        }
        
        return answer;
    }
}