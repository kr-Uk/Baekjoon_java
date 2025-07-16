import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] intArray = new int[t];
        int minimum = 1000001;
        int maximum = -1000001;

        for (int i=0; i < t; i++){
            intArray[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i < t; i++){
            if (intArray[i] > maximum) {maximum = intArray[i];}
            if (intArray[i] < minimum) {minimum = intArray[i];} 
        }

        System.out.printf("%d %d", minimum, maximum);

    }
    
}
