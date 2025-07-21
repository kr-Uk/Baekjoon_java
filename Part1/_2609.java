import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int share = 2;
        int gcd = 1;
        int lcm = 1;
        while(true){
            if(share > a || share > b) {break;}
            if(a % share == 0 && b % share == 0){
                gcd *= share;
                lcm *= share;
                a /= share;
                b /= share;
                share = 2;
                continue;
            }
            share += 1;

        }

        lcm *= a * b;
            
        System.out.println(gcd);
        System.out.println(lcm);

    }
    
}