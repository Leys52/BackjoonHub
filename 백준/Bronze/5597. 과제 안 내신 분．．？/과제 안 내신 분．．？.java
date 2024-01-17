import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int [] iarray = new int[30];
		int [] iarray2 = new int[30];
		
		for (int i = 0; i < iarray.length-2; i++) {
			String str = br.readLine();
			iarray[Integer.parseInt(str)-1]=Integer.parseInt(str);
		}// end : for-i
		for (int i = 0; i < iarray2.length; i++) {
			iarray2[i] = i+1;
		} // end : for-i
		for (int i = 0; i < iarray2.length; i++) {
			if (iarray[i]!=iarray2[i]) {
				bw.append(Integer.toString(iarray2[i])).append("\n");
			}
		} // end : for-i
		
		bw.flush();
		
	} // end : main
	
} // end : class