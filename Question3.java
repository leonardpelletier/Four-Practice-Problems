class Question3 {
    
    public static void main (String[] args) {
        long sumSquares = 0;
        long sum = 0;
        for (int i = 1; i <= 100; i++) {
            sumSquares += i*i;
            sum += i;
        }
        
        System.out.println(sum*sum - sumSquares);
    }
}