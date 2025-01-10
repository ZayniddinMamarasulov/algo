import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatest1431 {

    public static void main(String[] args) {

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = candies[0];

        for (int candy : candies) if (max < candy) max = candy;
        for (int candy : candies) res.add(candy + extraCandies >= max);

        return res;
    }
}
