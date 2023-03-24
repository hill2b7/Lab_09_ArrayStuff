import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random(); // creates new random number generator
        int ARRAY_SIZE = 100; //constant for Array size
        int [] dataPoints = new int[ARRAY_SIZE]; //declares array
        double sum = 0; // variable declarations
        double average = 0; // variable declaration
        int valueEntered = 0; // variable declaration
        Scanner in = new Scanner(System.in); //creates new scanner

        for (int x = 0; x < dataPoints.length; x++) //for loop that will break once x is equal to or greater than the array length
        {
            dataPoints[x] = rnd.nextInt(ARRAY_SIZE) + 1; // sets the array to a random data point between 1-100
            System.out.printf("%5d", dataPoints[x]); // will print out a random data integer between 1 and 100
            if (x % 20 == 0 && x > 0) // if x is divisible by 20 then it will break off into a new line
            {
                System.out.println(" "); // new line break
            }
        }
        System.out.println(" "); // new line break

        for (int x = 0; x < dataPoints.length; x++) //for loop that will break once x is equal to or greater than the array length
        {
            System.out.printf("val" + (x + 1) + " " + dataPoints[x] + " | "); // print out of the data points with a label included in front of it
            if (x % 20 == 0 && x > 0)  // if x is divisible by 20 then it will break off into a new line
            {
                System.out.println(" "); // new line break
            }
        }
        System.out.println(" "); //new line break

        for (int x = 0; x < dataPoints.length; x++) //for loop that will run while x is less than array length
        {
            sum = sum + dataPoints[x]; // equation for sum that adds all random data points together
            average = sum / ARRAY_SIZE; //equation to get average of all data points
        }
        System.out.println("The sum is of the random array is: " + sum);
        System.out.println("The average of the random array is: " + average);

        valueEntered = SafeInput.getRangedInt(in,"Enter a value to search for",1,100); //sets valueentered to the safeinput received from the end user and the value must be between 1 and 100
        boolean foundValue = false; // boolean declaration
        int timesFound = 0; // variable declaration
        for (int x = 0; x < dataPoints.length; x++) //for loop that will run while x is less than array length
        {
            if (dataPoints[x] == valueEntered) //if statement that will run the code block below if true
            {
                foundValue = true; //this will cause a break in the loop
                System.out.println("The value " + valueEntered + " was found at index " + x); //print out that lets the user know that the data entered was found
                timesFound++; //counter that will increment each time the number is found
            }

        }
        System.out.println("\nThe value you entered occurs " + timesFound + " times in the array set."); // lets the user know how many times the value entered shows in the array
        if (!foundValue) // if statement that will run if the value was not found
        {
            System.out.println("The value " + valueEntered + " was not found within the array"); //output that lets the user know that the value entered was not found in the array set
        }

        System.out.println(""); // break new line

        for (int x = 0; x < dataPoints.length; x++) // for loop that will run while x is less than the array length
        {
            if (dataPoints[x] == valueEntered) // if statement that will run if a datapoint equals the value the user entered
            {
                foundValue = true;
                System.out.println("The value " + valueEntered + " was found at index " + x); //output that tells the user the value they entered was found at a specific index
                break; //force break out of loop
            }
            else if (!foundValue) // else if statement that will run if value is not found
            {
                System.out.println("The value " + valueEntered + " was not found within the array. "); //output that lets the user know the value entered was not found in the array
                break; //force break out of loop
            }




        }
        int min = dataPoints[0]; //variable declaration
        int max = 0; //variable declaration

        for (int x = 0; x < dataPoints.length; x++) //for loop that will run while x is less than array length
        {
            if(min > dataPoints[x]) //if statement that runs if min is greater than the array number
            {
                min = dataPoints[x]; // sets minimum number to the smallest number
            }
            if (max < dataPoints[x]) //if statement that runs if max is less than the array number
            {
                max = dataPoints[x];//sets max number to the largest number in the array
            }
        }
        System.out.println("The minimum number of the array is " + min); //lets user know the minimum number
        System.out.println("The maximum number of the array is " + max); //lets user know the maximum number
        System.out.println("Average of dataPoints is: " +  getAverage(dataPoints)); //lets user know the average of the array
    }
    public static double getAverage(int values[])
    {

        double sum = 0; // variable declaration
        double average = 0; //variable declaration

        for (int x = 0; x < values.length; x++) //for loop that runs while x is less than array length
        {
            sum = sum + values[x]; // adds up all of the items in the array
        }
        average = sum / values.length; //calculation for the average of the array
        System.out.println("The sum of the data set is " + sum); //lets user know what the sum is
        return average; //what the method will return
    }
}
