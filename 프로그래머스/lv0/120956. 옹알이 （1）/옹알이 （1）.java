class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String [] arr = {"aya","ye","woo","ma"};
        
        //01 그러니까 1,2,3,4 를 말할 수 있는데
        //02 주어진 문자열에 1,2,3,4로 조합된 숫자가 몇개 있냐는거잖아
        
        //03빈칸으로 replace하면 wyeoo도 세져서 w1oo로 변하게 변경한다.
        for(int i = 0 ; i < babbling.length ; i++){
            for(int j = 0 ; j < arr.length; j++){
                if(babbling[i].contains(arr[j]))
                    babbling[i] = babbling[i].replace(arr[j],"1");
            }
        }
        
        //04 윗 작업을 거쳐서 1만 남게 만들고, 1을 지워서 ""이면 결과를 더하기
        for(int i = 0 ; i < babbling.length; i++){
            if(babbling[i].contains("1"))
                babbling[i] = babbling[i].replace("1", "");
                
                if(babbling[i].equals("")){
                    answer = answer + 1;
                }
        
        }
    return answer;
    }
}