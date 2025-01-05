public class FinalValueOfVariable2011 {

    public static void main(String[] args) {

    }

    public int finalValueAfterOperations(String[] operations) {
        int res = 0;

        for (String operation : operations)
            if (operation.contains("--")) res--;
            else res++;

        return res;
    }
}
