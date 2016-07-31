/**
 * Created by Aarushi on 30/07/2016.
 */
public class Diamond {

    private static final String NAME = "Aarushi";

    public Diamond() {

    }

    public void printIsoscelesTriangle(int numOfLines) {
        for (int i=0; i<numOfLines; i++) { //for each column
            for (int k=0; k<numOfLines-i; k++) { //prints a space up to one less comlumn than previous iteration
                System.out.print(" ");
            }
            for (int j=0; j<i*2+1; j++) { //number of stars is row number times 2 + 1.... to get 1,3,5,7 etc pattern
                System.out.print("*");
            }
            System.out.println(""); //next line
        }

    }


    public void printDiamond(int numofLines) { //printing a diamond
        printIsoscelesTriangle(numofLines);
        printInvertedTriangle(numofLines);
    }

    public void printDiamondName(int numOfLines) {
        printIsoscelesTriangle(numOfLines-1);
        System.out.println(NAME);
        printInvertedTriangle(numOfLines);
    }

    private void printInvertedTriangle(int numOfLines) { //inverted triangle
        for (int i=(numOfLines-2); i>=0; i--) { //minus 2, to skip middle line
            for (int k=0; k<numOfLines-i; k++) { //prints a space up to one less comlumn than previous iteration
                System.out.print(" ");
            }
            for (int j=0; j<i*2+1; j++) { //number of stars is row number times 2 + 1.... to get 1,3,5,7 etc pattern
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
