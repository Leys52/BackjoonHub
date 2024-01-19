import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int a = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		char [] charray = str.toCharArray();
		
		int sum=0;
		for (int i = 0; i < a; i++) {
			sum = sum+(charray[i]-'0');
		}
		System.out.print(sum);
		
	} // end : main

} // end : class