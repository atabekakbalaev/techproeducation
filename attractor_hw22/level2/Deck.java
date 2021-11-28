package attractor_hw22.level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
	private Card[] cards;

	public Deck(char[] suits, String[] values) {
		this.cards = this.generateCards(suits, values);
	}

	public Card[] getCards() {
		return this.cards;
	}
	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	// get a random card
	public Card getRandomCard() {
		int n = new Random().nextInt(52);
		Card c = this.cards[n];
		this.cards[n] = new Card(); // assigning empty card
		boolean isInDeck = checkIfCardExists(c);
		return !isInDeck ? c : new Card();
	}
	// check if the deck contains a specific card exists or not
	public boolean checkIfCardExists(Card card) {
		for (Card c : this.cards) {
			if (card.toString().equals(c.toString())) {
				return true;
			}
		}
		return false;
	}
	public void getCardFromDeck(Card card) {
		if (!this.checkIfCardExists(card)) {
			System.out.println("You cannot take this card again.");
		} else {
			System.out.println("You can take this card");
		}
		
	}
	public void putCardToDeck(Card card) {
		if (!this.checkIfCardExists(card)) {
			int i = this.getEmptyCardIndex();
			this.cards[i] = card;
			System.out.println(card + " is put back successfully.");
		} else {
			System.out.println(card + " already exists in the deck. You cannot put the same card again.");
		}
	}
	public int getEmptyCardIndex() {
		for (int i = 0; i < this.cards.length; i++) {
			if (this.cardIsEmpty(i)) {
				return i;
			}
		}
		return -1;
	}
	private boolean cardIsEmpty(int i) {
		return (new Card()).toString().equals(this.cards[i].toString()) ? true : false;
	}
	// shuffle the cards
	public void shuffle( ) {
		List<Card> c = Arrays.asList(this.cards);
		Collections.shuffle(c);
		c.toArray(this.cards);
	}
	
	public void printDeck() {
		System.out.println(Arrays.toString(this.cards));
	}

	private Card[] generateCards(char[] suits, String[] values) {
		cards = new Card[values.length * suits.length];
		int counter = 0;
		for (String value : values) {
			for (char suit : suits) {
				Card card = new Card(suit, value);
				cards[counter++] = card;
			}
		}
		return cards;

	}
}
