package com.company;

public class Main {

    public static void main(String[] args) {
        isCatPlaying(true, 10);
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ((summer && (temperature >= 25 && temperature <= 45)) || (temperature >= 25 && temperature <= 35)) {
            System.out.println("Cat is playing");
            return true;
        }
        System.out.println("Cat is not playing");
        return false;
    }
}
