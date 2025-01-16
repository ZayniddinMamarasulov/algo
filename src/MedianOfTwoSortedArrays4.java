public class MedianOfTwoSortedArrays4 {

    public static void main(String[] args) {
//        findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
//        findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
        findMedianSortedArrays(new int[]{0, 0}, new int[]{0, 0});
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int p1 = nums1.length - 1;
        int p2 = nums2.length - 1;
        int[] res = new int[nums1.length + nums2.length];
        int k = res.length - 1;

        while (p1 >= p2 ? p2 >= 0 : p1 >= 0)
            if (nums1[p1] > nums2[p2])
                res[k--] = nums1[p1--];
            else
                res[k--] = nums2[p2--];

        while (p1 >= 0)
            res[k--] = nums1[p1--];
        while (p2 >= 0)
            res[k--] = nums2[p2--];

        return res.length % 2 == 0
                ? (double) (res[(res.length + 1) / 2 - 1] + res[(res.length + 1) / 2]) / 2
                : res[(res.length + 1) / 2 - 1];
    }
}
