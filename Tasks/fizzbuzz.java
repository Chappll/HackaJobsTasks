public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
    }

    public static String run(int N, int M) {
		/*
		* Write your code below; return type and arguments should be according to the problem's requirements
        */
        String sequence = "";
        boolean fzbz = false;
		if (N < M) {
            for (int i = N; i <= M; i++) {
                fzbz = false;
                if(i%3 == 0){
                    sequence = sequence + "Fizz";
                    fzbz = true;
                }
                if(i%5 == 0){
                    sequence = sequence + "Buzz";
                    fzbz = true;
                }
                if (!fzbz) {
                    sequence = sequence + i;
                }
                sequence = sequence + ",";
            }
        }
        else{
            for (int i = N; i >= M; i--) {
                fzbz = false;
                if(i%3 == 0){
                    sequence = sequence + "Fizz";
                    fzbz = true;
                }
                if(i%5 == 0){
                    sequence = sequence + "Buzz";
                    fzbz = true;
                }
                if (!fzbz) {
                    sequence = sequence + i;
                }
                sequence = sequence + ",";
            }
        }
		sequence = sequence.substring(0,sequence.length()-1);
		return sequence;
	}
}
