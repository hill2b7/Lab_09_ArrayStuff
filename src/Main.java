import java.util.Arrays;
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
        int valueEntered = 0;
        Scanner in = new Scanner(System.in);

        for (int x = 0; x < dataPoints.length; x++)
        {
            dataPoints[x] = rnd.nextInt(ARRAY_SIZE) + 1;
            System.out.printf("%5d", dataPoints[x]);
            if (x % 20 == 0 && x > 0)
            {
                System.out.println(" ");
            }
        }
        System.out.println(" ");

        for (int x = 0; x < dataPoints.length; x++)
        {
            System.out.printf("val" + (x + 1) + " " + dataPoints[x] + " | ");
            if (x % 20 == 0 && x > 0)
            {
                System.out.println(" ");
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

        valueEntered = SafeInput.getRangedInt(in,"Enter a value to search for",1,100);
        boolean foundValue = false;
        int timesFound = 0;
        for (int x = 0; x < dataPoints.length; x++)
        {
            if (dataPoints[x] == valueEntered)
            {
                foundValue = true;
                System.out.println("The value " + valueEntered + " was found at index " + x);
                timesFound++;
            }

        }
        System.out.println("\nThe value you entered occurs " + timesFound + " times in the array set.");
        if (!foundValue)
        {
            System.out.println("The value " + valueEntered + " was not found within the array");
        }

        System.out.println("");

        for (int x = 0; x < dataPoints.length; x++)
        {
            if (dataPoints[x] == valueEntered)
            {
                foundValue = true;
                System.out.println("The value " + valueEntered + " was found at index " + x);
                break;
            }
            else if (!foundValue)
            {
                System.out.println("The value " + valueEntered + " was not found within the array. ");
                break;
            }




        }
        int min = dataPoints[0];
        int max = 0;

        for (int x = 0; x < dataPoints.length; x++)
        {
            if(min > dataPoints[x])
            {
                min = dataPoints[x];
            }
            if (max < dataPoints[x])
            {
                max = dataPoints[x];
            }
        }
        System.out.println("The minimum number of the array is " + min);
        System.out.println("The maximum number of the array is " + max);
        System.out.println("Average of dataPoints is: " +  getAverage(dataPoints));
    }
    public static double getAverage(int values[])
    {

        double sum = 0;
        double average = 0;

        for (int x = 0; x < values.length; x++)
        {
            sum = sum + values[x];
        }
        average = sum / values.length;
        System.out.println("The sum of the data set is " + sum);
        return average;
    }
}
