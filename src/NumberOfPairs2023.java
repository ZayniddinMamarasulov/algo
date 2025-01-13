public class NumberOfPairs2023 {

    public static void main(String[] args) {
//        numOfPairs(new String[]{"777", "7", "77", "77"}, "7777");
        numOfPairs(new String[]{"123", "4", "12", "34"}, "1234");
//        numOfPairs(new String[]{"1", "1", "1"}, "11");
    }

    public static int numOfPairs(String[] nums, String target) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            String temp = target.replaceFirst(nums[i], "");
            int tempIndex = target.indexOf(nums[i]);

            for (int j = 0; j < nums.length; j++)
                if (i != j && nums[j].equals(temp) && tempIndex == 0)
                    count++;
        }

        return count;
    }
}
