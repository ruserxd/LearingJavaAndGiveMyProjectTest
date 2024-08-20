package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LifeTime> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            nums.add(new LifeTime(i));
        }

        nums.stream().map(LifeTime::getTime).forEach(time -> {
            System.out.println(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted, Failed to complete operation");
            }
        });
        System.out.println("How Pathetic you are!");
    }
}