import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        //System.out.print("*");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfStars = 1;
        int numOfLines = 0;
        int curLineNum = 1;

        System.out.println("Enter an integer");
        try {
            //numOfStars = Integer.parseInt(br.readLine());
            numOfLines =Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

//        while (numOfStars != 0) {
//            System.out.print("*");
//            numOfStars--;
//        }

//        while (numOfStars != 0) {
//            System.out.println("*");
//            numOfStars--;
//        }
          while (curLineNum <= numOfLines) {
              for (int i = 1; i <= curLineNum; i++){
                  System.out.print("*");
              }
              System.out.println("");
              curLineNum++;
          }




    }
}
