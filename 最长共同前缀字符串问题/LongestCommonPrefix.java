package LongestCommonPrefix;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: lirito
 * @Date: 2020/5/7 19:09
 * @Version：
 * @Description：
 */

public class LongestCommonPrefix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("EOF")){
            String sc = scanner.next();
            HashMap<Integer,String > maps = new HashMap<>();
            for(int i = 0; sc != null; i++){
                maps.put(i,sc);
            }
            System.out.println(maps);
        }
    }
}
