package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        String[][] result = new String[sideLength][sideLength];
        if (sideLength == 0) {
            System.out.print("");
        } else {
            for (int i = 0; i < sideLength; i++) {
                for (int j = 0; j < sideLength; j++) {
                    if (i == sideLength / 2 || j == sideLength / 2) {
                        result[i][j] = "8";
                    } else {
                        result[i][j] = " ";
                    }
                }
            }
            for (String[] line : result) {
                for (String str : line) {
                    System.out.print(str);
                }
                System.out.println();
            }
        }
    }
}
