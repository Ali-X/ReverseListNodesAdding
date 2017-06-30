import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reader.readLine().split(" ");
        findDistance(numbers);
    }

    private static void findDistance(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int smallestPlace = 0;
        int secondSmallestPlace = 0;
        int temp = 0;
        for (int i = 0; i < args.length; i++) {
            temp = Integer.parseInt(args[i]);
            if (temp == smallest) {
                secondSmallest = smallest;
                secondSmallestPlace = smallestPlace;
            } else if (temp < smallest) {
                secondSmallest = smallest;
                smallest = temp;
                secondSmallestPlace = smallestPlace;
                smallestPlace = i;
            } else if (temp < secondSmallest) {
                secondSmallest = temp;
                secondSmallestPlace = i;
            }
        }
        System.out.println("Distance = " + Math.abs(smallestPlace - secondSmallestPlace));
    }
}
