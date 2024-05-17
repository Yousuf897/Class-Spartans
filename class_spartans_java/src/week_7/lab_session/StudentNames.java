package week_7.lab_session;

import java.util.Random;

public class StudentNames {

    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();

        String[] studentNames = {
                "mathias", "mahdi", "farhad", "Heala", "saqib",
                "wahidullah", "saliman", "mehwand", "abdul samad",
                "fazil omer", "rostam", "amena", "mansoor", "mostepha",
                "crystal", "darya", "hamed", "khatira", "hasibullah",
                "wasim", "safiullah", "maryam", "maya", "zubaida"
        };

        int randomIndexByComputer = random.nextInt(studentNames.length);
        System.out.println("Student Name will be reveal in: ");
        for ( int timer = 5; timer >= 1; timer--) {
            System.out.println("Ready in: " + timer );
            Thread.sleep(1000);
        }

        System.out.println("Lucky Student Name: " + studentNames[randomIndexByComputer] );

    }

}
