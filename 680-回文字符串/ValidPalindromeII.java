package ValidPalindromelI;

import java.util.Scanner;

/**
 * @Author: lirito
 * @Date: 2020/5/16 15:10
 * @Version：
 * @Description：回文字符串
 * 解题思路：我理解的是从头到尾，从尾到头遍历。然后对于存在的各种情况进行处理。
 * 不过这道题目却是提供了一种新的方式，他的主方法确实是从头到尾，从尾到头遍历。
 * 但是他对于存在的特殊情况，所做的做法是放到子方法去判断。（子方法的处理逻辑就是，判断删除后的数是不是可以构成回文，
 * 构不成的话，false，构成的话，true）。所以有了这个方法之后，我们的主方法就直接调用就好，修改下参数即可。
 * （其实也就是在特殊情况做处理的时候，把处理方式简化出来了，我之前写的不够简洁，但是提取出来也就是这个模板了）
 */

public class ValidPalindromeII {

    boolean validPalindrome(String s) {
        for(int i = 0,j = s.length() - 1; i < j; i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return isPalindrome(s,i,j-1) || isPalindrome(s,i + 1,j);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int i, int j){
        while (i < j){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        ValidPalindromeII v = new ValidPalindromeII();
        System.out.println(v.validPalindrome(s));
    }
}
