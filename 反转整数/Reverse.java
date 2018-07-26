/**
 * @file_name: Reverse
 * @Description：
 * @author: 张磊
 * @date: 七月 2018/7/26 9:35
 * @version：
 */
public class Reverse {
    /**
     * 思路：这个题目的主要难点是在判断这个是否溢出，其中涉及到的变量就是pop和rev
     * 最大的数是2147483647，最小的数是-2147483648
     * @param x
     * @return rev
     */
    public int reverse(int x){
        int rev = 0;
        while(x!=0){
            int pop = x % 10;
            x /= 10;
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop > 7)) return 0;
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args){
        Reverse reverse = new Reverse();
        System.out.println("结果：" + reverse.reverse(-2147483648));
    }
}
