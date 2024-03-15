package A06_StagePractice02DouDiZhu;

import java.util.*;

public class PokerGameV1 {
    static ArrayList<String> cards = new ArrayList<>();

    //卡牌只需要加载一次，而且是需要被全局使用的变量
    //因此使用静态代码块来加载卡牌
    static{
        String[] suits = {"Diamonds ", "Clubs ", "Hearts ", "Spades "};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k", "A", "2"};

        //Joining suit and number that make it become cards
        for (String suit : suits) {
            for (String number : numbers) {
                cards.add(suit + number);
            }
        }

        cards.add("Color Joker");
        cards.add("Grey Joker");
    }

    public PokerGameV1(){
        //洗牌
        Collections.shuffle(cards);
        
        //创建被发牌的对象
        ArrayList<String> holeCard = new ArrayList<>();
        ArrayList<String> playerNoOne = new ArrayList<>();
        ArrayList<String> playerNoTwo = new ArrayList<>();
        ArrayList<String> playerNoThree = new ArrayList<>();
        
        //发牌
        for (int i = 0; i < cards.size(); i++) {
            String card = cards.get(i);

            if (i <= 2){
                holeCard.add(card);
            } else if (i % 3 == 0) {
                playerNoOne.add(card);
            } else if (i % 3 == 1) {
                playerNoTwo.add(card);
            } else {
                playerNoThree.add(card);
            }
        }

        //使用双列集合把牌分配到玩家手上
        HashMap<String , ArrayList<String>> playerAndCards = new HashMap<>();
        playerAndCards.put("Alice", playerNoOne);
        playerAndCards.put("Celina", playerNoThree);
        playerAndCards.put("Bob", playerNoTwo);


        Set<Map.Entry<String , ArrayList<String>>> playerAndCardsEntries = new HashSet<>();
        playerAndCardsEntries = playerAndCards.entrySet();

        for (Map.Entry<String, ArrayList<String>> playerAndCardsEntry : playerAndCardsEntries) {
            System.out.println(playerAndCardsEntry);
        }

        System.out.println(holeCard);
        
    }

    public void checkCards(String name, ArrayList<String> cards) {

    }

}
