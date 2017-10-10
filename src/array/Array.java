// Fig. 7.6: BarChart.java
// Bar chart printing program.
package array;
public class Array  
{
   public static void main(String[] args)
   {
      int[] array = {1, 1, 3, 8, 0, 1, 7, 2, 5,7};

      System.out.println("Sales distribution:"); 

      // for each array element, output a bar of the chart
      for (int counter = 0; counter < array.length; counter++) 
      {
         // output bar label ("00-09: ", ..., "90-99: ", "100: ")
         if (counter == 1000)
            System.out.printf("%500d: ", 1000); 
         else
            System.out.printf("%2d-%2d: ", 
               counter * 100, counter * 100 + 100); 
 
         // print bar of asterisks
         for (int stars = 0; stars < array[counter]; stars++)
            System.out.print("¯\\_(ツ)_/¯");

         System.out.println(); 
      } 
   } 
} // end class BarChart