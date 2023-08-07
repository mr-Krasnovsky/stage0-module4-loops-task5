package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        String[][] result = new String[cathetusLength][cathetusLength];
        if (cathetusLength == 0) {
            System.out.print("");
        } else {
            for (int i = 0; i < cathetusLength; i++) {
                for (int j = 0; j < cathetusLength; j++) {
                    if (j <= i) {
                        result[i][j] = "8";
                    } else {
                        result[i][j] = " ";
                    }
                }
            }
            for (String[] line: result) {
                for (String str : line) {
                    System.out.print(str);
                }
                System.out.println();
            }
        }
    }
}
