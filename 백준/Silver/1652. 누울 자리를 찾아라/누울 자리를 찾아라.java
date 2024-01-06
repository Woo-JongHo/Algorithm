import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        char[][] arr = new char[n][n];

        for(int i = 0; i < n; i++) {
            String[] val = br.readLine().split("");
            for(int j = 0; j < n; j++) {
                arr[i][j] = val[j].charAt(0);
            }
        }
        int horizontalCount = 0, verticalCount = 0;
        for(int i = 0; i < n; i++) {
            for (int j = 0 ; j < n; j++) {
                if(i + 1 < n) {
                    if (arr[i][j] == '.' && arr[i+1][j] == '.' && (i + 2 >= n || arr[i+2][j] == 'X')) {
                        verticalCount += 1;
                    }
                }
                if(j + 1 < n) {
                    if (arr[i][j] == '.' && arr[i][j + 1] == '.' && (j + 2 >= n || arr[i][j + 2] == 'X')) {
                        horizontalCount += 1;
                    }
                }
            }
        }
        System.out.println(horizontalCount + " " + verticalCount);
    }
}
