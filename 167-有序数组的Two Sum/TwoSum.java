package TwoSum;

import java.util.Scanner;

/**
 * @Author: lirito
 * @Date: 2020/5/12 11:25
 * @Version：
 * @Description：在有序数组中找出两个数，使它们的和为 target。
 * 解决思路：双指针遍历法，一个从小到大遍历，一个从大到小遍历，
 * 如果这两个指针指向的元素和为目标值，返回这两个指针
 * 如果比目标值小，则从小到大遍历的指针往前走
 * 如果比目标值大，则从大到小遍历的指针往后走。
 */

public class TwoSum {
    public static int i = 0;

    public int[] twoSum(int[] numbers, int target){
        if(numbers == null) return null;
        int z = 0; int j = i - 2;
        while (z < j){
            int sum = numbers[z] + numbers[j];
            if(sum == target) return new int[]{z+1,j+1};
            else if(sum < target) z++;
            else j--;
        }
        return null;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[1000000];
        int count = 0;
        while ( -1 != count){
            count = scanner.nextInt();
            num[i] = count;
            i++;
        }
        System.out.println("输入目标数字: ");
        int target = scanner.nextInt();
        TwoSum twoSum = new TwoSum();
        int[] r = twoSum.twoSum(num,target);
        for(int x = 0; x < 2; x++){
            System.out.println(r[x]);
        }
    }
}
