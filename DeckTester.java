/**
*Title: Elevens Lab
*@author Aika Washington
*@since 07 December 2017
*@version 1.0
*Description: This is a program that will allow the user to play a virtual card game called Elevens.  
*Honor Code: On my honor, I have neither given nor received any unauthorized aid on this assignment. Aika Washington  
*/



/**
*  This is a class that tests the Deck class.
*/
public class DeckTester 
{
/** 
* The main method in this class checks the Deck operations for consistency. 
*    @param args is not used. 
*/
public static void main(String[] args) 
   {
   
   /*
   * Creating a new Deck array list to test
   * the deck class.
   */

   System.out.println("deck52");
   String[] ranks52 = {"ace", "2","3","4","5","6","7","8","9","10","jack", "queen", "king"};
   String[] suits52 = {"spades", "clubs", "diamonds", "hearts" };
   int[] pointValues52 = {1, 2, 3, 4, 5, 6, 7, 8, 9,10, 11, 12, 13};
   Deck deck52 = new Deck(ranks52, suits52, pointValues52);
   System.out.println("The size of the the deck should be 52. The size is: " +deck52.size());
   System.out.println("The deck is not empty, so false should print. The deck is empty: " +deck52.isEmpty());
   System.out.println("The card dealt shoulde be 4 of spades, and it is: " +deck52.deal());
   System.out.println(deck52);
   deck52.shuffle();
   System.out.println(deck52+ "\n");
   
    
   /*
   * Creating a new Deck array list to test
   * the deck class.
   */

   
   System.out.println("deck01");
   String[] ranks = {"Queen", "5", "King"};
   String[] suits = {"Clubs", "Spades", "Diamonds"};
   int[] pointValues = {12, 5, 13};
   Deck deck01 = new Deck(ranks, suits, pointValues);
   System.out.println("The size of the the deck should be 9. The size is: " +deck01.size());
   System.out.println("The deck is not empty, so false should print. The deck is empty: " +deck01.isEmpty());
   System.out.println("The card dealt should be King of Diamonds, and it is: " +deck01.deal());
   System.out.println(deck01+ "\n");
   deck01.shuffle();
   System.out.println(deck01+ "\n");
   
    
   /*
   * Creating a new Deck array list to test
   * the deck class.
   */
   
   System.out.println("deck02");
   String[] ranks02 = {};
   String[] suits02 = {};
   int[] pointValues02 = {};
   Deck deck02 = new Deck(ranks02, suits02, pointValues02);
   System.out.println("The size of the the deck should be 0. The size is: " +deck02.size());
   System.out.println("The deck is empty, so true should print. The deck is empty: " +deck02.isEmpty());
   System.out.println(deck02+ "\n");
   deck02.shuffle();
   System.out.println(deck02+ "\n");
   
    
   /*
   * Creating a new Deck array list to test
   * the deck class.
   */

   
   System.out.println("deck03");
   String[] ranks03 = {"Jack", "3", "6", "9", "Ace"};
   String[] suits03 = {"Diamonds", "Diamonds", "Spades", "Hearts", "Clubs" };
   int[] pointValues03 = {11, 3, 6, 9, 1};
   Deck deck03 = new Deck(ranks03, suits03, pointValues03);
   System.out.println("The size of the the deck should be 24. The size is: " +deck03.size());
   System.out.println("The deck is not empty, so false should print. The deck is empty: " +deck03.isEmpty());
   System.out.println("The card dealt shoulde be Ace of Clubs, and it is: " +deck03.deal());
   System.out.println(deck03+ "\n");
   deck03.shuffle();
   System.out.println(deck03+ "\n");
   
    
   /*
   * Creating a new Deck array list to test
   * the deck class.
   */

   
   System.out.println("deck04");
   String[] ranks04 = {"jack", "queen", "king"};
   String[] suits04 = {"blue", "red" };
   int[] pointValues04 = {11, 12, 13};
   Deck deck04 = new Deck(ranks04, suits04, pointValues04);
   System.out.println("The size of the the deck should be 6. The size is: " +deck04.size());
   System.out.println("The deck is not empty, so false should print. The deck is empty: " +deck04.isEmpty());
   System.out.println("The card dealt shoulde be king of red, and it is: " +deck04.deal());
   System.out.println(deck04);
   deck04.shuffle();
   System.out.println(deck04+ "\n");
   
   System.out.println("END RUN");

   }


}