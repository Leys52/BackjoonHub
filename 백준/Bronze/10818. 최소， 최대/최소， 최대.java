import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		br.readLine();
		
		StringTokenizer stk = new StringTokenizer(br.readLine()," ");
		List<Integer> li = new ArrayList<Integer>();

		Integer first, last;
		String str;
		while (stk.hasMoreElements()) {
			str = (String) stk.nextElement();
			li.add(Integer.parseInt(str));
		}

		Collections.sort(li);
		// li의 첫번째 값과 마지막 값 가져오기
		first = li.get(0);
		int lastIdx = li.size() - 1;
		last = li.get(lastIdx);

		bw.append(Integer.toString(first)).append(" ").append(Integer.toString(last));

		bw.flush();
		bw.close();
		br.close();

	} // end : main
} // end : class