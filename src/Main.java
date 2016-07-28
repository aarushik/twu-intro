import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        //System.out.print("*");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfStars = 0;

        System.out.println("Enter an integer");
        try {
            numOfStars = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (numOfStars != 0) {
            System.out.print("*");
            numOfStars--;
        }

    }
}
