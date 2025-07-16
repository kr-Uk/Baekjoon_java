import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] intArray = new int[2];
        int maximum = 0;
        int tmp = 0;

        for (int i=0; i < 10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            intArray[0] = Integer.parseInt(st.nextToken());
            intArray[1] = Integer.parseInt(st.nextToken());
            tmp -= intArray[0];
            tmp += intArray[1];

            if (tmp > maximum) {maximum = tmp;}
        }

        System.out.printf("%d", maximum);

    }
    
}
