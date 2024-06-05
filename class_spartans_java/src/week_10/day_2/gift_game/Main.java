package week_10.day_2.gift_game;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Objects
        GiftAssigner giftAssigner = new GiftAssigner();

        // Assign Students
        giftAssigner.addStudent("");
        giftAssigner.addStudent("");
        giftAssigner.addStudent("");
        giftAssigner.addStudent("");
        giftAssigner.addStudent("");

        // Assign Gifts
        giftAssigner.assignGifts();
        // Reveal Winners
        giftAssigner.revealWinners();

    }

}