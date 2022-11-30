package org.example;

import java.util.List;
import java.util.Random;
import java.util.Vector;

public class RandomGenerator {
    private static final Random random = new Random();

    public static Integer rundomNumberOfMale() {
        return random.nextInt(1, 20);
    }
    public static Integer randomNumberOfFemale() {
        return random.nextInt(1, 20);
    }
    public static Integer randomAge() {
        return random.nextInt(1, 50);
    }
    public static Fish.Gender randomGenderGen(){
        Fish.Gender[] genders = Fish.Gender.values();
        int selection = random.nextInt(Fish.Gender.values().length);
        return genders[selection];
    }
    public static Integer randomTime() {
        return random.nextInt(1, 50);
    } private Vector<Fish> fishList = new Vector<>();
}
