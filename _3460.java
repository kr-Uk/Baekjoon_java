import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int b = Integer.parseInt(br.readLine());
            int cnt = 0;
            List<Integer> list = new ArrayList<>();

            while (b > 0) {
                if (b % 2 == 1) {list.add(cnt);}
                cnt++;
                b /= 2;
            }
            
            for (int j = 0; j < list.size(); j++){
                System.out.print(list.get(j));
                if (j != list.size() - 1) {
                    System.out.print(" ");
                }
            }
            
            System.out.println("");
        }
    }
    
}
