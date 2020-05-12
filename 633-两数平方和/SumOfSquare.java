package SumofSquareNumbers;

import java.util.Scanner;

/**
 * @Author: lirito
 * @Date: 2020/5/12 15:44
 * @Version：
 * @Description：判断一个非负整数是否为两个整数的平方和。
 * @解决思路：此题和167题目类似，只不过将边界换成了输入的c，基本的解决方法和167一样，不过需要
 * 注意的是，不能按部就班的取c作为最大值，不然会超时，在此类题目中，可以将c的平方根作为最大值。
 * 同时也要考虑到，一个数可能由相同的数的平方组成。例如2 = 1 * 1 + 1 * 1；
 */

public class SumOfSquare {
    public boolean judgeSquareSum(int c) {
        int i = 0; int j = (int)Math.sqrt(c);
        while(i <= j){
            int sum = i * i + j * j;
            if(sum == c) return true;
            else if (sum < c) i++;
            else j--;
        }
        return false;
    }

    public static void main(String[] args){
        SumOfSquare sumOfSquare = new SumOfSquare();
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        System.out.println(sumOfSquare.judgeSquareSum(c));
    }
}
