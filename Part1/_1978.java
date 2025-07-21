import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int cnt = 0;
        boolean isPrime = true;
        
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n;i++){
            int tmp = Integer.parseInt(st.nextToken());
            if (tmp <= 1) continue;
            for (int j=2; j<=Math.sqrt(tmp); j++){
                if (tmp % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) cnt++;
            isPrime = true;
        }

        System.out.println(cnt);

    }
    
}