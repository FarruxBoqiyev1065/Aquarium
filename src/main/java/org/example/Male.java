package org.example;

import java.time.LocalDateTime;
import java.util.*;

public class Male extends Thread{

    @Override
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Fish fish = new Fish();
        if (fish.getLivingTime() > fish.getAge()){
        System.out.println(fish.getGender() + " fish with age // " +
                fish.getAge() + " // Number of fish " +
                fish.getNumberOfMale() +
                " // Period of residence " + fish.getLivingTime() + "\n ");
        if (fish.getAge() > 18){
            System.out.println("They are married and will make child");
            for (int i = 0; i < fish.getNumberOfMale(); i++){
                System.out.println(fish.getGender() + " Date of birth // " + LocalDateTime.now());
            }
        }
        }else {
            System.out.println("This Fish will born few later");
        }
    }
}
