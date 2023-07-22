class Solution {
    

    public int countPrimes(int n) {
        if (n == 0 || n == 1)
            return 0;
        return isprime(n);
    }

    public static int isprime(int n) {
        boolean[] prime = new boolean[n];
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i * i < n; i++) { // Correct the loop condition here
            if (!prime[i]) {
                for (int mul = 2; i * mul < n; mul++) { // Correct the loop condition here
                    prime[i * mul] = true;
                }
            }
        }
         int c = 0;
        for (int j = 2; j < n; j++) {
            if (!prime[j]) {
                c++;
            }
        }
        return c;
    }
}
