package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private Suit[] suits;
    private Rank[] ranks;
    private int howManyDecks;
    private List<Card> Cards;
    private int size;


public Deck(int howManyDecks){
    this.howManyDecks=howManyDecks;
    if(howManyDecks==0){
        System.out.println("Error: howManyDecks<=0");
        throw  new IllegalArgumentException();
    }
    this.size=52*howManyDecks;

    for (Rank rank : ranks) {
        for (Suit suit : suits) {
            Card a = new Card(suit, rank);
            Cards.add(a);
        }

    }



}


public void shuffle() {
    Collections.shuffle(Cards);
    }

public List<Card> getCards() {
        return Cards;
    }
}


