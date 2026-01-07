package com.example.lab_participation_exercise;

import java.util.Date;

public class Sad extends Mood{
    public Sad(String name){
        super(name);
    }
    public Sad(String name, Date date){
        super(name, date);
    }

    @Override
    public String mood() {
        return "sad";
    }
}
