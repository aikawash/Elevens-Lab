/**
*Title: Elevens Lab
*@author Aika Washington
*@since 07 December 2017
*@version 1.0
*Description: This is a program that will allow the user to play a virtual card game called Elevens.  
*Honor Code: On my honor, I have neither given nor received any unauthorized aid on this assignment. Aika Washington  
*/


/**
 * Card.java
 *
 * The class Card represents a playing card.
 */
public class Card 
{

   /**
     * Creating a new instance variable to hold the suit
     * of the card
     */
    private String suit;

    /**
     * Creating a new instance variable to hold the rank
     *
     */
    private String rank;

    /**
     * Creating a new instance variable to hold the card's
     * point value
     */
    private int pointValue;

   /**
     * Creates a new Card instance.
     *
     * @param cardRank  a String variable
     *                  containing the rank of the card
     * @param cardSuit  a String variable
     *                  containing the suit of the card
     * @param card PointValue     an int variable
     *                            containing the point value of the card
     */
    public Card(String cardRank, String cardSuit, int cardPointValue) 
    {
        this.rank = cardRank;
        this.suit = cardSuit;
        this.pointValue = cardPointValue;
    }
   /**
     * 
     * @return the card's rank
     */
    public String rank() 
    
    {
        return this.rank;
    }



    /**
     * 
     * @return the card's suit
     */
    public String suit() 
    {
        return this.suit;
    }

       /**
     * 
     * @return the card's point value.
     */
    public int pointValue() 
    {
        return this.pointValue;
    }
  /**      
     * @param other Card the other card to compare to this
     * @return true if the rank, suit, and point value of this card
     *              are equal to those of the argument;
     *         false otherwise.
     */
    
    
      public boolean matches(Card cardTwo) 
    {
        if (this.pointValue == cardTwo.pointValue && this.rank.equals(cardTwo.rank)&& this.suit.equals(cardTwo.suit)    ) 
         {
           return true;
          }
        return false;
    }
   
     // public matches(Card cardTwo)

      // compare two cards, subtract them, if it is nge then    
         
         
      

    /**
     * Converts the rank, suit, and point value into
     * a nicely formatted string showing
     * the information about tne card
     * 
     * @return a String which the rank, suit,
     *         and point value of the card.
     */
    @Override
    public String toString()
     {
		return this.rank + " of " + this.suit + "( Point value: " + this.pointValue+ " )";
	  }
}