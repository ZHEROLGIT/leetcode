import java.util.Arrays;

/**
 * @file_name: LongestPalindrome
 * @Description：
 * @author: 张磊
 * @date: 七月 2018/7/15 15:26
 * @version：
 */

/**
 * zl解决思路：先是将字符串分解成数组，然后将比较的结果放到一个二维数组里面，因为是一个一个比较，最后排序二维数组，找到最大的值，并且返回
 * 答案的解题思路：采用动态规划的思想
 */
public class LongestPalindrome {
    public String longestPalindrome(String s){
        //记录回文数的起点和终点
        int start = 0;
        int end = 0;

        for(int i = 0; i <= s.length(); i++){
            int len1 = search(s,i,i);
            int len2 = search(s,i,i+1);
            int maxLen = Math.max(len1,len2);
            if(maxLen > end - start){
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }
        return s.substring(start,end + 1);
    }

    private int search(String s,int left,int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }


    public static void main(String[] args){
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String s = "cbbbcaaaac";
        System.out.println(longestPalindrome.longestPalindrome(s));
    }
}
