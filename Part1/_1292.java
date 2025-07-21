import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[1001];
        int n = 1;
        int line = 1;
        int sum = 0;

        for(int i=0; i<1001; i++){
            arr[i] = n;
            if(line == n) {
                n++;
                line = 1;
            }
            else line++;
        }

        for(int i=a-1; i<b; i++){
            sum += arr[i];
        }

        System.out.println(sum);
        

    }
    
}