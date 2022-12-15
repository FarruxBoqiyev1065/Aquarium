package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<Fish> fishList = new ArrayList<>();
        int n = 1;

        System.out.println("Male fish count: " + n);
        System.out.println("Female fish count: " + n);


        for (int i = 0; i < n; i++) {
            Fish male = new Fish(Fish.Gender.MALE, "Ota");
            fishList.add(male);
            male.start();
            Fish female = new Fish(Fish.Gender.FEMALE, "Ona");
            fishList.add(female);
            female.start();
        }

        Collections.shuffle(fishList);

        int son = 1;

        while (!fishList.isEmpty()) {

            String childName = "bola"+ son;

            System.out.println("========= ========= =========");
            System.out.println("Count of fishes: " + fishList.size());
            int size = fishList.size();

            int ind1 = RandomGenerator.randomNumber(size);
            int ind2 = RandomGenerator.randomNumber(size);

            Fish fish1 = fishList.get(ind1);
            Fish fish2 = fishList.get(ind2);
            System.out.print("To show information about fish: ");
               System.out.print(" ( Name: " + fish1.getFishName() +", age: " + fish1.getAge() + ", gender: " + fish1.getGender() + "), ");
               System.out.println(" ( Name: " + fish2.getFishName() +", age: " + fish2.getAge() + ", gender: " + fish2.getGender() + ")");

            if (fish1.getAge() > 18 && fish2.getAge() > 18) {
                if (fish1.getGender() != fish2.getGender()) {
                    int childCount = 1;
                        Fish child = new Fish(childName);
                        child.setAge(0);
                        fishList.add(child);
                        child.start();
                        son++;
                        System.out.println("Child count: " + childCount + ", Name: " + childName + ", age: " + child.getAge() + ", gender: " + child.getGender());
                } else {
                    System.out.println("Gotten fishes is the same gender");
                }
            } else {
                System.out.println("One of fishes or both of them is too young!");
            }

            List<Fish> newFishList = new ArrayList<>();
            for (Fish fish : fishList) {
                if (!fish.isDead()) {
                    newFishList.add(fish);
                } if(fish.getAge() == 50) {
                    System.out.println("Fish is dead (age: " + fish.getAge() + ", gender: " + fish.getGender() + ")");
                    newFishList.remove(fish);
                }
            }

            fishList = newFishList;
            Thread.sleep(2_000);
        }
    }
}
