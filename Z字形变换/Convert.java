import java.util.ArrayList;
import java.util.List;

/**
 * @file_name: Convert
 * @Description：6
 * @author: 张磊
 * @date: 七月 2018/7/23 16:00
 * @version：
 */
public class Convert {
    public String convert(String s, int numRows) {
        /** 思路：考虑特殊情况，numRows为1，则返回本身。
         *       其次就是两层循环，类比二维数组，通过二维数组的下标，来对应到字符串的位置，然后把满足
         *       各个条件的字符放到对应的位置。
         * 对应关系：i为外层，j为内层，
         * 则[i][j] 对应到 j + numRows + numRows - 2 - i 位置 或者 i + j
         */
        StringBuilder sb = new StringBuilder();
        int n = 2 * numRows - 2;
        int length = s.length();
        if(numRows == 1) return s;
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j + i < length; j += n){
                sb.append(s.charAt(i + j));
                if(i != 0 && i != numRows - 1 && j + n - i < length){
                    sb.append(s.charAt(j + n - i));
                }
            }
        }
        return sb.toString();
/*********************  对字符进行分割放到数组里面，时间超时， *********************************/
//        StringBuffer sb = new StringBuffer();
//        int n = numRows - 3;
//        String[][] a = new String[100][100];
//        for(int j = 1; j <= numRows; j++){
//            for(int i = j - 1; i < s.length(); i = i + numRows + numRows - 2){
//                a[j][i] = s.substring(i,i+1);
//                System.out.println("j的值: " + j + " i的值: " + i + " 结果：" + a[j][i]);
//            }
//            if(n > -1 && j > 1){
//                for(int i = numRows + n; i < s.length(); i = i + numRows + numRows - 2){
//                    a[j][i] = s.substring(i,i+1);
//                    System.out.println("j的值: " + j + " i的值: " + i + " 结果：" + a[j][i]);
//                }
//                n--;
//            }
//            for(int i = 0; i < s.length(); i++){
//                if(a[j][i] != null){
//                    sb.append(a[j][i]);
//                }
//            }
//        }
//        String result = sb.toString();
//        return result;
    }

    public static void main(String[] args){
        Convert convert = new Convert();
        String s = "PAYPALISHIRING";
        System.out.println(convert.convert(s,4));
    }
}
