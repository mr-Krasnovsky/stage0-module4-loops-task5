package school.mjc.stage0.loops.task5;

import java.util.Arrays;

public class Square {
    public void printSquareFrom8s(int sideLength){
        String [][] result = new String[sideLength][sideLength];
        if (sideLength == 0) {
            System.out.print("");
        } else {
            for (int i = 0; i < sideLength; i++) {
                for (int j = 0; j < sideLength; j++) {
                    if (i != 0 && i != sideLength - 1  && j != 0 && j != sideLength - 1) {
                        result[i][j] = " ";
                    } else {result[i][j] = "8";}
                }
            }
            for (String resultStr[]: result){
                for (String str: resultStr){
                    System.out.print(str);
                }
                System.out.println();
            }
        }
    }
}
