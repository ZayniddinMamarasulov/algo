public class HammingDistance461 {

    public static void main(String[] args) {

    }

    public int hammingDistance(int x, int y) {
        int dif = 0;

        while (x != 0 || y != 0) {
            dif += (x & 1) ^ (y & 1); // x & 1 => x sonini oxirgi bitini olib beradi
            x = x >> 1; // bitta oldingi bitga o'tish amali >>
            y = y >> 1;
        }

        return dif;
    }
}
