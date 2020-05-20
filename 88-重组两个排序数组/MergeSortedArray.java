package MergeSortedArray;

/**
 * @Author: lirito
 * @Date: 2020/5/19 19:18
 * @Version：
 * @Description：
 * @解决思路：如果从头开始遍历的话，可能没有排序到的数也被归并了，所以是从尾到头开始遍历。
 * 因为长度刚好够，而且末尾并没有数据，所以从尾遍历最好了。
 */

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l1 = m - 1; int l2 = n - 1;
        int index = m + n - 1;
        while (l1 >= 0 || l2 >= 0){
            if(l1 < 0 ) nums1[index--] = nums2[l2--];
            else if(l2 < 0) nums1[index--] = nums1[l1--];
            else if(nums1[l1] > nums2[l2]){
                nums1[index--] = nums1[l1--];
            }else nums1[index--] = nums2[l2--];
        }
        for(int i = 0; i < m+n; i++){
            System.out.println(nums1[i]);
        }
    }


    public static void main(String[] args){
        int a[] = {1,2,3,0,0,0};
        int[] b = {2,5,6};
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(a,3,b,3);
//        int ab = 1;
//        int ac = 0;
//        if(ab != 1){
//            System.out.println(ab);
//        }else {
//            System.out.println(ac);
//        }
    }
}
