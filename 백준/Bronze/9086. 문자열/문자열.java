import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String T = br.readLine();
		for (int i = 0; i < Integer.parseInt(T); i++) {
			String str = br.readLine();
			bw.append(str.charAt(0)).append(str.charAt(str.length()-1)).append("\n");
		}
		
		bw.flush();
		
		
	} // end : main

} // end : class