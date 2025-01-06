import java.util.ArrayList;
import java.util.List;

public class JewelsAndStones771 {

    public static void main(String[] args) {
        numJewelsInStones("aA", "aAAbbbb");
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (int i = 0; i < stones.length(); i++)
            if (jewels.contains(stones.charAt(i) + "")) count++;


        return count;
    }
}
