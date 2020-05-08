package mostWater;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: lirito
 * @Date: 2020/4/15 16:10
 * @Version：
 * @Description：
 */

public class MostWater {

    int print(List<Integer> a){
        int max = 0;
        for(int i = 0; i < a.size(); i++){
            for(int j = i + 1; j < a.size(); j++){
                max = Math.max(max,Math.abs(j-i) * Math.min(a.get(i),a.get(j)));
            }
        }
        return max;
    }

    public static void main(String[] args){
        MostWater mostWater = new MostWater();
        //输入
        Scanner scanner1 = new Scanner(System.in);
        int max = 0;
        List<Integer> array = new ArrayList<Integer>();
        while (!scanner1.hasNext("EOF")) {
            array.add(scanner1.nextInt());
            max = mostWater.print(array);
        }
        System.out.println(max);
    }
}


