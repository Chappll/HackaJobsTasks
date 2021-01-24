public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
    }

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int pos = 0;
        int valley = 0;
        for (int i = 0; i < steps; i++) {           
            if (path.charAt(i) == 'U') {
                pos++;
                if (pos == 0) {
                    valley++;
                }
            }
            if (path.charAt(i) == 'D') {
                pos--;
            }
        }
            return valley;
        }

        static int jumpingOnClouds(int[] c) {
            int pos = 1;
            int jumps = 0;
            while(pos < c.length - 2)
            {
                if (c[pos+2] != 1) {
                    pos = pos + 2;
                    jumps++;
                }
                else if (c[pos+1] != 1) {
                    pos++;
                    jumps++;
                }
            }
            if (pos < c.length) {
                jumps++;
            }
            System.out.println(jumps);
            return jumps;
        }
    
        static long repeatedString(String s, long n) {
            long aCount = 0;
            long extra = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') {
                    aCount ++;
                }
            }
            for (int i = 0; i < n%s.length(); i++) {
                if (s.charAt(i) == 'a') {
                    extra ++;
                }
            }
            long totala = ((n/s.length())*aCount) + extra;
            return totala;
            
        }
}
