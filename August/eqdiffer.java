import java.io.*;
import java.util.*;

class C {
    static FastScanner sc;
    static PrintWriter pw;

    public static void main(String[] args) throws Exception{
        sc = new FastScanner();
        pw = new PrintWriter(System.out);
        
        try{

            int T = sc.ni();
            while(T-->0){
                int n = sc.ni();
                int a[] = new int[n];
                Map<Integer,Integer> mp = new HashMap<>();
                int maxC = Integer.MIN_VALUE;
                for(int i=0; i<n; i++){
                    a[i] = sc.ni();
                    mp.put(a[i], mp.getOrDefault(a[i], 0)+1);
                    maxC = Math.max(maxC, mp.get(a[i]));
                }
                if(n<=2){
                    pw.println("0");
                }else if(maxC==1){
                    pw.println(n-2);
                }else{
                    pw.println(n-maxC);
                }
            }

        }catch(Exception e){
            return;
        }

        pw.close();
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in), 32768);
            st = null;
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int ni() {
            return Integer.parseInt(next());
        }

        int[] intArray(int N) {
            int[] ret = new int[N];
            for (int i = 0; i < N; i++)
                ret[i] = ni();
            return ret;
        }
 
        long nl() {
            return Long.parseLong(next());
        }

        long[] longArray(int N) {
            long[] ret = new long[N];
            for (int i = 0; i < N; i++)
                ret[i] = nl();
            return ret;
        }

        double nd() {
            return Double.parseDouble(next());
        }
 
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}
