import java.util.*;

class Ad {
    int c, w;

    Ad(int c, int w) {
        this.c = c;
        this.w = w;
    }
}

public class Main {
    
    static int knapsack(List<Ad> ads, int C, int N) {
        final int INF = 1000000;
        int[] dist = new int[1100];
        Arrays.fill(dist, INF);
        dist[0] = 0;

        for (Ad ad : ads) {
            for (int j = 1; j < 1100; j++) {
                if (j - ad.w >= 0) {
                    dist[j] = Math.min(dist[j], dist[j - ad.w] + ad.c);
                }
            }
        }

        int ans = dist[C];
        for (int i = C + 1; i < 1100; i++) {
            ans = Math.min(ans, dist[i]);
        }

        return ans;
    }

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int N = sc.nextInt();

        List<Ad> ads = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int c = sc.nextInt();
            int w = sc.nextInt();
            ads.add(new Ad(c, w));
        }

        System.out.println(knapsack(ads, C, N));
    }
}
