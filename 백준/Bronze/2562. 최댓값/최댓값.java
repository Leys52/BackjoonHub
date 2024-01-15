
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [] a = new int[9];
		
		for(int i=0; i<9; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine()," ");
			a[i] = Integer.parseInt(stk.nextToken());
		}
		
		int [] b = a.clone();
		
		Arrays.sort(b);
		
		int hnum = b[b.length-1];
		int j=0;
		while (0!=1) {
			
			if(hnum==a[j]) {
				break;
			} else{
				j++;
				continue;
			}
		} //end: while
		
		System.out.println(hnum);
		System.out.println(j+1);

	} // end : main
	
} // end : class