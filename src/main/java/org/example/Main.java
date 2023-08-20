package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ChineseEngine dongCoTrungQuoc = new ChineseEngine();
        JapaneseEngine dongCoNhatBan = new JapaneseEngine();
        MotorBike xeMay = new MotorBike("VF1", dongCoNhatBan);
        xeMay.getEngine().EngineStart();
    }
}