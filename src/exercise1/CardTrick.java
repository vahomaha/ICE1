/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardgame;

import cardgame.Card.Suit;
import cardgame.Card.Value;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Bhavy
 */
public class CardGame {

     public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        Card[] hand = new Card[7];
        Random random = new Random();
        
        for(int i =0 ; i <hand.length;i++){
            Value value = Card.Value.values()[random.nextInt(13)];
            Suit suit =Card.Suit.values()[random.nextInt(4)];
            Card card = new Card(value,suit);
            hand[i]=card;
        }//end of for
        
        System.out.print("here are the cards in the hand");
        for(Card card:hand){
            System.out.println(card.getValue() +" "+card.getSuit());
        }
        
        //Now ask user for a card
        System.out.print("Pick a suit for your guess card");
        for(int i =0 ; i <Card.Suit.values().length;i++){
            System.out.println(Card.Suit.values()[i]);            
        }
        int suitpos = input.nextInt();
        System.out.print("Pick a value for your guess card");
        int valuepos= input.nextInt();
        
        Card userGuess = new Card(Card.Value.values()[valuepos],Card.Suit.values()[suitpos]);
        
        //now check for a match
        boolean match = false;
        for(Card card:hand){
            if(card.getValue() == userGuess.getValue()
                && card.getSuit().equals(userGuess.getSuit())){
             match =true;
             break;
            }//end of if                        
        }//end of for
        if(match)
            System.out.println("your guess is right");
        
    }
    
}