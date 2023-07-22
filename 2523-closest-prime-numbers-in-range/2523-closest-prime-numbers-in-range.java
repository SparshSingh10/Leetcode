import java.util.ArrayList;

class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> primesList = generatePrimes(left, right);
        int[] closestPair = new int[]{-1, -1};
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < primesList.size() - 1; i++) {
            if (primesList.get(i + 1) - primesList.get(i) < minDiff) {
                closestPair[0] = primesList.get(i);
                closestPair[1] = primesList.get(i + 1);
                minDiff = primesList.get(i + 1) - primesList.get(i);
            }
        }

        return closestPair;
    }

    public ArrayList<Integer> generatePrimes(int left, int right) {
        ArrayList<Integer> primesList = new ArrayList<>();
        boolean[] isPrime = new boolean[right + 1];
        for (int i = 2; i <= right; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= right; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i =left; i <= right; i++) {
            if (isPrime[i]) {
                primesList.add(i);
            }
        }

        return primesList;
    }
}
