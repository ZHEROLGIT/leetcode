package LongestWord;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lirito
 * @Date: 2020/5/21 18:47
 * @Version：
 * @Description：这一题的题目就是要求返回最长的最小字典序的字符串。首先我们可以先写个是否是子序列的判断方法。
 * 通过双指针方法，相同则目标字符串往前移动一格。另外一个字符串保持一直前移。
 * 之后再来看看主体函数，我们可以将list的字符串看成是目标函数，然后和s比较，但是有个问题就是，什么时候去比较
 * 那就是涉及到一个判断条件。我们将结果放到一个字符串s中，因为对于判断是否去做子序列的比较的条件比较难确定，所以
 * 们从反方向考虑，当s长度大于目标字符串长度，或者二者长度一样，但是s字典序小于目标函数，那么我们不做处理，直接下一次循环
 * 那不满足这个套件，我们去做子序列判断，并且把得到的值放到s中。从而问题得以求解。
 */

public class LongestWord {
    public String findLongestWord(String s, List<String> d) {
        String longestWord = "";
        for(String target : d){
            int l1 = longestWord.length();
            int l2 = target.length();
            if(l1 > l2 || (l1 == l2 && longestWord.compareTo(target) < 0)){
                continue;
            }
            if(isSubstr(s,target)){
                longestWord = target;
            }
        }
        return longestWord;
    }

    private boolean isSubstr(String s, String target){
        int i = 0; int j = 0;
        while (i < s.length() && j <target.length()){
            if(s.charAt(i) == target.charAt(j)){
                j++;
            }
            i++;
        }
        return j == target.length();
    }

    public static void main(String[] args){
        String s = "abpcplea";
//        String target = "aabcde";
        List<String> list = new ArrayList<>();
        list.add(0,"ale");
        list.add(1,"apple");
        list.add(2,"monkey");
        list.add(3,"plea");
//        list.add(3,"awefe");
//        list.add(3,"ewafeffewafewf");
//        System.out.println(list.get(0).length());
        LongestWord longestWord = new LongestWord();
//        System.out.println(longestWord.isSubstr(s,target));
        System.out.println(longestWord.findLongestWord(s,list));
//        double a = Math.pow(2,16);
//        System.out.println(a);
    }
}
