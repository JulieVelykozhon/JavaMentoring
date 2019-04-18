package hometask3.subTask1;
public class MainPlayingCards {
    public static void main(String[] args) {

        System.out.println("Deck of cards:");
        Deck deck = new Deck();
        deck.getCards().forEach(c -> System.out.println(c.toString()));
    }
}
