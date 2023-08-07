package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = height; i > 0; i -= 2) {
            printLine(i, height);
            System.out.println();
        }
        if (height % 2 != 0) {
            for (int i = 3; i <= height; i += 2) {
                printLine(i, height);
                System.out.println();

            }
        } else {
            for (int i = 2; i <= height; i += 2) {
                printLine(i, height);
                System.out.println();
            }
        }
    }

    public void printLine(int index, int height) {
        if (index == height) {
            for (int i = 0; i < height; i++) {
                System.out.print("8");
            }
        } else if (index > 0) {
            for (int i = 0; i < (height - index) / 2; i++) {
                System.out.print(" ");
            }
            for (int k = (height - index) / 2; k < index + (height - index) / 2; k++) {
                System.out.print("8");
            }
            for (int j = index + (height - index) / 2; j < height; j++) {
                System.out.print(" ");
            }
        }
    }
}
