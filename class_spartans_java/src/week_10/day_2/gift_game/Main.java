package week_10.day_2.gift_game;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Objects
        GiftAssigner giftAssigner = new GiftAssigner();

        // Assign Students
        giftAssigner.addStudent("Heala Mau");
        giftAssigner.addStudent("Zia");
        giftAssigner.addStudent("Ali");
        giftAssigner.addStudent("Saif");
        giftAssigner.addStudent("Amena Baha");

        // Assign Gifts
        giftAssigner.assignGifts();
        // Reveal Winners
        giftAssigner.revealWinners();

    }

}