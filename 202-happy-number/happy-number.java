class Solution {
    public static int sumOfSquares(int n) {
        int sum = 0;
        while(n != 0) {
            int d = n % 10;
            sum += d * d;
            n /=  10;
        }
        return sum;
    }
    public static  boolean isHappy(int n) {
        while(n != 1 && n != 4) {
            n = sumOfSquares(n);
        }
        return n == 1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(isHappy(n) ? n + " is Happy number " : n + " is Not a Happy number");
    }
}