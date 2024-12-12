import java.util.Arrays;

public class TakeGifts2558 {

    public static void main(String[] args) {
//        pickGifts(new int[]{25, 64, 9, 4, 99}, 4);
        pickGifts(new int[]{1, 1, 1, 1}, 4);
    }

    public static long pickGifts(int[] gifts, int k) {
        long res = 0;

        Arrays.sort(gifts);

        while (k > 0) {
            gifts[gifts.length - 1] = (int) Math.sqrt(gifts[gifts.length - 1]);
            Arrays.sort(gifts);
            k--;
        }

        for (int item : gifts)
            res += item;

        System.out.println(res);
        return res;
    }
}
