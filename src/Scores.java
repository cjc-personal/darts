

import java.util.HashMap;


public class Scores {
    private HashMap<String, Integer> scores = new HashMap<>();




//getters


    public HashMap<String, Integer> getScores() {
        return scores;
    }

    public void setScores() {
        scores.put("MISS", 0);
        scores.put("S1", 1);
        scores.put("S2", 2);
        scores.put("S3", 3);
        scores.put("S4", 4);
        scores.put("S5", 5);
        scores.put("S6", 6);
        scores.put("S7", 7);
        scores.put("S8", 8);
        scores.put("S9", 9);
        scores.put("S10", 10);
        scores.put("S11", 11);
        scores.put("S12", 12);
        scores.put("S13", 13);
        scores.put("S14", 14);
        scores.put("S15", 15);
        scores.put("S16", 16);
        scores.put("S17", 17);
        scores.put("S18", 18);
        scores.put("S19", 19);
        scores.put("S20", 20);
        scores.put("D1", 2);
        scores.put("D2", 4);
        scores.put("D3", 6);
        scores.put("D4", 8);
        scores.put("D5", 10);
        scores.put("D6", 12);
        scores.put("D7", 14);
        scores.put("D8", 16);
        scores.put("D9", 18);
        scores.put("D10", 20);
        scores.put("D11", 22);
        scores.put("D12", 24);
        scores.put("D13", 26);
        scores.put("D14", 28);
        scores.put("D15", 30);
        scores.put("D16", 32);
        scores.put("D17", 34);
        scores.put("D18", 36);
        scores.put("D19", 38);
        scores.put("D20", 40);
        scores.put("T1", 3);
        scores.put("T2", 6);
        scores.put("T3", 9);
        scores.put("T4", 12);
        scores.put("T5", 15);
        scores.put("T6", 18);
        scores.put("T7", 21);
        scores.put("T8", 24);
        scores.put("T9", 27);
        scores.put("T10", 30);
        scores.put("T11", 33);
        scores.put("T12", 36);
        scores.put("T13", 39);
        scores.put("T14", 42);
        scores.put("T15", 45);
        scores.put("T16", 48);
        scores.put("T17", 51);
        scores.put("T18", 54);
        scores.put("T19", 57);
        scores.put("T20", 60);
        scores.put("BULLSEYE", 25); //outter bullseye
        scores.put("DBULLSEYE", 50); //inner bullseye
    }
}
