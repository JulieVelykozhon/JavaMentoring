package hometask3.subTask1;

public class Main1 {
    public static void main(String[] args) {
      Deck deck = new Deck();
      deck.createDeckOfCards();
     PlayingCard nameCard =  deck.drawCard();
        System.out.println("Card rank:" + nameCard.getRank());
        System.out.println("Card suit:" + nameCard.getSuit());
   
    }
}
