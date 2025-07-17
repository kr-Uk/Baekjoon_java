import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] intArray = new int[9];
        int total = 0;
        
        for (int i=0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            intArray[i] = Integer.parseInt(st.nextToken());
            total += intArray[i];
        }

        total -= 100;
        int a = 0;
        int b = 0;

        for (int i=0; i<8; i++){
            for (int j=i+1; j<9; j++){
                if(intArray[i] + intArray[j] == total){
                    a = intArray[i];
                    b = intArray[j];
                    break;
                }
            }
        }

        Arrays.sort(intArray);

        for(int i=0; i<9; i++){
            if(intArray[i] != a && intArray[i] != b){
                System.out.println(intArray[i]);
            }
        }
    }
    
}
