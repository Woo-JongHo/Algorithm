class Solution {
    public String solution(String bin1, String bin2) {
        
        //00 bin을 십진수로 바꾸고 다시 이진수로 바꾸자
        
        //01 인트배열 생성
        int [] b1 = new int[bin1.length()];
        int [] b2 = new int[bin2.length()];

        //02 bin을 10진수로 변하고 값을 넣을 변수 생성
        int a = 0;
        int b = 0;
        
        //02 인트배열로 변환 후, 값 넣기
        //03 이진수를 십진수로 변경
        for(int i = b1.length - 1; i >= 0 ; i--){
            b1[i] = Integer.parseInt(String.valueOf(bin1.charAt(i)));
            a = a + (b1[i] * (int)Math.pow(2, b1.length - (i + 1)));
        }

        for (int i = b2.length - 1; i >= 0 ; i--){
            b2[i] = Integer.parseInt(String.valueOf(bin2.charAt(i)));
            b = b + (b2[i] * (int)Math.pow(2, b2.length - (i + 1 )));
        }
        
        //04 10진수로 만들었음.
        a = a + b;
        
        //05 다시 이진수로 변경하기
        String answer = "";
        
        if ( a == 0 ){
            answer = "0";
            return answer;
        }
        while(a > 0){
        int remainder = a % 2;
        answer = remainder + answer;
        a = a / 2;
        }
        return answer;
    }
} 
