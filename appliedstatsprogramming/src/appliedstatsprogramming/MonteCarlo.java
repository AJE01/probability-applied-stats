package appliedstatsprogramming;

import java.util.List;
//https://www.youtube.com/watch?v=QvIKDImmEhQ
//https://www.codeproject.com/Articles/38821/Make-a-poker-hand-evalutator-in-Java
//https://www.cs.princeton.edu/courses/archive/fall14/cos126/docs/PokerHand.java.html

public class MonteCarlo {

	    public static void main(String[] args) {
	        HandEvaluator handEvaluator = new HandEvaluator();
	        int numHands = 10000;
	        int handSize = 5;

	        int highCard = 0;
	        int pair = 0;
	        int threeOfAKind = 0;
	        int straight = 0;
	        int flush = 0;
	        int fullHouse = 0;
	        int fourOfAKind = 0;
	        int straightFlush = 0;
	        int royalFlush = 0;

	        for (int i = 1; i < handSize; i++) {
	            List<Card> hand = handEvaluator.drawHand(handSize);

	            if (handEvaluator.isRoyalFlush()) {
	                royalFlush++;
	            } else if (handEvaluator.isStraightFlush()) {
	                straightFlush++;
	            } else if (handEvaluator.isFourOfAKind()) {
	                fourOfAKind++;
	            } else if (handEvaluator.isFullHouse()) {
	                fullHouse++;
	            } else if (handEvaluator.isFlush()) {
	                flush++;
	            } else if (handEvaluator.isStraight()) {
	                straight++;
	            } else if (handEvaluator.isThreeOfAKind()) {
	                threeOfAKind++;
	            } else if (handEvaluator.isPair()) {
	                pair++;
	            } else {
	                highCard++;
	            }

	            handEvaluator.resetDeck();
	        }

	        System.out.println(("High Card: " + (double) highCard / handSize)+"%");
	        System.out.println(("Pair: " + (double) pair / handSize)+"%");
	        System.out.println(("Three of a Kind: " + (double) threeOfAKind / numHands)+"%");
	        System.out.println(("Straight: " + (double) straight / numHands)+"%");
	        System.out.println(("Flush: " + (double) flush / numHands)+"%");
	        System.out.println(("Full House: " + (double) fullHouse / numHands)+"%");
	        System.out.println(("Four of a Kind: " + (double) fourOfAKind / numHands)+"%");
	        System.out.println(("Straight Flush: " + (double) straightFlush / numHands)+"%");
	        System.out.println(("Royal Flush: " + (double) royalFlush / numHands)+ "%");
	    }
}
