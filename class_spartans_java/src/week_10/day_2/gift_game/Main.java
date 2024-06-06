package week_10.day_2.gift_game;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Objects
        GiftAssigner giftAssigner = new GiftAssigner();

        // Assign Students
        giftAssigner.addStudent("A");
        giftAssigner.addStudent("B");
        giftAssigner.addStudent("C");
        giftAssigner.addStudent("D");
        giftAssigner.addStudent("E");

        // Assign Gifts
        giftAssigner.assignGifts();
        // Reveal Winners
        giftAssigner.revealWinners();

    }

}