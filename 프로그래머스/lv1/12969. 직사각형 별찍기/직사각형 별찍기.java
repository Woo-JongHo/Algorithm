import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int j = 0;
        while (j != b) {
            for (int i = 0; i < a; i++) {
                System.out.print('*');
            }
            System.out.println(); 
            j++;
        }
    }
}
