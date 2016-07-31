import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        int userChoice = -1;
        Triangles triangles = new Triangles();
        Diamond diamond = new Diamond();
        Number number = new Number();

        while(userChoice != 0) {
            printMainMenu();

            userChoice = getInteger();


            switch (userChoice) {
                case 0:
                    System.exit(0);
                case 1:
                    triangles.printSingleStar();
                    break;
                case 2:
                    System.out.println("Enter an integer");
                    triangles.printVerticalLine(getInteger());
                    break;
                case 3:
                    System.out.println("Enter an integer");
                    triangles.printHorizontalLine(getInteger());
                    break;
                case 4:
                    System.out.println("Enter an integer");
                    triangles.printRightTriangle(getInteger());
                    break;
                case 5:
                    System.out.println("Enter an integer");
                    diamond.printIsoscelesTriangle(getInteger());
                    break;
                case 6:
                    System.out.println("Enter an integer");
                    diamond.printDiamond(getInteger());
                    break;
                case 7:
                    System.out.println("Enter an integer");
                    diamond.printDiamondName(getInteger());
                    break;
                case 8:
                    number.fizzBuzz();
                    break;
                case 9:
                    System.out.println("Enter an integer");
                    number.generate(getInteger());
                    break;
                default:
                    System.out.println("Choose an integer between 0 and 9");
                    break;
            }
        }


    }

    private static int getInteger() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int userInt = 0;
        try {
            userInt =Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userInt;
    }

    private static void printMainMenu() {
        System.out.println("\n Choose an exercise: \n 1:Print single star \n 2:Print vertical line \n 3:Print horizontal line \n " +
                "4:Print right angle triangle \n 5:Print isosceles triangle \n 6:Print diamond \n 7:Print diamond with name \n " +
                "8:Run FizzBuzz \n 9:Generate prime factors \n 0:Quit");
    }



}
