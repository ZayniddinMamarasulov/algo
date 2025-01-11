public class DIStringMatch942 {

    public static void main(String[] args) {

    }

    public int[] diStringMatch(String s) {
        char[] chars = s.toCharArray();
        int[] res = new int[chars.length + 1];
        int start = 0;
        int end = chars.length;

        for (int i = 0; i < chars.length; i++)
            res[i] = chars[i] == 'I' ? start++ : end--;

        res[chars.length] = chars[chars.length - 1] == 'I' ? start : end;

        return res;
    }
}
