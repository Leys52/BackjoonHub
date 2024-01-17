import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String [] sarray = new String[2];
		sarray = br.readLine().split(" ");
		int N = Integer.parseInt(sarray[0]);
		int [] iarray = new int[N];
		
		for (int i = 0; i < N; i++) {
			iarray[i] = i+1;
		}
		
		int M = Integer.parseInt(sarray[1]);
		int tmp;
		for (int i = 0; i < M; i++) {
			sarray = br.readLine().split(" ");
			int a = Integer.parseInt(sarray[0]);
			int b = Integer.parseInt(sarray[1]);
			
			tmp = iarray[a-1];
			iarray[a-1] = iarray[b-1];
			iarray[b-1] = tmp;
			
		} // end : for-i
		
		for (int i = 0; i < iarray.length; i++) {
			bw.append(Integer.toString(iarray[i])).append(" ");
			
		} // end : for-i
		
		bw.flush();
		
	} // end : main
	
} // end : class