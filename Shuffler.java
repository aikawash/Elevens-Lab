/**
*Title: Elevens Lab
*@author Aika Washington
*@since 07 December 2017
*@version 1.0
*Description: This is a program that will allow the user to play a virtual card game called Elevens.  
*Honor Code: On my honor, I have neither given nor received any unauthorized aid on this assignment. Aika Washington  
*/


/**
*  This class provides a convenient way to test shuffling methods.
*/
public class Shuffler 
{
/** 
* The number of consecutive shuffle steps to be performed in each call 
* to each sorting procedure. 
*/
private static final int 
SHUFFLE_COUNT = 6;
/** 
* The number of values to shuffle. 
*/
private static final int 
VALUE_COUNT = 52;
/** 
* Tests shuffling methods. 
* @param args is not used. 
*/
public static void main(String[] args) 
{
        System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive perfect shuffles:");
        int[] values1 = new int[VALUE_COUNT];
        for (int i = 0; i < values1.length; i++) 
            {
            values1[i] = i;
            }
        for (int j = 1; j <= SHUFFLE_COUNT; j++) 
            {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) 
                {
                System.out.printf(" %2d", values1[k]);
                }
            System.out.println();
            }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive efficient selection shuffles:");
        int[] values2 = new int[VALUE_COUNT];
        for (int i = 0; i < values2.length; i++) 
            {
            values2[i] = i;
            }
        for (int j = 1; j <= SHUFFLE_COUNT; j++) 
            {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
                for (int k = 0; k < values2.length; k++) 
                {
                System.out.printf(" %2d", values2[k]);
                }
            System.out.println();
        }
        System.out.println();
    } /** 
 * Apply a "perfect shuffle" to the argument. 
 * The perfect shuffle algorithm splits the deck in half, then interleaves 
 * the cards in one half with the cards in the other. 
 * @param values is an array of integers simulating cards to be shuffled.
 */
 public static void perfectShuffle(int[] values) 
 { 
   
   //populate the array
   //size is on on array lists, need to use .length
   int[] shuffled = new int[VALUE_COUNT]; 
   for (int i=0; i < values.length; i++)
      {
    shuffled[i] = values[i];
      }
   
   
  int pos;
  int mid;
  int[] temp = new int[VALUE_COUNT];
 

  
  mid = shuffled.length /2;
  
  for(int k=0; k<53; k++)
  
  {
 
    pos = 0;
  
        for (int i =0; i< mid; i++)
         {
         temp[pos] = values[i];
         pos +=2;
         }
   
    pos = 1;
        for (int i =mid; i< shuffled.length; i++)
         {
         temp  [pos] = values[i];
         pos +=2;
         }
   
   for (int i =0; i< shuffled.length; i++)
      values[i] = temp[i];
  }
   
  
  
  
      
  
  }
 /** 
 * Apply an "efficient selection shuffle" to the argument. 
 * The selection shuffle algorithm conceptually maintains two sequences 
 * of cards: the selected cards (initially empty) and the not-yet-selected 
 * cards (initially the entire deck). It repeatedly does the following until 
 * all cards have been selected: randomly remove a card from those not yet 
 * selected and add it to the selected cards. 
 * An efficient version of this algorithm makes use of arrays to avoid 
 * searching for an as-yet-unselected card. 
 * @param values is an array of integers simulating cards to be shuffled. 
 */
 public static void selectionShuffle(int[] values) 
 {
 int[] shuffled = new int[VALUE_COUNT]; 

 for(int i=0; i<values.length-1; i++)
   {
   shuffled[i] = values[i];
   }
 
 int counter = VALUE_COUNT - 1; 
    int randomInt; 
    int temp; 
     
    for (counter=counter; counter>1; counter--)
      { 
      randomInt = (int)( Math.random() * VALUE_COUNT); 
      temp = values[counter]; 
      values[counter] = values[randomInt]; 
      values[randomInt] = temp; 
      
      }
 
}

}
