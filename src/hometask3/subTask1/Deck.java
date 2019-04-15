package hometask3.subTask1;

public class Deck {
    private PlayingCard deck[] = new PlayingCard[56];
    int deckIndexValue = 0;
    public PlayingCard[] getDeck() {
        return deck;
    }

    public void setDeck(PlayingCard[] deck) {
        this.deck = deck;
    }
    public void createDeckOfCards (){
        String tempSuit;
        int counter = 0;
        for(int i = 0; i < 4; i++){

            if (i == 0){
                tempSuit = "Hearts";
            }
            else if (i == 1) {
                tempSuit = "Diamonds";
            }
            else if (i == 2) {
                tempSuit = "Clubs";
            }
            else {
                tempSuit = "Spades";
            }

            for (Integer j = 6; j < 15; j++){
                PlayingCard card1 = new PlayingCard();
                card1.setSuit(tempSuit);
                if (j >= 6 && j <= 10){
                    card1.setRank(j.toString());
                }

                else if (j == 11) {
                    tempSuit = "Jack";
                }
                else if (j == 12) {
                    tempSuit = "Queen";
                }
                else if (j == 13) {
                    tempSuit = "King";
                }
                else {
                    tempSuit = "Ace";
                }

             deck [counter] = card1;
                counter++;
            }

        }

    }
      public PlayingCard drawCard () {
          return  deck [deckIndexValue++];


      }
}
