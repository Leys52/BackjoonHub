import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		int[] basket = new int[N];
		for (int i = 0; i < N; i++) {
			basket[i] = i + 1;
		} // end : for-i
		
		for (int i = 0; i < M; i++) {
			stk = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(stk.nextToken());
			int k = Integer.parseInt(stk.nextToken());
			
			int [] tmp = basket.clone();
			int l = k;
			for(int j = h; j<=k; j++) {
				basket[j-1] = tmp[l-1];
				l--;
			} // end : for-j

		} // end : for-i
		
		for (int i = 0; i < basket.length; i++) {
			bw.append(Integer.toString(basket[i])).append(" ");
		} // end : for-i

		bw.flush();
	} // end : main

} // end : class