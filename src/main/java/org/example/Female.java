package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Female extends Thread{

    @Override
    public void run() {
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Fish fish = new Fish();
        if (fish.getLivingTime() > fish.getAge()){
            System.out.println(fish.getGender() + " fish with age // " +
                    fish.getAge() + " // Number of fish " +
                    //todo
                    fish.getNumberOfFemale() +
                    " // Period of residence " + fish.getLivingTime() + "\n ");
            if (fish.getAge() > 18){
                System.out.println("They are married and will make child");
                //todo
                for (int i = 0; i < fish.getNumberOfFemale(); i++){
                    System.out.println(fish.getGender() + " Date of birth // " + LocalDateTime.now());
                }


            }
        }else {

            //todo
            System.out.println("This Fish will born few later");
        }
    }
}
