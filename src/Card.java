public abstract class Card {
    String description;
    public Card(String description){
        this.description = description;
    }

    public abstract void cardEffect();
}
