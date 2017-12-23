/****************************************************************************
 *
 * Created on : 21 Dec. 2017
 * Created for : ICS3UR
 * Daily Assignment - Unit5-05
 * This program calculates the average of a 2d array, made by the user
 *
 ****************************************************************************/
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class twoDArray {    
     public static int[][] MakeArray (int rows, int columns)
     {
          if ((rows < 0) || (columns <0))
          {
               int [][] ReturnError = new int[Math.abs(rows)][Math.abs(columns)];
               for (int errorr = 0; errorr < ReturnError.length; errorr++)
               {
                    for (int errorc = 0; errorc < ReturnError[errorr].length; errorc++)
                    {
                         ReturnError[errorr][errorc] = -1;
                     }
                }
        
               return ReturnError;
           }    
          else
          {
               //Make the array
               int[][] TheDoubleArray = new int[rows][columns];
    
               Random rand = new Random();
               int max = 50+1;
               int min = 1;
               //int random_number = 0;
               for (int rowcounter = 0; rowcounter < TheDoubleArray.length; rowcounter++)
               {
                    for (int columncounter = 0; columncounter < TheDoubleArray[rowcounter].length; columncounter++)
                    {
                         TheDoubleArray[rowcounter][columncounter] = rand.nextInt(max - min) + min;
                      }    
                 } 
    
               return TheDoubleArray;
          }              
     }
    
    public static double AverageOfDoubleArray (int[][] twodimensionalarray)
    {
         int QuantityOfNumbers = twodimensionalarray.length * twodimensionalarray[0].length;
         int total = 0;
         for (int rowcount = 0; rowcount < twodimensionalarray.length; rowcount ++)
         {
              for (int columncount = 0; columncount < twodimensionalarray[rowcount].length; columncount++)
              {
                   total = total + twodimensionalarray[rowcount][columncount];
                }
          }
         double the_average = total / QuantityOfNumbers;
        
         return the_average;
    }
    
    public static void main(String[] args)
    {
         // Instructions for the user
         System.out.println("Enter the number of rows you would like.");    
         
         // Input
         Scanner problem = new Scanner(System.in);
         int NumberOfRows = (problem.nextInt());
         System.out.println("Enter the number of columns you would like.");
         int NumberOfColumns = (problem.nextInt());    
       
         // Make and show array
         int[][] DoubleArray = twoDArray.MakeArray(NumberOfRows, NumberOfColumns);
         System.out.println("Your numbers:");
         for (int rcount = 0; rcount < DoubleArray.length; rcount++)
         {
              StringBuilder ShowArray = new StringBuilder();
              for (int ccount= 0; ccount < DoubleArray[rcount].length; ccount++)
             {
                  ShowArray.append(DoubleArray[rcount][ccount] + ", ");
              }
              System.out.println(ShowArray);
          }       
         // Calculates and shows average
         double array_average = twoDArray.AverageOfDoubleArray(DoubleArray);
         System.out.println("The average is: " + array_average);            
    }
}
