package org.example.utils;

public class Helper implements Helpers {
    @Override
    public int randomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    @Override
    public void sleepForMilliSeconds(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}