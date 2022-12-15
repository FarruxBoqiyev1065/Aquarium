package org.example;

import java.util.Random;

public class RandomGenerator {
    private static final Random random = new Random();


    public static Integer randomNumber(int max) {
        return randomNumber(0, max);
    }

    public static Integer randomNumber(int min, int max) {
        if(max <= min) return min;
        return random.nextInt(min, max);
    }

    public static Fish.Gender randomGenderGen() {
        Fish.Gender[] genders = Fish.Gender.values();
        int selection = random.nextInt(Fish.Gender.values().length);
        return genders[selection];
    }
}
