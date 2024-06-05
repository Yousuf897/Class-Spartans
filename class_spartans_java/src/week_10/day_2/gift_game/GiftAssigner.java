package week_10.day_2.gift_game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GiftAssigner {

    // Prepare the location to store information ( student names and gifts )
    private final List<Student> students;
    private final List<String> gifts;

    // Constructor
    public GiftAssigner() {
        students = new ArrayList<>();
        gifts = new ArrayList<>();
        gifts.add("10 questions for weekend");
        gifts.add("20 questions for weekend");
        gifts.add("Java Book");
        gifts.add("T-Shirt");
        gifts.add("Special Pen");
        gifts.add("ISTQB Book");
        gifts.add("Stickers Set");
        gifts.add("Glass");
    }

    // Method to add Student to list
    public void addStudent(String name) {
        students.add(new Student(name));
    }

    // Method to assign gift
    public void assignGifts() {
        if (students.size() < 5) {
            System.out.println("Not enough students to assign 5 gifts.");
            return;
        }

        Collections.shuffle(gifts);
        List<Student> shuffledStudents = new ArrayList<>(students);
        Collections.shuffle(shuffledStudents);

        for (int i = 0; i < 5; i++) {
            shuffledStudents.get(i).setGift(gifts.get(i));
        }
    }

    // Method to reveal the winners
    public void revealWinners() throws InterruptedException {
        if (students.size() < 5) {
            System.out.println("Not enough students to reveal top 5 prizes.");
            return;
        }

        countdownTimer(5);

        System.out.println(" * * * * * Winners * * * * * ");
        revealWinner("First Prize", 0);
        revealWinner("Second Prize", 1);
        revealWinner("Third Prize", 2);
        revealWinner("Fourth Prize", 3);
        revealWinner("Fifth Prize", 4);
    }

    // Method to create a timer starting from 5 to 1
    private void countdownTimer(int seconds) throws InterruptedException {
        System.out.println("Revealing Winners in:");
        for (int timer = seconds; timer >= 1; timer--) {
            Thread.sleep(1000);
            System.out.print(timer + " ");
        }
        System.out.println();
    }

    // Method that reveals the winners and their gifts
    private void revealWinner(String prize, int index) {
        System.out.println(prize + ": " + students.get(index).getName() + " with gift: " + students.get(index).getGift());
    }
}
