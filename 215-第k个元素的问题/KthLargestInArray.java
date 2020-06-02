package KthLargestInArray;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @Author: lirito
 * @Date: 2020/5/26 14:07
 * @Version：
 * @Description：
 */

public class KthLargestInArray {
    public int findKthLargest(int[] nums, int k){
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public int findKthLargest2(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();  //小顶堆
        for(int val : nums){
            pq.add(val);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }

    public int findKthLargest3(int[] nums, int k){
        int l = 0;
        k = nums.length - k;
        int h = nums.length - 1;
        while (l < h){
            int po = partition(nums,l,h);
            if(po == k) {
                break;
            }else if(po < k){
                l = po + 1;
            }else if(po > k){
                h = po - 1;
            }
        }
        return nums[k];
    }

    private int partition(int[] a, int l, int h){
        int i = l;
        int j = h + 1;
        while (true){
            while (i < h && a[++i] < a[l]);
            while (j > l && a[--j] > a[l]);
            if(i >= j){
                break;
            }
            swap(a,i,j);
        }
        swap(a,l,j);
        return j;
    }

    private void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args){
        int[] nums = {1,6,34,5,3,4,5,2};
        int k = 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>();  //小顶堆
        for(int a : nums){
            pq.add(a);
            System.out.println(pq);
        }
        KthLargestInArray kthLargestInArray = new KthLargestInArray();
        System.out.println(kthLargestInArray.findKthLargest3(nums,k));
    }
}
