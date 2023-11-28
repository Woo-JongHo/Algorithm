import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int [] arr = new int[9];
        for(int i = 0; i < 9; i++) {
            int a = sc.nextInt();
            arr[i] = a;
            sum = sum + a;
        }
    
        outerloop:
        for(int i = 0; i < 8; i++) {
            for(int j = i + 1 ; j < 9; j++) {
                if( arr[i] + arr[j] == sum - 100){
                    arr[i] = 0;
                    arr[j] = 0;
                    break outerloop;
                }
            }
        }
        
        //오름차순으로 출력하기
        Arrays.sort(arr);

        for(int i = 2; i < 9; i++){
            System.out.println(arr[i]);
        }

    }
}