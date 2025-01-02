public class NextGreaterElement496 {

    public static void main(String[] args) {
        nextGreaterElement(new int[]{1, 3, 5, 2, 4}, new int[]{6, 5, 4, 3, 2, 1, 7});
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        for (int i = 0; i < nums1.length; i++)
            nums1[i] = getGreater(nums1[i], nums2);

        return nums1;
    }

    public static int getGreater(int num, int[] num2) {
        for (int i = 0; i < num2.length; i++)
            if (num2[i] == num && i != num2.length - 1)
                for (int j = i; j < num2.length; j++)
                    if (num2[j] > num2[i]) return num2[j];

        return -1;
    }
}
