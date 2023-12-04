package lesson7.blackJack;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Player {

    private String name;
    private boolean canWin = true;

    public ArrayList<Card> hand = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public boolean isCanWin() {
        return canWin;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (canWin != player.canWin) return false;
        if (!Objects.equals(name, player.name)) return false;
        return Objects.equals(hand, player.hand);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (canWin ? 1 : 0);
        result = 31 * result + (hand != null ? hand.hashCode() : 0);
        return result;
    }

    public boolean doYouNeedMoreCards() {
        System.out.println(name + ", Ваши карты: --------------------- ");
        openHand();
        System.out.println("--------------------");
        System.out.println("Вам нужна еще карта?");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("Да")){
            return true;
        }
        return false;
    }

    public void openHand(){
        for (Card card:hand){
            System.out.println(card);
        }
    }

    public int countValueInHand(){
        int count = 0;
        for (Card card: hand){ // проходимся по всем картам в руке
            count = count + card.getValue();
        }
        return count;
    }
}
