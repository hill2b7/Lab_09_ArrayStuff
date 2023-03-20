import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int ARRAY_SIZE = 100;
        int [] dataPoints = new int[ARRAY_SIZE]; //declares array
        double sum = 0;
        double average = 0;
        Scanner in = new Scanner(System.in);

        for (int x = 0; x < dataPoints.length; x++)
        {
            dataPoints[x] = rnd.nextInt(ARRAY_SIZE) + 1;
            System.out.printf("%5d", dataPoints[x]);
            if (x % 20 == 0 && x > 0)
            {
                System.out.println("");
            }
        }
        System.out.println(" ");

        for (int x = 0; x < dataPoints.length; x++)
        {
            System.out.printf("val" + (x + 1) + " " + dataPoints[x] + " | ");
            if (x % 20 == 0 && x > 0)
            {
                System.out.println("");
            }
        }
        System.out.println(" ");

        for (int x = 0; x < dataPoints.length; x++)
        {
            sum = sum + dataPoints[x];
            average = sum / ARRAY_SIZE;
        }
        System.out.println("The sum is of the random array is: " + sum);
        System.out.println("The average of the random array is: " + average);

    }
}