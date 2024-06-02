import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int k = 0; k < t; k++) {
            scanner.nextLine();
            String[] dimensions = scanner.nextLine().split(" ");
            int r = Integer.parseInt(dimensions[0]);
            int c = Integer.parseInt(dimensions[1]);
            char[][] matrix = new char[r][c];

            for (int i = 0; i < r; i++) {
                matrix[i] = scanner.nextLine().toCharArray();
            }

            int candyCount = countCandies(matrix, r, c);
            System.out.println(candyCount);
        }

        scanner.close();
    }

    private static int countCandies(char[][] matrix, int r, int c) {
        int candyCount = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c - 2; j++) {
                if (matrix[i][j] == '>' && matrix[i][j + 1] == 'o' && matrix[i][j + 2] == '<') {
                    candyCount++;
                }
            }
        }

        for (int i = 0; i < r - 2; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 'v' && matrix[i + 1][j] == 'o' && matrix[i + 2][j] == '^') {
                    candyCount++;
                }
            }
        }

        return candyCount;
    }
}
