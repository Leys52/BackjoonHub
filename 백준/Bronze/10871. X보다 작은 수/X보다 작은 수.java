
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] sarray1 = str.split(" ");
        str = br.readLine();
        String[] sarray2 = str.split(" ");
        String[] sarray3 = new String[sarray2.length];
        int j = 0;

        for (int i = 0; i < Integer.parseInt(sarray1[0]); i++) {
            if (Integer.parseInt(sarray2[i]) < Integer.parseInt(sarray1[1])) {
                bw.append(sarray2[i]).append(" ");
                sarray3[j] = sarray2[i];
                j++;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    } // end : main
} // end : class