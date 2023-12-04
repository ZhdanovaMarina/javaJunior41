package lesson7.blackJack;

public class Dealer extends Player {
    @Override
    public boolean doYouNeedMoreCards() {
        if (countValueInHand() < 17){
            return true;
        }
        return false;
    }
}
