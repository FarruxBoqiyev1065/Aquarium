package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Fish> fishList = new ArrayList<>();
        int n = RandomGenerator.randomNumber(10);
        int m = RandomGenerator.randomNumber(10);
        System.out.println("Male fish count: " + m);
        System.out.println("Female fish count: " + n);


        for (int i = 0; i < n; i++) {
            Fish female = new Fish(Fish.Gender.FEMALE);
            fishList.add(female);
        }

        for (int i = 0; i < m; i++) {
            Fish male = new Fish(Fish.Gender.MALE);
            fishList.add(male);
        }

        while (true) {
            //





        }

    }
}
