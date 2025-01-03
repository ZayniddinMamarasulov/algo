import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {

    public static void main(String[] args) {
        fizzBuzz(100);
    }

    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) res.add("FizzBuzz");
            else if (i % 3 == 0) res.add("Fizz");
            else if (i % 5 == 0) res.add("Buzz");
            else res.add(Integer.toString(i));
        }

        for (String item : res) System.out.println(item);

        return res;
    }

}
