package WorkingWithAbstraction.CardSuits;

public class CardTotalPower {
    private int power;

    public CardTotalPower(CardPowers card, SuitsPower suit) {
        this.power = card.getPower()+suit.getPower();
    }
    public int totalPower(){
        return this.power;
    }
}
