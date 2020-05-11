package LongestCommonPrefix;

/**
 * @Author: lirito
 * @Date: 2020/5/7 19:09
 * @Version：
 * @Description：解决思路，java里面有个封装好的方法，indexOf,可以记录这个字符串是否出现过，且在哪出现过。
 * 那这样的话，我们就是先取数组第一个作为初始值，然后使用indexOf方法，将初始值和下一个值做匹配（0就是匹配上了，有这个字符串）。
 * 没有的话，截取字符串直到出现这个字符后，我们再去比较数组的下一个字符串。最终得到结果。
 */

public class LongestCommonPrefix {

    public static int i = 0;

    public String longestCommonPrefix(String[] strs) {
        String[] answer = new String[strs.length];
        for(int j = 0; j < i - 1; j++){
            answer[j] = "";
            for(int z = 0; z < Math.min(strs[j].length(),strs[j+1].length()); z++){
                if(strs[j].charAt(z) == strs[j+1].charAt(z)){
                    answer[j] = answer[j] + strs[j].charAt(z);
                }
            }
        }
        String a = answer[0];
        for(int x = 0; x < i - 1; x++){
            if(answer[x].length() < a.length() && answer[x].length() != 0){
                a = answer[x];
            }
        }
        System.out.println(a);
        return a;
    }

    /**
     * 官方解决方法
     * @param a
     * @return
     */
    public String v(String[] a){
        if(a == null || a.length == 0) return "";
        String pre = a[0];
        int j = 1;
        while (j < a.length){
            while (a[j].indexOf(pre) !=0){
                pre = pre.substring(0,pre.length() - 1);
            }
            j++;
        }
        return pre;
    }


    public static void main(String[] args){
//        String sc = "";
//        String[] str = new String[10000];
//        while (!"1".equals(sc)) {
//            Scanner scanner = new Scanner(System.in);
//            sc = scanner.next();
//            str[i] = sc;
//            i++;
//        }
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
//        longestCommonPrefix.longestCommonPrefix(str);
        String[] str = {"flower","flow","flight"};
        longestCommonPrefix.v(str);
    }
}

/**
 *     if(strs == null || strs.length == 0)    return "";
 *     String pre = strs[0];
 *     int i = 1;
 *     while(i < strs.length){
 *         while(strs[i].indexOf(pre) != 0)
 *             pre = pre.substring(0,pre.length()-1);
 *         i++;
 *     }
 *     return pre;
 */
