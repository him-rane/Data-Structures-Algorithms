package LoverBuberSDESheet.Array;

class MedianOfTwoSortedArraysOfDifferentSizes {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums2.length < nums1.length)
            return findMedianSortedArrays(nums2, nums1);
        int n1 = nums1.length;
        int n2 = nums2.length;

        int low = 0, high = n1;

        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = (n1 + n2 + 1) / 2 - cut1;

            int left1 = (cut1 > 0) ? nums1[cut1 - 1] : Integer.MIN_VALUE;
            int left2 = (cut2 > 0) ? nums2[cut2 - 1] : Integer.MIN_VALUE;

            int right1 = (cut1 < n1) ? nums1[cut1] : Integer.MAX_VALUE;
            int right2 = (cut2 < n2) ? nums2[cut2] : Integer.MAX_VALUE;

            if (left1 <= right2 && left2 <= right1) {
                if ((n1 + n2) % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    return Math.max(left1, left2);
                }
            } else if (left1 > right2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }

        return 0.0;

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 3, 5, 6, 7, 9 };
        int[] nums2 = { 4, 6, 8, 9 };
        double res = findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
    }
}
