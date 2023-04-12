import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        //01. String을 char[]배열로 바꾸고, 대문자변경해준다
        char [] arr = my_string.toCharArray();
        
        for (int i = 0 ; i< arr.length; i++){
            if (arr[i] >= 'A' && arr[i] <= 'Z')               
                arr[i] = (char)(arr[i] + 32); // arr[i] = arr[i] + 32;는 char + int 형이라 안된다.
                                              // arr[i] += 32; 는 컴파일러가 자동으로 형변환해줌.
        }
        //02. sort이용해서 차순정리한다
        Arrays.sort(arr);
        answer = new String(arr); // char 배열을 String으로 변환하여 대입
        return answer;
    }
}