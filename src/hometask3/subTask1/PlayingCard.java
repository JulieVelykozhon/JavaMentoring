package hometask3.subTask1;

public class PlayingCard {
    private String rank;
    private String suit;

    public PlayingCard(String ranks, String suits) {
        this.rank= ranks;
        this.suit = suits;

    }

    @Override
    public String toString() {
        return "Card{" +
                "rank='" + rank + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }
}