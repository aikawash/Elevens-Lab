/**
*Title: Elevens Lab
*@author Aika Washington
*@since 07 December 2017
*@version 1.0
*Description: This is a program that will allow the user to play a virtual card game called Elevens.  
*Honor Code: On my honor, I have neither given nor received any unauthorized aid on this assignment. Aika Washington  
*/



import java.util.List;
import java.util.ArrayList;
/***  
*The Deck class represents a shuffled deck of cards.
*  It provides several operations including
*  initialize, shuffle, deal, and check if empty.
*/
public class Deck
 {
 /** 
 * cards , a list, contains all the cards in the deck. 
 */
 private ArrayList<Card> cards;
 /** 
 * size is the number of not-yet-dealt cards. 
 * Cards are dealt from the top (highest index) down. 
 * The next card to be dealt is at size - 1. 
 */
 private int size;
 /**
 * Creates a new <code>Deck</code> instance.<BR> 
 * It pairs each element of ranks with each element of suits, 
 * and produces one of the corresponding card. 
 * @param ranks is an array containing all of the card ranks. 
 * @param suits is an array containing all of the card suits. 
 * @param values is an array containing all of the card point values. 
 */
 public Deck(String[] ranks, String[] suits, int[] values)
   {
         this.cards = new ArrayList<Card>();
         for (int s = 0; s < suits.length; s++) 
            {
                for(int r =0; r < ranks.length; r++)
                {
                  Card singleCard = new Card(ranks[r],suits[s],values[r]);
                  this.cards.add(singleCard);
                }
            }
         this.size = this.cards.size();



        shuffle();
    } 
 /** 
 * Determines if this deck is empty (no undealt cards). 
 * @return true if this deck is empty, false otherwise. 
 */
 public boolean isEmpty()
   {
        if (this.cards.size() == 0) 
        {
            return true;
        }
        return false;
    }
  /** 
  * Accesses the number of undealt cards in this deck. 
  * @return the number of undealt cards in this deck. 
  */
  public int size()
   {
        return this.cards.size();
    }
   /**
   * Randomly permute the given collection of cards 
   * and reset the size to represent the entire deck. 
   */
   public void shuffle() 
   {
   
   
   Card tempCard;
   for(int x=size-1; x>=0;x--)
      {
      int random = (int)(Math.random()*x);
      tempCard = cards.get(random);
      cards.set(random, cards.get(x));
      cards.set(x, tempCard);
      }
   /**
   for(int n= cards.size()-1; n> 0; n--)
      {
         int ranCardPos = (int) (Math.random() * (n+1));
         Card tempCard = cards.get(ranCardPos);
         cards.set(ranCardPos, cards.get(n));
      }
   **/
   
   }
   /** 
   * Deals a card from this deck. 
   * @return the card just dealt, or null if all the cards have been 
   *         previously dealt. 
   */
   public Card deal() 
   {
        this.size = this.size - 1;
        if (this.size > 0)
         {
            return this.cards.get(this.size);
         }
        return null;
    }
   /** 
   * Generates and returns a string representation of this deck. 
   * @return a string representation of this deck. 
   */
    @Override
    public String toString() 
    {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) 
            {
                rtn = rtn + cards.get(k);
                if (k != 0) 
                {
                    rtn = rtn + ", ";
                }
            if ((size - k) % 2 == 0) 
            {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}
