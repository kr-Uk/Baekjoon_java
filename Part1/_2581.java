import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int sum = 0;
        int min = -1;
        int[] arr = new int[10001];

        arr[0] = 0;
        arr[1] = 0;

        for (int i = 2; i < 10001; i++){
            arr[i] = i;
        }

        for (int i = 0; i < 10001; i++){
            if (arr[i] == 0) continue;
            for (int j = arr[i]+1; j < 10001; j++){
                if (arr[j] % arr[i] == 0){
                    arr[j] = 0;
                }
            }
        }

        for (int i = b; i >= a; i--){
            if (arr[i] == 0) continue;
            sum += arr[i];
            min = arr[i];
        }

        if (sum == 0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
        
    }
    
}