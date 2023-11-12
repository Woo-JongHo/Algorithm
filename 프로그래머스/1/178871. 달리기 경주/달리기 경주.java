import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> pMap = new HashMap<String, Integer>();
        
        for(int i = 0; i < players.length; i++){
            pMap.put(players[i], i);
        }
        
        for(String name : callings){
            //change ranks
            int idx = pMap.get(name);
            pMap.put(players[idx], idx - 1);
            pMap.put(players[idx - 1], pMap.get(players[idx - 1]) + 1);
            //swap players
            String temp = players[idx];
            players[idx] = players[idx - 1];
            players[idx - 1] = temp;
        }
        
        return players;
    }
}