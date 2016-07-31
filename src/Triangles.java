import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Aarushi on 29/07/2016.
 */
public class Triangles {

    private static int curLineNum = 1;
    private int choice;
    private int userNumber;

    public Triangles() {

    }



    public void printSingleStar() {
        System.out.print("*");
    }

    public void printVerticalLine(int numOfStars) {
        while (numOfStars != 0) {
            System.out.println("*");
            numOfStars--;
        }
    }

    public void printHorizontalLine(int numOfStars) {
        while (numOfStars != 0) {
            System.out.print("*");
            numOfStars--;
        }
    }

    public void printRightTriangle(int numOfLines) {
        while (curLineNum <= numOfLines) {
            for (int i = 1; i <= curLineNum; i++){
                System.out.print("*");
            }
            System.out.println("");
            curLineNum++;
        }
    }
}
