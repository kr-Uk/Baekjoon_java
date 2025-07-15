import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for (int i=1; i<=a; i++){
            if (a%i == 0) {
                 cnt++; 
                 if (cnt == b) {
                    System.out.println(i);
                    break;
                 }
            }
        }

        if (cnt < b){
            System.out.println(0);
        }
    }
    
}
