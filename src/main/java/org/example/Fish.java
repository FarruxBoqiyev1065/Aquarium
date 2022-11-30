package org.example;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Fish {
    private int N;
    private int M;
    private int age;
    private Gender gender;
    private int livingTime;

    public Fish() {
        this.N = RandomGenerator.rundomNumberOfMale();
        this.M = RandomGenerator.randomNumberOfFemale();
        this.age = RandomGenerator.randomAge();
        this.gender = RandomGenerator.randomGenderGen();
        this.livingTime = RandomGenerator.randomTime();
    }

    public int getAge() {
        return age;
    }

    public int getLivingTime() {
        return livingTime;
    }

    public Gender getGender() {
        return gender;
    }

    public int getNumberOfMale() {
        return N;
    }

    public int getNumberOfFemale() {
        return M;
    }

    public int getNumberOfMaleFish() {
        return N;
    }

    public enum Gender {
        MALE, FEMALE;
    }
}
