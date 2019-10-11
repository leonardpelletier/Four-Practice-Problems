class Question2 {

    public static void main (String[] args) {
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 0; i < 4000000; i = a + b) {
            if (i % 2 == 0) {
                sum += i;
            }
            a = b;
            b = i;
        }
        System.out.println(sum);
    }
}