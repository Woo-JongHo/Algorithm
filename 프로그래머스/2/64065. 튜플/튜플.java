import java.util.*;
class Solution {
    public int[] solution(String s) {
        Set<String> set =new LinkedHashSet<>();
        String[] tuple = s.substring(1 , s.length() - 1).split("},");
       
        for(int i = 0 ; i < tuple.length ; i++){
            tuple[i] = tuple[i].replace("{","");   
            tuple[i] = tuple[i].replace("}","");
            //tuple[i]=tuple[i].replaceAll("[{}]",""); 
        }
        
        Arrays.sort(tuple,(a,b)->(a.length()-b.length()));
        for(String data : tuple){
            String[] arr = data.split(",");
            for(String data2 : arr){
                set.add(data2);
            }
        }
        int[] answer = new int[set.size()];
        int cnt = 0;
        
        for(String data:set){
            answer[cnt++]=Integer.parseInt(data);
        }
        
        return answer;
    }
}