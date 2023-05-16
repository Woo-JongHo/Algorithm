class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        
        // boolean 이용 
        for(int i = 0 ; i < dic.length; i++){
            boolean Check = true;
            for(int j = 0; j < spell.length; j++){
                if(!dic[i].contains(spell[j])){
                    Check = false;
                    break;
                }
            }
            if(Check){
                return 1;
            }
        }
        return 2;
    }
}