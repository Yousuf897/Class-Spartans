package week_10.lab_session;

import java.util.Random;

public class RandomPractice {

    public static void main(String[] args) {

        String[] studentNames = {"John", "Eric", "Tony", "Hamed", "Don"};
        Random random = new Random();
        // int randomIndex = random.nextInt( ( studentNames.length - 1 - 0 + 1 ) + 0 );
        int randomIndex = random.nextInt(studentNames.length);
        // (max – min + 1) + min
        System.out.println( studentNames[randomIndex] );

    }

}
