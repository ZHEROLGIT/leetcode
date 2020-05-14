package ReverseVowelsofaString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author: lirito
 * @Date: 2020/5/12 17:20
 * @Version：
 * @Description：反串字符串中的元音字符。
 * 我的解决思路：将需要的元素放到map里面，然后还是双指针问题，一个从左边匹配，一个从右边匹配，左边没有匹配到的数据往前加一
 * 右边没有匹配到的往后减一，同时匹配到的，前加一，后减一，同时进行位置的互换。
 * 别人的解决思路：将目标元素放到list里面。然后从左到右，从右到左匹配。
 */

public class ReverseVowelsofaString {
    private final static HashSet<Character> goals = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

    public String reverseVowels(String s){
        if(s == null) return null;
        int i = 0; int j = s.length() - 1;
        char[] result  = new char[s.length()];
        while (i <= j){
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if(!goals.contains(ci)){
                result[i++] = ci;
            }else if(!goals.contains(cj)){
                result[j--] = cj;
            }else {
                result[i++] = cj;
                result[j--] = ci;
            }
        }
        return new String(result);
    }
//    public String reverseVowels(String s) {
//        StringBuilder str = new StringBuilder(s);
//        char[] st = s .toCharArray();
//        HashMap<String,Integer> maps = new HashMap();
//        maps.put("a",1);
//        maps.put("e",1);
//        maps.put("i",1);
//        maps.put("o",1);
//        maps.put("u",1);
//        maps.put("A",1);
//        maps.put("E",1);
//        maps.put("I",1);
//        maps.put("O",1);
//        maps.put("U",1);
//        int i = 0;
//        int j = s.length() - 1;
//        while(i <= j){
//            if(maps.get(String.valueOf(st[i])) == null){
//                i++;
//            }else if(maps.get(String.valueOf(st[j])) == null){
//                j--;
//            }else if(maps.get(String.valueOf(st[i])) == 1 && maps.get(String.valueOf(st[j])) == 1){
//                str.replace(i,i+1,String.valueOf(st[j]));
//                str.replace(j,j+1,String.valueOf(st[i]));
//                i++;
//                j--;
//            }
//        }
//        System.out.println(str.toString());
//        return st.toString();
//    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        ReverseVowelsofaString reverseVowelsofaString = new ReverseVowelsofaString();
        reverseVowelsofaString.reverseVowels(s);
    }
}
