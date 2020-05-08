package IntToRoman;

import java.util.Scanner;

/**
 * @Author: lirito
 * @Date: 2020/4/23 10:38
 * @Version：
 * @Description：解决思路：重点知道公式就可以了，数字最大是4000，那就知道1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,100,200
 *                      一直到3000
 */

public class Solution {
    public String intToRoman(int num){
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int sc = scanner.nextInt();
            Solution solution = new Solution();
            System.out.println(solution.intToRoman(sc));
        }
    }
}
