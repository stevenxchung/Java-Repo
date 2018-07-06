package com.company;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2050);
        printMegaBytesAndKiloBytes(-1);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaToKilo = 1024;
            int mega = kiloBytes / megaToKilo;
            int remainder = kiloBytes % megaToKilo;
            System.out.println(kiloBytes + " KB = " + mega + " MB and " + remainder + " KB");
        }
    }
}
