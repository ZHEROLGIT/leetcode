package RomanToInt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: lirito
 * @Date: 2020/5/7 10:51
 * @Version：
 * @Description：解决思路：就直接暴力就好了。打个断点，判断下特殊条件
 */

public class Solution {

    public int romanToInt(String s) {
        Map<String,Integer> maps = new HashMap<String,Integer>();
        maps.put("I",1);
        maps.put("V",5);
        maps.put("X",10);
        maps.put("L",50);
        maps.put("C",100);
        maps.put("D",500);
        maps.put("M",1000);
        char[] rom = s.toCharArray();
        int sum = 0;
        for(int i = 0; i < rom.length; i++){
            sum = sum + maps.get((String.valueOf(rom[i])));
            if(i != rom.length - 1 && (maps.get((String.valueOf(rom[i]))) < maps.get((String.valueOf(rom[i+1]))))){
                sum = sum + maps.get((String.valueOf(rom[i+1]))) - maps.get((String.valueOf(rom[i]))) - maps.get((String.valueOf(rom[i])));
                i = i + 1;
                continue;
            }
        }
        return sum;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String rom = sc.next();
            Solution solution = new Solution();
            System.out.println(solution.romanToInt(rom));
        }
    }
}
