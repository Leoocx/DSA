class Main {
    public boolean checkPerfectNumber(int x) {
        int[] primosMersenne = {2, 3, 5, 7, 13, 17, 19, 31};  // Exponentes para 2^p - 1 primos

        for (int p : primosMersenne) {
            int mersenne = (1 << p) - 1; // 2^p - 1
            int nPerfeito = (1 << (p - 1)) * mersenne; // 2^(p-1) * (2^p - 1)
            if (nPerfeito == x) return true;
        }
        return false;
    }
}
