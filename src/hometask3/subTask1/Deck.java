package hometask3.subTask1;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    public List<PlayingCard> cards;

        public Deck() {

            String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
            String[] ranks = {"six", "seven", "eight", "nine", "ten", "Jack", "Queen", "King", "Ace"};

            List<PlayingCard> allCards = new ArrayList<>();

            for (String suit : suits) {
                for (String rank : ranks) {
                    allCards.add(new PlayingCard(rank, suit));
                }
            }
            setCards(allCards);
        }

        public List<PlayingCard> getCards() {
            return cards;
        }

        public void setCards(List<PlayingCard> cards) {
            this.cards = cards;
        }

    }