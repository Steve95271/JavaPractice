package A06_StagePractice02DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * This V2 version will deal cards with order(from small to large).
 */
public class PokerGameV2 {
    static HashMap<Integer, String> cards = new HashMap<>();
    static ArrayList<Integer> cardCorrespondKeys = new ArrayList<>();

    static {
        String[] suits = {"Diamonds ", "Clubs ", "Hearts ", "Spades "};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k", "A", "2"};

        //variable for card order
        int cardOrder = 1;

        //Joining suits and numbers
        for (String number : numbers) {
            for (String suit: suits){
                cards.put(cardOrder, suit + number);
                cardCorrespondKeys.add(cardOrder);
                cardOrder++;
            }
        }
        cardCorrespondKeys.add(cardOrder);

        //Add two jokers
        cards.put(cardOrder, "Color Joker");
        cardOrder++;
        cardCorrespondKeys.add(cardOrder);
        cards.put(cardOrder, "Grey Joker");


    }

    public PokerGameV2() {
        //Shuffle cards
        Collections.shuffle(cardCorrespondKeys);

        //创建四个tree set对象储存扑克牌的Key
        TreeSet<Integer> holeCardsKeys = new TreeSet<>();
        TreeSet<Integer> playerOneKeys = new TreeSet<>();
        TreeSet<Integer> playerTwoKeys = new TreeSet<>();
        TreeSet<Integer> playerThreeKeys = new TreeSet<>();

        //分配牌
        for (int i = 0; i < cardCorrespondKeys.size(); i++) {
            int cardCorrespondKey = cardCorrespondKeys.get(i);

            if (i <= 2) {
                holeCardsKeys.add(cardCorrespondKey);
            } else if (i % 3 == 0) {
                playerOneKeys.add(cardCorrespondKey);
            } else if (i % 3 == 1) {
                playerTwoKeys.add(cardCorrespondKey);
            } else {
                playerThreeKeys.add(cardCorrespondKey);
            }
        }

        ArrayList<String> holeCards = getCards(holeCardsKeys);
        ArrayList<String> playerOneCards = getCards(playerOneKeys);
        ArrayList<String> playerTwoCards = getCards(playerTwoKeys);
        ArrayList<String> playerThreeCards = getCards(playerThreeKeys);

        System.out.println("Hole cards: " + holeCards);
        System.out.println("Player one: " + playerOneCards);
        System.out.println("Player two: " + playerTwoCards);
        System.out.println("Player three: " + playerThreeCards);

    }

    public ArrayList<String> getCards(TreeSet<Integer> keys) {
        ArrayList<String> holeOrPlayerCards = new ArrayList<>();

        for (Integer key : keys) {
            holeOrPlayerCards.add(cards.get(key));
        }

        return holeOrPlayerCards;
    }
}
