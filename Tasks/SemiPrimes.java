public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
    }

    public static boolean run(int number) {
		/*
		* Write your code below; return type and arguments should be according to the problem's requirements
		*/
        int count = 0;
        for (int i = 2; count < 2 && i*i <= number; ++i) {
            while(number%i == 0) {
                number /= i;
                ++count;
            }            
        }
        if (number > 1) {
            ++count;
        }

        boolean isSemiprime = false;
        if (count == 2) {
            isSemiprime = true;
        } 
		
		return isSemiprime;
	}

}
