package edu.bsu.cs222;

public class SillyMethods {
    public boolean didGuess42(int i) {
        return i == 42;
    }

    public String countTo(int i) {
        String countToNumber = "";
        if (i == 10) {
            countToNumber = "0 1 2 3 4 5 6 7 8 9 10";

        }if (i == 15){
            countToNumber = "0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15";
        }
        return countToNumber;
    }
}


