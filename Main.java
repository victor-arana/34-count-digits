class Main {
    public static void main(String[] args) {
        int n = 12345;
        
        System.out.println(countDigits(n));
    }

    static int countDigits(int n) {
        int digits = 0;
        while ( n > 0 ) {
            n /= 10;
            digits++;
        }
        return digits;
    }
}
