package org.example;

public class Fish extends Thread {

    private int age;
    private final Gender gender;
    private final int livingTime;

    public Fish() {
        this.age = 0;
        this.gender = RandomGenerator.randomGenderGen();
        this.livingTime = RandomGenerator.randomNumber(50);
    }


    public Fish(Gender gender) {
        this.age = 0;
        this.gender = gender;
        this.livingTime = RandomGenerator.randomNumber(50);
    }

    @Override
    public void run() {
        while (livingTime >= age) {
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                break; // ignore
            }
            age++;
        }
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

    public enum Gender {
        MALE, FEMALE
    }
}
