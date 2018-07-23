import java.util.Arrays;

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int length = nums1.length + nums2.length;
        int[] num3 = new int[length];
        double result = 0;
        for(int i = 0; i < nums1.length; i++){
            num3[i] = nums1[i];
        }
        for(int j = nums1.length; j < num3.length; j++){
            num3[j] = nums2[j-nums1.length];
        }
        Arrays.sort(num3);
        for(int i = 0; i < num3.length; i++){
        }
        if(num3.length % 2 == 0){
            result =  (double)(num3[num3.length / 2] + num3[num3.length / 2 -1])/2;
        }
        if(num3.length % 2 != 0){
            result = (double)num3[num3.length / 2];
        }
        return result;
    }

    public static void main(String[] args) {
        FindMedianSortedArrays findMedianSortedArrays = new FindMedianSortedArrays();
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {2,3};
        double result = 0;
        result = findMedianSortedArrays.findMedianSortedArrays(nums1,nums2);
        System.out.println(result);
    }
}
