import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortThePeople2418 {

    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new TreeMap<>();

        for (int i = 0; i < heights.length; i++)
            map.put(heights[i], names[i]);

        String[] res = new String[names.length];
        int idx = names.length - 1;
        for (String name : map.values())
            res[idx--] = name;

        return res;
    }
}
