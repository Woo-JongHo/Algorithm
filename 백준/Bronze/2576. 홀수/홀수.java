import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int compare = 100;
        int sum = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
        g = sc.nextInt();

        if( a % 2 != 0){
            sum = sum + a;
            if(compare > a)
                compare = a;
        }
        if( b % 2 != 0){
            sum = sum + b;
            if (compare > b)
                compare = b;
        }
        if ( c % 2 != 0 ){
            sum = sum + c;
            if (compare > c)
                compare = c;
        }
        if ( d % 2 != 0 ){
            sum = sum + d;
            if (compare > d)
                compare = d;
        }
        if ( e % 2 != 0 ){
            sum = sum + e;
            if (compare > e)
                compare = e;
        }
        if ( f % 2 != 0 ){
            sum = sum + f;
            if (compare > f)
                compare = f;
        }
        if( g % 2 != 0 ){
            sum = sum + g;
            if ( compare > g)
                compare = g;
        }

        if(sum == 0)
            System.out.println(-1);
        else{    
            System.out.println(sum);
            System.out.println(compare);
        }

    }
}