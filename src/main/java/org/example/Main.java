package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        List<Fish> fishList = new ArrayList<>();
        fishList.add(fish);
       Male male = new Male();
       male.start();
       Female female = new Female();
       female.start();
    }
}
