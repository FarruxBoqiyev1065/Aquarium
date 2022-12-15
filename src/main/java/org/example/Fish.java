package org.example;

public class Fish extends Thread {

    private int age;

    private String fishName;

    private final Gender gender;

    private final int livingTime;

    public Fish(String fishName) {
        this.age = 0;
        this.gender = RandomGenerator.randomGenderGen();
        this.livingTime = 50;
        this.fishName = fishName;
    }

    public Fish(Gender gender, String fishName) {
        this.age = 0;
        this.gender = gender;
        this.livingTime = 50;
        this.fishName = fishName;
    }

    @Override
    public void run() {
        while (livingTime > age) {
            try {
                Thread.sleep(2_000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
            age++;
        }
    }

    public boolean isDead(){
        return  (livingTime < age );
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFishName() {
        return fishName;
    }

    public void setFishName(String fishName) {
        this.fishName = fishName;
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
