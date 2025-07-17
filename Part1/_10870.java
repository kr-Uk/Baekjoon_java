import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] intArray = new int[21];
        intArray[0] = 0;
        intArray[1] = 1;
        int n = Integer.parseInt(st.nextToken());
        
        for (int i=2; i < 21; i++) {intArray[i] = intArray[i-1] + intArray[i-2];}

        System.out.println(intArray[n]);

    }
    
}
