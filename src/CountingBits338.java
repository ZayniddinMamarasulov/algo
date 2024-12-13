public class CountingBits338 {

    public static void main(String[] args) {

    }

    public int[] countBits(int n) {
        int[] bits = new int[n + 1];

        if (n == 0) return new int[]{0};

        bits[0] = 0;
        bits[1] = 1;
        if (n == 1) return bits;

        for (int i = 2; i < n + 1; i++) {
            // bits[i>>1] = bitta oldingi son
            // i&1 = sonni oxirgi raqami, 1 bit bo'lsa, oxirgi bitlar soniga 1 bit qo'shiladi
            int bitCount = bits[i >> 1] + (i & 1);
            bits[i] = bitCount;
        }

        return bits;
    }
}
