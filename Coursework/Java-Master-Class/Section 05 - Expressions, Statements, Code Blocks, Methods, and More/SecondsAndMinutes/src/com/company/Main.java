package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(15000));
    }

    public static String getDurationString(int mins, int secs) {
        if (mins >= 0 && (secs >= 0 && secs <= 59)) {
            int hours = mins / 60;
            int leftMins = mins % 60;
            String returnString = "Result: " + hours + " hours " + leftMins + " mins " + secs + " secs";
            return returnString;
        }
        return "Invalid value";
    }

    public static String getDurationString(int secs) {
        if (secs >= 0) {
            int mins = secs / 60;
            int newSecs = secs % 60;
            String result = getDurationString(mins, newSecs);
            return result;
        }
        return "Invalid value";
    }
}
