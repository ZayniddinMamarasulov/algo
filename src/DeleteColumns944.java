public class DeleteColumns944 {

    public static void main(String[] args) {
//        minDeletionSize(new String[]{"cba", "daf", "ghi"});
//        minDeletionSize(new String[]{"rrjk", "furt", "guzm"});
        minDeletionSize(new String[]{"zyx", "wvu", "tsr"});
    }

    public static int minDeletionSize(String[] strs) {
        int count = 0;
        int k = 0;
        while (k < strs[0].length()) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (strs[i].charAt(k) > strs[i + 1].charAt(k)) {
                    count++;
                    break;
                }
            }
            k++;
        }

        return count;
    }
}
