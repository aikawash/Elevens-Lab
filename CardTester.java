/**
*Title: Elevens Lab
*@author Aika Washington
*@since 07 December 2017
*@version 1.0
*Description: This is a program that will allow the user to play a virtual card game called Elevens.  
*Honor Code: On my honor, I have neither given nor received any unauthorized aid on this assignment. Aika Washington  
*/


/*
* This is a class that tests the Card class.
*
*/

public class  CardTester
{ 
/* 
* The main method in this class checks the Card operations for consistency. 
* @param args is not used. 
*/
   public static void main(String[] args)
   {
   /*
   * Creating a new Card object and calling
   * the suit method to show the suit,
   * rank method to show the rank, 
   * and point value to show the value.
   */
   
   System.out.println("card01");
   Card card01 = new Card("8","Spades",  8);
   System.out.println("The suit should be Spades, and it is: " +card01.suit());
   System.out.println("The rank should be 8, and it is: " +card01.rank());
   System.out.println("The point value is 8, and it should be: " +card01.pointValue());
   System.out.println(card01);
   
   
    /*
   * Creating a new Card object and calling
   * the suit method to show the suit,
   * rank method to show the rank, 
   * and point value to show the value.
   */

   System.out.println("\ncard02");
   Card card02 = new Card( "Jack","Hearts", 11);
   System.out.println("The suit should be Hearts, and it is: " +card02.suit());
   System.out.println("The rank should be Jack, and it is: " +card02.rank());
   System.out.println("The point value is 11, and it should be: " +card02.pointValue());
   System.out.println(card02);

   
   /*
   * Creating a new Card object and calling
   * the suit method to show the suit,
   * rank method to show the rank, 
   * and point value to show the value.
   */

   System.out.println("\ncard03");
   Card card03 = new Card( "Ace","Clubs", 1);
   System.out.println("The suit should be Clubs, and it is: " +card03.suit());
   System.out.println("The rank should be Ace, and it is: " +card03.rank());
   System.out.println("The point value is 1, and it should be: "+card03.pointValue());
   System.out.println(card03);

   /*
   * Creating a new Card object and calling
   * the suit method to show the suit,
   * rank method to show the rank, 
   * and point value to show the value.
   */

   
  
   System.out.println("\ncard04");
   Card card04 = new Card( "Jack","Hearts", 11);
   System.out.println("The suit should be Hearts, and it is: " +card04.suit());
   System.out.println("The rank should be Jack, and it is: " +card04.rank());
   System.out.println("The point value is 11, and it should be: " +card04.pointValue());
   System.out.println(card04);


   System.out.println("\ncard03 should print false if it does not match card02: " +card03.matches(card02));
   System.out.println("card02 should print true if it does match card04: " +card02.matches(card04));
   
    System.out.println("END RUN");

       
  
      
   }
}