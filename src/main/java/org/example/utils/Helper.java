package org.example.utils;

public class Helper implements Helpers{
    @Override
    public int randomInt(){
        return (int) Math.round(Math.random() * 100); }
}