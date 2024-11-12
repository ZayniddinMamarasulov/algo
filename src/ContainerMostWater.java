public class ContainerMostWater {

    public static void main(String[] args) {
        maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int square = 0;

        while (left <= right) {
            int temp;
            if (height[left] < height[right]) {
                temp = height[left] * (right - left);
                left++;
            } else {
                temp = height[right] * (right - left);
                right--;
            }

            if (temp > square)
                square = temp;
        }

        System.out.println("res : " + square);

        return square;
    }
}
