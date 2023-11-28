import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int [] arr = new int[20];
        
        //01 배열 20개 선언
        for(int i = 0; i < 20; i++) 
            arr[i] = i + 1;

        //02 입력 받기
        for (int i = 0; i < 10 ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = a; j < b; j++){
                int c = arr[a - 1];
                arr[a - 1] = arr[b - 1];
                arr[b - 1] = c;
                a = a + 1;
                b = b - 1;
            }
        }
        
        for(int i = 0; i < 20; i++)
            System.out.print(arr[i] + " ");
    }
}