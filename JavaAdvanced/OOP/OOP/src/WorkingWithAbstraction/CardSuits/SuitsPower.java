package WorkingWithAbstraction.CardSuits;

public enum SuitsPower {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int SuitsPowerValue;

    SuitsPower(int suitsPowerValue){
        this.SuitsPowerValue = suitsPowerValue;
    }

    public int getPower() {
        return SuitsPowerValue;
    }

}
