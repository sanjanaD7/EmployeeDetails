public class Fibonacci {
    
    public static void generateFibonacci(int n) {
        int num1 = 0, num2 = 1;
        
        System.out.println("Fibonacci series up to " + n + " terms:");
        
        if (n >= 1) {
            System.out.print(num1 + " ");
        }
        if (n >= 2) {
            System.out.print(num2 + " ");
        }
        
        for (int i = 2; i < n; i++) {
            int nextNum = num1 + num2;
            System.out.print(nextNum + " ");
            num1 = num2;
            num2 = nextNum;
        }
    }
    
    public static void main(String[] args) {
        int n = 10; // Change this to generate Fibonacci series up to different terms
        generateFibonacci(n);
    }
}
