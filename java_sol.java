import java.io.*;
import java.util.*;

public class Main {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int t=in.nextInt();
//		int t=1;
		for(int i=1; i<=t; ++i)
			new Solver();
		out.close();
	}
	
	static class Solver {
		Solver() {
			String s=in.next();
			long ans=Long.MAX_VALUE;
			for(long i=0; i<(long)s.length(); ++i) {
				long tmp=0, p=1;
				for(long j=(long)s.length()-1; j>=0; --j)
					if(i!=j) {
						tmp+=p*(s.charAt((int)j)-'0');
						p*=10;
					}
				ans=Math.min(ans, tmp);
			}
			out.println(ans);
		}
	}
	
	static class Reader {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(in.readLine());
				} catch(Exception e) {}
			}	
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	
}
