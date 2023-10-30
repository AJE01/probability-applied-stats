package appliedstatsprogramming;
import java.util.*;

class HandEvaluator {

	private List<Card> deck;
    private List<Card> hand;

    public HandEvaluator() {
        deck = new ArrayList<>();
        hand = new ArrayList<>();

        //filling deck
        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
        String[] values = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};

        for (String suit : suits) {
            for (String value : values) {
                deck.add(new Card(suit, value));
            }
        }

        // Shuffle deck
        Collections.shuffle(deck);
    }

    public Card drawCard() {
        if (!deck.isEmpty()) {
            return deck.remove(deck.size() - 1);
        }
        return null;
    }

    public List<Card> drawHand(int handSize) {
        hand.clear();
        for (int i = 0; i < handSize; i++) {
            Card card = drawCard();
            if (card != null) {
                hand.add(card);
            }
        }
        return hand;
    }
    public boolean isHighCard() {
        return true;
    }
    public boolean isPair() {
        return true;
    }
    public boolean isThreeOfAKind() {
        return true;
    }
    public boolean isStraight() {
        return true;
    }
    public boolean isFlush() {
        return true;
    }
    public boolean isFullHouse() {
        return true;
    }
    public boolean isFourOfAKind() {
        return true;
    }
    public boolean isStraightFlush() {
        return true;
    }
    public boolean isRoyalFlush() {
        return true;
    }

    public void resetDeck() {
        deck.addAll(hand);
        hand.clear();
        Collections.shuffle(deck);
    }
}
