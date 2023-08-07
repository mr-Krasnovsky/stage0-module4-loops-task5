package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i = height; i > 0; i--){
            for (int j = length; j > 0; j--){
                if (i != 1 && i != height && j != 1 && j != length){
                    System.out.print(" ");
                } else {
                    System.out.print("8");
                }
            } System.out.println();
        }
    }
}
